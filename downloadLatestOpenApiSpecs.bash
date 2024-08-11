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

echo "Grabbing Affiliate spec..."
affiliateUrl="$winkUrl/v3/api-docs/affiliate"
affiliateSpecLocation="./affiliate/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateUrl $affiliateSpecLocation

echo "Grabbing Affiliate Browse spec..."
affiliateBrowseUrl="$winkUrl/v3/api-docs/affiliate-browse"
affiliateBrowseSpecLocation="./affiliate-browse/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateBrowseUrl $affiliateBrowseSpecLocation

echo "Grabbing Affiliate Inventory spec..."
affiliateInventoryUrl="$winkUrl/v3/api-docs/affiliate-inventory"
affiliateInventorySpecLocation="./affiliate-inventory/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateInventoryUrl $affiliateInventorySpecLocation

echo "Grabbing Affiliate Sales Channel spec..."
affiliateSalesChannelUrl="$winkUrl/v3/api-docs/affiliate-sales-channel"
affiliateSalesChannelSpecLocation="./affiliate-sales-channel/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateSalesChannelUrl $affiliateSalesChannelSpecLocation

echo "Grabbing Affiliate WinkLinks spec..."
affiliateWinkLinksUrl="$winkUrl/v3/api-docs/affiliate-winklinks"
affiliateWinkLinksSpecLocation="./affiliate-winklinks/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $affiliateWinkLinksUrl $affiliateWinkLinksSpecLocation

echo "Grabbing Analytics spec..."
analyticsUrl="$winkUrl/v3/api-docs/analytics"
analyticsSpecLocation="./analytics/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $analyticsUrl $analyticsSpecLocation

echo "Grabbing Booking spec..."
bookingUrl="$winkUrl/v3/api-docs/booking"
bookingSpecLocation="./booking/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $bookingUrl $bookingSpecLocation

echo "Grabbing Channel Manager spec..."
channelManagerUrl="$integrationsUrl/v3/api-docs/channel-manager"
channelManagerSpecLocation="./channel-manager/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $channelManagerUrl $channelManagerSpecLocation

echo "Grabbing Booking Engine Client spec..."
engineClientUrl="$winkUrl/v3/api-docs/engine-client"
engineClientSpecLocation="./engine-client/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $engineClientUrl $engineClientSpecLocation

echo "Grabbing Extranet Booking spec..."
extranetBookingUrl="$winkUrl/v3/api-docs/extranet-booking"
extranetBookingSpecLocation="./extranet-booking/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetBookingUrl $extranetBookingSpecLocation

echo "Grabbing Extranet Distribution spec..."
extranetDistributionUrl="$winkUrl/v3/api-docs/extranet-distribution"
extranetDistributionSpecLocation="./extranet-distribution/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetDistributionUrl $extranetDistributionSpecLocation

echo "Grabbing Extranet Experiences spec..."
extranetExperiencesUrl="$winkUrl/v3/api-docs/extranet-experiences"
extranetExperiencesSpecLocation="./extranet-experiences/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetExperiencesUrl $extranetExperiencesSpecLocation

echo "Grabbing Extranet Facilities spec..."
extranetFacilitiesUrl="$winkUrl/v3/api-docs/extranet-facilities"
extranetFacilitiesSpecLocation="./extranet-facilities/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetFacilitiesUrl $extranetFacilitiesSpecLocation

echo "Grabbing Extranet Monetize spec..."
extranetMonetizeUrl="$winkUrl/v3/api-docs/extranet-monetize"
extranetMonetizeSpecLocation="./extranet-monetize/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetMonetizeUrl $extranetMonetizeSpecLocation

echo "Grabbing Extranet Property spec..."
extranetPropertyUrl="$winkUrl/v3/api-docs/extranet-property"
extranetPropertySpecLocation="./extranet-property/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetPropertyUrl $extranetPropertySpecLocation

echo "Grabbing Extranet Property Register spec..."
extranetPropertyRegisterUrl="$winkUrl/v3/api-docs/extranet-property-register"
extranetPropertyRegisterSpecLocation="./extranet-property-register/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $extranetPropertyRegisterUrl $extranetPropertyRegisterSpecLocation

echo "Grabbing Inventory spec..."
inventoryUrl="$winkUrl/v3/api-docs/inventory"
inventorySpecLocation="./inventory/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $inventoryUrl $inventorySpecLocation

echo "Grabbing Lookup spec..."
lookupUrl="$winkUrl/v3/api-docs/lookup"
lookupSpecLocation="./lookup/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $lookupUrl $lookupSpecLocation

echo "Grabbing Notification spec..."
notificationUrl="$winkUrl/v3/api-docs/notification"
notificationSpecLocation="./notification/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $notificationUrl $notificationSpecLocation

echo "Grabbing Ping spec..."
pingUrl="$winkUrl/v3/api-docs/ping"
pingSpecLocation="./ping/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $pingUrl $pingSpecLocation

echo "Grabbing Reference spec..."
referenceUrl="$winkUrl/v3/api-docs/reference"
referenceSpecLocation="./reference/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $referenceUrl $referenceSpecLocation

echo "Grabbing Travel Agent spec..."
travelAgentUrl="$winkUrl/v3/api-docs/travel-agent"
travelAgentSpecLocation="./travel-agent/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $travelAgentUrl $travelAgentSpecLocation

echo "Grabbing User Settings spec..."
userSettingsUrl="$winkUrl/v3/api-docs/user-settings"
userSettingsSpecLocation="./user-settings/src/main/resources/openapi-spec.json"

retrieveOpenApiSpecFunction $userSettingsUrl $userSettingsSpecLocation

STATUS=$?
if [ $STATUS -ne 0 ]; then
  echo "Something went wrong on line: ${BASH_LINENO[*]}"
  exit 1
fi

echo "Download SUCCESS. Exit code: $STATUS"
