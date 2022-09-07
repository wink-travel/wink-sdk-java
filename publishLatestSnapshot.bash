#!/bin/bash

#
# Copyright (c) 2021. wink.travel. All rights Reserved.
#

echo "Publishing wink-sdk-java SNAPSHOT..."

./downloadLatestOpenApiSpecs.bash staging

# grab the latest platform version from one of the new open api spec files
newVersion=`jq -r '.info.version' ./affiliate-sdk-java/src/main/resources/openapi-spec.json`

echo "Setting the next snapshot version to $newVersion"
mvn versions:set -DnewVersion=$newVersion -DgenerateBackupPoms=false

git commit -a -m ":bookmark: build: Updated Open API files"

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

# Deprecated - Moved this to build server
#echo "Pushing snapshot artifacts to Sonatype..."
#mvn deploy -Psonatype-oss-release

echo "Publishing wink-sdk-java SNAPSHOT SUCCESS"
