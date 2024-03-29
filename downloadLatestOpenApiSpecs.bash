#!/bin/bash

#
# Copyright (c) 2021. wink.travel. All rights Reserved.
# Responsibility:
# Downloads all Open API spec files from
#

retrieveOpenApiSpecFunction() {
  url=$1
  location=$2

  echo "Health check for: $url..."

  contentType=$(curl -s -I ${url} | grep -i "^Content-Type:")

  if [[ $contentType == *"application/json"* ]]; then
    echo "It's OK!"
  else
    echo "Invalid url. Returned: $contentType"
    exit 1
  fi

  echo "Copying the contents of the URL to $location"

  curl ${url} >$location

  echo "Download of $url complete"
}

# whether to grab the files from staging or production servers
env=$1

echo "Download latest deployed Open API specs..."
winkUrl="https://api.wink.travel"
integrationsUrl="https://integrations.wink.travel"

if [[ $env == *"dev"* ]]; then
  winkUrl="https://dev-api.wink.travel:8443"
  integrationsUrl="https://dev-integrations.wink.travel:8445"
fi

if [[ $env == *"staging"* ]]; then
  winkUrl="https://staging-api.wink.travel"
  integrationsUrl="https://staging-integrations.wink.travel"
fi

echo "Grabbing Analytics spec..."
analyticsUrl="$winkUrl/v3/api-docs/analytics"
analyticsSpecLocation="./analytics/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $analyticsUrl $analyticsSpecLocation

echo "Grabbing Affiliate spec..."
affiliateUrl="$winkUrl/v3/api-docs/affiliate"
affiliateSpecLocation="./affiliate/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateUrl $affiliateSpecLocation

echo "Grabbing Booking spec..."
bookingUrl="$winkUrl/v3/api-docs/booking"
bookingSpecLocation="./booking/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $bookingUrl $bookingSpecLocation

echo "Grabbing Channel Manager spec..."
channelManagerUrl="$integrationsUrl/v3/api-docs/channel-manager"
channelManagerSpecLocation="./channel-manager/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $channelManagerUrl $channelManagerSpecLocation

echo "Grabbing Extranet spec..."
extranetUrl="$winkUrl/v3/api-docs/extranet"
extranetSpecLocation="./extranet/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetUrl $extranetSpecLocation

echo "Grabbing Inventory spec..."
inventoryUrl="$winkUrl/v3/api-docs/inventory"
inventorySpecLocation="./inventory/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $inventoryUrl $inventorySpecLocation

echo "Grabbing Lookup spec..."
lookupUrl="$winkUrl/v3/api-docs/lookup"
lookupSpecLocation="./lookup/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $lookupUrl $lookupSpecLocation

echo "Grabbing Reference spec..."
referenceUrl="$winkUrl/v3/api-docs/reference"
referenceSpecLocation="./reference/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $referenceUrl $referenceSpecLocation

STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Download SUCCESS. Exit code: $STATUS"
