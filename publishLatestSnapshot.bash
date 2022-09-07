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

git commit -a -m ":bookmark: build: Updated Open API files"

echo "Pushing develop to origin"
git push origin develop:refs/heads/develop

echo "Pushing snapshot artifacts to Sonatype..."
mvn deploy -Psonatype-oss-release

echo "Publishing wink-sdk-java SNAPSHOT SUCCESS"
