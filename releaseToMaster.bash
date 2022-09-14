#!/bin/bash

#
# Copyright (c) 2021. wink.travel. All rights Reserved.
#

echo "Releasing wink-sdk-java..."

echo "Sync-ing remote master with local"
git checkout master
git pull

git checkout develop

# grab latest spec files from production servers
./downloadLatestOpenApiSpecs.bash

# grab the latest platform version from one of the new open api spec files
newVersion=`jq -r '.info.version' ./affiliate-sdk-java/src/main/resources/openapi-spec.json`

echo "Setting the next snapshot version to $newVersion"
mvn versions:set -DnewVersion="$newVersion-SNAPSHOT" -DgenerateBackupPoms=false

git commit -a -m ":bookmark: build: Updated Open API files"

echo "Starting release process..."

mvn -B gitflow:release-start gitflow:release-finish -DskipTestProject=true
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Release complete. Finishing up..."

echo "Pushing master to origin"
git checkout master

echo "Updating CHANGELOG.md..."
mvn git-changelog-maven-plugin:git-changelog
git commit -a -m ":memo: doc: Updated CHANGELOG.md..."

git push origin master:refs/heads/master

echo "Creating GitHub release..."
gh release create v$newVersion --notes "See CHANGELOG.md for release notes" --target master

#echo "Pushing release artifacts to Sonatype..."
#mvn deploy -Psonatype-oss-release

git checkout develop

echo "Merging CHANGELOG.md from master..."
git merge master --no-edit -m ":twisted_rightwards_arrows: doc: merged CHANGELOG.md from master into develop branch" --strategy-option theirs

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

# Deprecated - Moved this to build server
#echo "Pushing snapshot artifacts to Sonatype..."
#mvn deploy -Psonatype-oss-release

echo "Release SUCCESS"
