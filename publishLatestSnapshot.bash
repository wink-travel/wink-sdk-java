#!/bin/bash

#
# Copyright (c) 2021. wink.travel. All rights Reserved.
#

echo "Publishing wink-sdk-java SNAPSHOT..."

./downloadLatestOpenApiSpecs.bash staging

echo "Building artifacts..."
mvn clean compile
STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

# grab the latest platform version from one of the new open api spec files
newVersion=`jq '.info.version' ./affiliate-sdk-java/src/main/resources/openapi-spec.json`

echo "Setting the next snapshot version to $newVersion"
mvn versions:set -DnewVersion=$newVersion -DgenerateBackupPoms=false

git commit -a -m ":bookmark: build: Updated Open API files"

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

echo "Pushing snapshot artifacts to Sonatype..."
mvn deploy -Psonatype-oss-release

echo "Publishing wink-sdk-java SNAPSHOT SUCCESS"
