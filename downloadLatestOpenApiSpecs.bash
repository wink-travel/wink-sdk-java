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
tripPayUrl="https://api.trippay.io"

if [[ $env == *"staging"* ]]; then
  winkUrl="https://staging-api.wink.travel"
  integrationsUrl="https://staging-integrations.wink.travel"
  tripPayUrl="https://staging-api.trippay.io"
fi

echo "Grabbing Affiliate spec..."
affiliateUrl="$winkUrl/v3/api-docs/affiliate"
affiliateSpecLocation="./affiliate-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateUrl $affiliateSpecLocation

echo "Grabbing Booking Engine spec..."
bookingEngineUrl="$winkUrl/v3/api-docs/booking-engine"
bookingEngineSpecLocation="./booking-engine-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $bookingEngineUrl $bookingEngineSpecLocation

echo "Grabbing Extranet spec..."
extranetUrl="$winkUrl/v3/api-docs/extranet"
extranetSpecLocation="./extranet-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetUrl $extranetSpecLocation

echo "Grabbing Channel Manager spec..."
channelManagerUrl="$integrationsUrl/v3/api-docs/channel-manager"
channelManagerSpecLocation="./channel-manager-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $channelManagerUrl $channelManagerSpecLocation

echo "Grabbing Payment spec..."
paymentUrl="$tripPayUrl/v3/api-docs/contract"
paymentSpecLocation="./payment-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $paymentUrl $paymentSpecLocation

echo "Grabbing Payment Acquiring spec..."
paymentAcquiringUrl="$tripPayUrl/v3/api-docs/wc"
paymentAcquiringSpecLocation="./payment-acquiring-sdk-java/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $paymentAcquiringUrl $paymentAcquiringSpecLocation

STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Download SUCCESS. Exit code: $STATUS"
