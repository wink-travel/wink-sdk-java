#!/bin/bash

#
# Copyright (c) 2021. Traveliko PTE.LTD. All rights Reserved.
#

echo "Releasing wink-sdk-java..."

echo "Cleaning artifacts..."
mvn clean

echo "Sync-ing remote master with local"
git checkout master
git pull

git checkout develop
mvn versions:set -DnewVersion="$(npx git-changelog-command-line --print-next-version)" -DnextSnapshot=true -DgenerateBackupPoms=false
git commit -a -m ":bookmark: build: Committing updated pom.xml files with semantic versioning using Conventional Commits."

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

git checkout develop

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

echo "Release SUCCESS"
