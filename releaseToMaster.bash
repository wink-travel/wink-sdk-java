#!/bin/bash

#
# Copyright (c) 2021. wink.travel. All rights Reserved.
#

echo "Releasing wink-sdk-java..."

echo "Cleaning artifacts..."
mvn clean compile
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Sync-ing remote master with local"
git checkout master
git pull

git checkout develop
newVersion=`npx git-changelog-command-line --print-next-version --major-version-pattern BREAKING --minor-version-pattern feat`
echo "New semantic version using Conventional Commits: $newVersion"

mvn versions:set -DnewVersion="$newVersion" -DnextSnapshot=true -DgenerateBackupPoms=false
git commit -a -m ":bookmark: build: Committing updated pom.xml files."

echo "Starting release process..."

mvn -B gitflow:release-start -DskipTestProject=true
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Updating CHANGELOG.md..."
mvn git-changelog-maven-plugin:git-changelog
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

git commit -a -m ":memo: chore: Committing updated CHANGELOG.md"

mvn -B gitflow:release-finish -DskipTestProject=true
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Release complete. Finishing up..."

echo "Pushing master to origin"
git checkout master
git push origin master:refs/heads/master

echo "Pushing release artifacts to Sonatype..."
mvn deploy -Psonatype-oss-release

git checkout develop

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

echo "Pushing snapshot artifacts to Sonatype..."
mvn deploy -Psonatype-oss-release

echo "Release SUCCESS"
