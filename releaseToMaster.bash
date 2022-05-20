#!/bin/bash

#
# Copyright (c) 2021. Traveliko PTE.LTD. All rights Reserved.
#

echo "Testing and releasing module..."

echo "Starting fresh..."
mvn clean

#echo "Testing first. If it fails we will not continue with the release."
#mvn integration-test verify -Plocal
#STATUS=$?
#if [ $STATUS -ne 0 ]; then
#  echo "Something went wrong on line: ${BASH_LINENO[*]}"
#  exit 1
#fi

echo "Sync-ing remote master with local"
git checkout master
git pull

git checkout develop
echo "Starting release process. It's about to get real!!"

mvn -B gitflow:release-start gitflow:release-finish -DskipTestProject=true
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Checking out master branch"
git checkout master

echo "Updating CHANGELOG.md..."
mvn git-changelog-maven-plugin:git-changelog
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

git commit -a -m "Committing updated CHANGELOG.md to master branch"
git push origin master:refs/heads/master

echo "Going back to develop branch"
git checkout develop

git rebase master
git commit -a -m "Finalizing release on develop branch"
git push origin develop:refs/heads/develop

echo "Testing and releasing module complete"
