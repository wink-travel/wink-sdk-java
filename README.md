[![wink.travel logo](https://res.cloudinary.com/traveliko/image/upload/c_scale,h_75/v1653285543/wink/logo_text.png)](https://wink.travel)

# Wink Java SDK

Welcome to the Java SDK that enables you to communicate with all that the Wink platform has to offer.

## Getting started
This SDK contains 5 unique libraries you can leverage to communicate with the Wink platform.

### Java Requirements
Maven artifacts were compiled with Java 17. Java 1.8 is the minimum requirement.

Spring is not required but we highly recommend you use. Our examples will be based on how to do it the "Spring way".

Download libraries from Maven Central Repository.

### Affiliate

[API documentation](https://api.wink.travel/docs?api=affiliate)

The Affiliate API exposes endpoints for affiliates who want browse available platform inventory and then prepare that inventory for sale, such as shareable links, grids, cards, maps etc. An affiliate can also track their ranking on our leaderboards as well as detail platform-level analytics.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateSDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate`. That will give you access to the following Spring Beans:

- AnalyticsApi: Create analytics that is meaningful to you. We provide the filters, sorting mechanisms and data points you need to track everything you want on our platform. 
- ApplicationApi: Manage your API keys via the ApplicationApi. 
- BookingsApi: View all your bookings.
- CampaignApi: Used by our WordPress Affiliate plugin to query for inventory you have created and is ready for sale.
- CompanyApi: Manage your accounts through the company API.
- CustomizationApi: Manage your customizations through the Customization API.
- DiscoverApi: See which countries and cities we have available inventory in as well as retrieve inventory available for sale through you channels. 
- InventoryCardsApi: Manage your single inventory "cards" through the Inventory Cards API.
- InventoryGridsApi: Manage your inventory "grids" through the Inventory Grids API.
- InvoiceApi: If you are subscribing to any of our services, you can retrieve invoices with the Invoice API. (Note: Currently not in use. No available services.)
- LeaderboardApi: Track where you stand compared to other affiliates. The metric is bookings. 
- MapsApi: Manage your maps through the Maps API.
- ShareableLinksApi: Manage links you can share and track across your sales channels.
- TestApi: Endpoint to check that your integration works.

### Booking engine

[API documentation](https://api.wink.travel/docs?api=booking-engine)

The Booking Engine API exposes search functionality for finding available hotels to book. Hotels can be filtered on a variety of common filters as well as wink-only filters. The API also supports creating bookings as either a platform merchant or agent. 

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>booking-engine-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(BookingEngineSDKConfiguration.class) or run a component scan over `travel.wink.sdk.booking.engine`. That will give you access to the following Spring Beans:

- InventoryApi: Everything related to querying property availability.
- BookingApi: Everything related to viewing, creating and cancelling bookings.
- ReferenceApi: Everything related to structured datasets and their meaning. E.g. OTA Room View Code list
- LookupApi: Everything related to querying for best priced room types using various filter mechanisms

### Channel manager

[API documentation](https://api.wink.travel/docs?api=channel-manager)

The Channel Manager API enables external channel manager partners to map, exchange rate / availability information with us as well as be informed of bookings that occur on the Wink platform for one of their properties.  

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>channel-manager-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ChannelManagerSDKConfiguration.class) or run a component scan over `travel.wink.sdk.channel.manager`. That will give you access to the following Spring Beans:

- ChannelManagerApi: Everything related to pushing rates and availability as well as querying properties managed by your channel manager account with us.

### Extranet

[API documentation](https://api.wink.travel/docs?api=extranet)

The Extranet API exposes endpoints for managing all aspects of a property on our platform. A hotelier can manage content, rates, sales channels for every type of inventory we offer as well as gain valuable platform-level insight into the health of their property.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet`. That will give you access to the following Spring Beans:

- AccessApi: Manage which users get to manage your properties with the Access API.
- ActivityApi: Manage activities guests can book / view along with their room with the Activity API.
- AddOnApi: Manage add-ons guests can book / view along with their room with the Add-On API.
- AffiliateApi: Search for, and connect with, affiliates you would like to work with directly using the Affiliate API.
- AnalyticsApi: Create analytics that is meaningful to you. We provide the filters, sorting mechanisms and data points you need to track everything you want on our platform.
- AnnouncementApi: Manage property announcements would-be guests should know about before booking using the Announcement API.
- AttractionApi: Manage attraction guests can book / view along with their room with the Activity API.
- BookingApi: Manage bookings and cancellations with the Booking API.
- CalDavApi: Integrate you favorite calendar application with your bookings so you can see who's coming with the CalDAV API.
- CancellationPolicyApi: Manage property cancellation policies with the Cancellation Policy API.
- ContactsApi: Manage property contacts with the Contacts API.
- DailyRateApi: Manage Master Rate rates with the Daily Rate API.
- GeoNameApi: Query standard geo-name data from the platform to see which locations we support using the Geo Name API. 
- GeoLocationApi: Manage property geo-location with the Geo Location API.
- GuestRoomApi: Manage room type inventory including images and video with the Guest Room API.
- InventoryApi: Manage sales channel access to your inventory with the Inventory API.
- InvoiceApi: If you are subscribing to any of our services, you can retrieve invoices with the Invoice API. (Note: Currently not in use. No available services.) 
- LeaderboardApi: Track how affiliates are doing in comparison to other affiliates on the platform and get an idea of whom the real producers are with the Leaderboard API. 
- LifestyleApi: Manage the lifestyles the property caters best to with the Lifestyle API.
- MasterRateApi: Manage master rates (pair of guest room and rate plan) with the Master Rate API.
- MediaApi: Manage property media files including images and video with the Media API.
- MeetingRoomApi: Manage activities guests can book / view along with their room with the Activity API.
- NotificationApi: Receive and reply to platform notifications with the Notification API.
- OnboardingApi: Use the Onboarding API to add your property. This is always the first API call you make for a new property.
- PackageApi: Manage packages guests can book / view along with their room with the Activity API.
- PlaceApi: Manage places guests can book / view along with their room with the Activity API.
- PolicyApi: Manage property policy with the Policy API.
- PromotionApi: Manage promotions with the Promotion API.
- PromotionBundleApi: Manage more complex promotion bundles with the Promotion Bundle API.
- PropertyApi: Manage basic property information with the Property API.
- RatePlanApi: Manage rate plans with the Rate Plan API.
- RecognitionApi: Manage awards, publications, ratings and reviews the property has received with the Recognition API.
- ReferenceApi: Look up reference / OTA spec codes and their meaning with the Reference API. 
- RestaurantApi: Manage restaurant guests can book / view along with their room with the Activity API.
- ReviewApi: View and respond to reviews from customers with the Review API.
- SalesChannelApi: Manage sale channel relationships with the Sales Channel API.
- SchedulerApi: Manage the calendar schedule for all facilities and ancillary inventory with the Scheduler API.
- SocialNetworkApi: Manage property social networks using the Social Network API.
- SpaApi: Manage spa guests can book / view along with their room with the Activity API.
- TestApi: Easy way to check if you are connected and authenticated with the Wink platform.


### Payment

[API documentation](https://api.trippay.io/docs?api=contract)

The Payment API exposes endpoints for affiliates and hotels to track bookings, analytics and funds availability. They can also choose to withdraw available funds to their bank account.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>payment-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(PaymentSDKConfiguration.class) or run a component scan over `travel.wink.sdk.payment`. That will give you access to the following Spring Beans:

- AccountApi: Manage your account(s) on Wink with the Account API.
- AccountMappingsApi: Manage your account mappings on Wink with the Account Mapping API.
- AgentApi: Create a booking contract as an Agent with the Agent API.
- ContractApi: Retrieve booking contracts and cancel them if possible.
- MappingApi: More mapping features to control mappings between your system and Wink.
- PingApi: Easy way to check if you are connected and authenticated with the Wink platform.

### Payment Acquiring

[API documentation](https://api.trippay.io/docs?api=wc)

The Payment Acquiring API exposes endpoints for affiliates to acquire a payment via our payment methods in their own applications. These are the same features we leverage in our payment Web Component.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>payment-acquiring-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(PaymentAcquiringSDKConfiguration.class) or run a component scan over `travel.wink.sdk.payment.acquiring`. That will give you access to the following Spring Beans:

- AffiliateApi: Retrieve affiliate facilitator data with the Affiliate API.
- ContractApi: Validate, price and execute a booking contract with the Contract API.
- NmiApi: Create an SCA / PSD2 compliant sale request through NMI's payment gateway (U.S. only) with the NMI API.
- StripeApi: Create an SCA / PSD2 compliant sale request with Stripe's payment gateway with the Stripe API.

## Configuration
You will need a client ID and a client secret to communicate with any of the Wink platform endpoints. You can create your account and get your credentials here:

[https://develop.wink.travel](https://develop.wink.travel)

Steps: 
1. Register your personal user account
2. Log in
3. Create your first account
4. Select that account
5. Choose to create an Application for that account 
6. The application will hold your credentials

### Spring users
Add your credentials to your property file:

1. wink.travel.client.id=YOUR_CLIENT_ID
2. wink.travel.client.secret=YOUR_CLIENT_SECRET

### Non-Spring users
Create 2 environment variables in your preferred way:

1. WINK_TRAVEL_CLIENT_ID=YOUR_CLIENT_ID
2. WINK_TRAVEL_CLIENT_SECRET=YOUR_CLIENT_SECRET

## You might also be interested in...
If you are developing for WordPress, we've [probably] got you covered. Check out our WordPress plugin:

- GitHub repo: [https://github.com/iko-travel/iko-travel-affiliate-wordpress-plugin](https://github.com/iko-travel/iko-travel-affiliate-wordpress-plugin)
- WordPress: [https://wordpress.org/plugins/iko-travel-affiliate/](https://wordpress.org/plugins/iko-travel-affiliate/) 

Note: We have not yet re-branded our WP plugin to Wink. 
