[![wink.travel logo](https://res.cloudinary.com/traveliko/image/upload/c_scale,h_75/v1653285543/wink/logo_text.png)](https://wink.travel)

# Wink Java SDK

Welcome to the Java SDK that enables you to communicate with all that the Wink Travel Platform has to offer.

## Getting started
This SDK contains libraries you can leverage to communicate with the Wink platform.

### Java Requirements
Maven artifacts were compiled with Java 22.

Spring is not required, but we highly recommend you use it. Our examples will be based on how to do it the "Spring way".

Download libraries from Maven Central Repository.

### Affiliate

[API documentation](https://docs.wink.travel/affiliate)

The Affiliate API exposes endpoints to manage affiliate accounts. This API lets you:

 - Create affiliates.
 - Create account managers.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateSDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AffiliateApi: Create affiliates. 
- AccountManagerApi: Create account managers.


### Affiliate Browse

[API documentation](https://docs.wink.travel/affiliate-browse)

The Affiliate Browse API exposes endpoints for affiliates to browse inventory. This API lets you:

- Browse suppliers and inventory.
- Retrieve categories to search for.
- Manage curated lists.
- Manage saved searches.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-browse-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateBrowseSDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate.browse` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- BrowseApi: Browse suppliers and invnentory. 
- CuratedListApi: Manage curated lists.
- SavedSearchApi: Manage saved searches.
- SearchCategoriesApi: Retrieve categories to search for.


### Affiliate Inventory

[API documentation](https://docs.wink.travel/affiliate-inventory)

The Affiliate Inventory API exposes endpoints for affiliates to manage the inventory they want to sell and how they want to sell it. This API lets you:

- Manage customizations.
- Manage shareable supplier / inventory links.
- Manage individual inventory items.
- Manage curated / saved searches / ranked grids.
- Manage maps.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-inventory-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateInventorySDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate.inventory` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- CustomizationApi: Manage customizations. 
- EmbeddableInventoriesApi: Mostly used by our Web Components to retrieve available inventory to embed 
- ItemsApi: Manage individual inventory items.
- GridsApi: Manage curated + saved searches grids.
- MapsApi: Manage maps.
- InventoryLinksApi: Manage shareable inventory links.
- RankedGridsApi: Manage ranked grids.
- SupplierLinksApi: Manage shareable supplier links.


### Affiliate Sales Channel

[API documentation](https://docs.wink.travel/affiliate-sales-channel)

The Sales Channel API exposes endpoints for affiliates to manage existing sales channels as well as find new ones. This API lets you:

 - Sales Channel: Manage existing sales channels.
 - Relationship Request: Manage relationship requests.
 - Available Supplier: Browse available suppliers to connect with.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-sales-channel-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateSalesChannelSDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate.sales.channel` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AvailableSupplierApi: Browse available suppliers to connect with.
- RelationshipRequestApi: Manage relationship requests. 
- SalesChannelApi: Manage existing sales channels.


### Affiliate WinkLinks

[API documentation](https://docs.wink.travel/affiliate-winklinks)

The WinkLinks API exposes endpoints to manage WinkLink entries, categories and settings. This API lets you:

 - Entries: Manage WinkLinks entries.
 - Categories: Manage WinkLinks tags.
 - Settings: Configure WinkLinks account.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>affiliate-winklinks-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AffiliateWinkLinksSDKConfiguration.class) or run a component scan over `travel.wink.sdk.affiliate.syndication` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- SyndicationPublisherApi: Manage your WinkLinks account


### Analytics

[API documentation](https://docs.wink.travel/analytics)

The Analytics API gives you access to time series data on a variety of data sources to measure bookings and insights on properties, affiliates and traveler data.

```
<dependency>
<groupId>travel.wink</groupId>
<artifactId>analytics-sdk-java</artifactId>
<packaging>jar</packaging>
<version><!-- see Releases --></version>
</dependency>
```

#### Usage

Using Spring, @Import(AnalyticsSDKConfiguration.class) or run a component scan over `travel.wink.sdk.analytics` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AnalyticsApi: Create analytics that is meaningful to you. We provide the filters, sorting mechanisms and data points you need to track everything you want on our platform.
- LeaderboardApi: Track where you stand compared to other affiliates. The metric is bookings.

### Booking

[API documentation](https://docs.wink.travel/booking)

Welcome to the Booking Engine API - A programmer-friendly way to book inventory that was found on our platform. This API lets you:

- Shopping Cart: Manage shopping cart.
- Checkout: Move shopping cart items through the payment workflow.
- Booking: Move selected inventory through to booking completion.
- Review: Leave a review after a completed stay. 

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>booking-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(BookingSDKConfiguration.class) or run a component scan over `travel.wink.sdk.booking` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ShoppingCartApi: Manage shopping cart.
- CheckoutApi: Move shopping cart items through the payment workflow.
- BookingApi: Manage bookings.
- ReviewApi: Leave a review after a completed stay.

### Channel manager

[API documentation](https://docs.wink.travel/channel-manager)

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

Using Spring, @Import(ChannelManagerSDKConfiguration.class) or run a component scan over `travel.wink.sdk.channel.manager` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ChannelManagerApi: Everything related to pushing rates and availability as well as querying properties managed by your channel manager account with us.


### Booking Engine Client

[API documentation](https://docs.wink.travel/engine-client)

A single endpoint to retrieve affiliate information needed to display the booking engine.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>booking-engine-client-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(EngineClientSDKConfiguration.class) or run a component scan over `travel.wink.sdk.booking.client` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ConfigurationApi: Load affiliate information


### Extranet Booking

[API documentation](https://docs.wink.travel/extranet-booking)

The Booking API exposes endpoints to manage bookings. This API lets you:

- Booking: Manage bookings including cancellations.
- Review: Manage and respond to user reviews.
- Sync w. Calendar: Manage calendar sync with your favorite calendar software.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-booking-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetBookingSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.booking` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- BookingApi: Manage bookings including cancellations.
- ReviewApi: Manage and respond to user reviews.
- CalendarSyncApi: Sync w. Calendar: Manage calendar sync with your favorite calendar software.


### Extranet Distribution

[API documentation](https://docs.wink.travel/extranet-distribution)

The Distribution API exposes endpoints for sales channels, connecting with affiliates, managing rates and inventory calendars and more on Wink. This API lets you:

1. Verifier: Test your availability and promotions and create test bookings to simulate the entire booking workflow.
2. Sales Channels: Manage your sales channels.
3. Explore Network: Find new affiliates to work with.
4. Inventory: Manage inventory at the sales channel-level.
5. Calendars: Manage availability calendars for all your inventory.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-distribution-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetDistributionSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.distribution` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AffiliateApi: Browse affiliates.
- DailyRateApi: Manage room type / rate plan rates
- InventoryApi: Manage inventory at the sales channel-level.
- InventoryUsageApi: Track current inventory usage.
- SalesChannelApi: Manage sales channels.
- SchedulerApi: Manage availability for all non-room type inventory.
- SalesChannelRelationshipRequestsApi: Manage affiliate relationship requests.


### Extranet Experiences

[API documentation](https://docs.wink.travel/extranet-experiences)

This part of the documentation concerns itself with the management of experiences, on and off the property. This API lets you create:

- Activities: Manage activities on and off the premises.
- Attractions: Manage attractions on and off the premises.
- Places: Manage places on and off the premises.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-experiences-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetExperiencesSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.experiences` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ActivityApi: Manage activities on and off the premises.
- AttractionApi: Manage attractions on and off the premises.
- PlaceApi: Manage places on and off the premises.


### Extranet Facilities

[API documentation](https://docs.wink.travel/extranet-facilities)

This part of the documentation concerns itself with the management of facilities, on and off the property. This API lets you create:

- Guest room: Manage room types on and off the premises.
- Meeting room: Manage meeting rooms on and off the premises.
- Restaurant: Manage restaurants on and off the premises.
- Spa: Manage spas on and off the premises.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-facilities-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetFacilitiesSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.facilities` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- GuestRoomApi: Manage room types on and off the premises.
- MeetingRoomApi: Manage meeting rooms on and off the premises.
- RestaurantApi: Manage restaurants on and off the premises.
- SpaApi: Manage spas on and off the premises.


### Extranet Monetize

[API documentation](https://docs.wink.travel/extranet-monetize)

This part of the documentation concerns itself with the management of cancellation policies, promotions, restrictions etc. This API lets you create:

- Add-ons: Manage add-ons.
- Cancellation policies: Manage cancellation policies for your property.
- Master rates: Manage perks for room type / rate plan combos.
- Promotions: Manage promotions.
- Promotion bundle: Manage bundled promotions.
- Rate plan: Manage rate plans.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-monetize-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetMonetizeSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.monetize` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AddOnApi: Manage add-ons.
- CancellationPolicyApi: Manage cancellation policies for your property.
- MasterRateApi: Manage perks for room type / rate plan combos.
- PromotionApi: Manage promotions.
- PromotionBundleApi: Manage bundled promotions.
- RatePlanApi: Manage rate plans.


### Extranet Property

[API documentation](https://docs.wink.travel/extranet-property)

This part of the documentation concerns itself with basic property management. It can:

- Property: List existing properties. Manage property status. Change name and similar.
- Notification: Read internal messages sent from Wink to your properties.
- Announcement: Show pertinent messages to travelers in a pop-up window.
- Geo-Location: Set property geo-location.
- Green Index: Answer eco-related questions regarding the property's recycling practices and much more.
- Lifestyles: Manage lifestyles the property caters to.
- Photos / Videos: Manage property media.
- Policy: Manage property policy. I.e. Children, pets, wi-fi, parking etc.
- Reputation: Manage awards, online / offline ratings etc.
- Services: Manage property amenities.
- Social media: Manage property social media networks.
- Welcome text: Manage property descriptions

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-property-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetPropertySDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.property` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- AnnouncementApi: Manage announcements to travelers in a pop-up window.
- ChannelManagerApi: Set channel manager
- GeoLocationApi: Set property geo-location.
- LifestyleApi: Manage lifestyles the property caters to.
- MediaApi: Manage property media.
- PolicyApi: Manage property policy. I.e. Children, pets, wi-fi, parking etc.
- PropertyApi: List existing properties. Manage property status. Change name and similar.
- RecognitionApi: Manage awards, online / offline ratings etc.
- SocialNetworkApi: Manage property social media networks.


### Extranet Property Register

[API documentation](https://docs.wink.travel/extranet-property-register)

This part of the documentation concerns itself about adding new properties to Wink. There are two endpoints for you to onboard a property:

- Manage leads.
- Manually: Use this endpoint if you already have all the property data. Use case: You want to migrate your existing properties to Wink.
- Intelligently: With the assistance of Google Business Pages, you can select an existing property on Google, ingest it with the lead endpoint and let us create a Wink property for you. Note: This isn't always straightforward in places with non-standard addresses.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>extranet-property-register-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ExtranetPropertyRegisterSDKConfiguration.class) or run a component scan over `travel.wink.sdk.extranet.property.register` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ManageLeadsApi: Manage leads.
- PropertyRegistrationApi: Create properties.


### Inventory

[API documentation](https://docs.wink.travel/inventory)

The Inventory API exposes endpoints to retrieve inventory you already know about. This API lets you:

- Consume shareable links.
- Load up a known property with availability.
- Load up all inventories that were created by our affiliates such as grids, maps, and individual items.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>inventory-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(InventorySDKConfiguration.class) or run a component scan over `travel.wink.sdk.inventory` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- InventoryApi: Everything related to querying property availability.
- ShareableLinkApi: Consume shareable links.


### Lookup

[API documentation](https://docs.wink.travel/lookup)

The Lookup API exposes endpoints to search for inventory by region, type. It's the entryway to bookable inventory when you don't yet know what you are looking for.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>lookup-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(LookupSDKConfiguration.class) or run a component scan over `travel.wink.sdk.lookup` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- LookupApi: Everything related to querying for best priced room types using various filter mechanisms


### Notification

[API documentation](https://docs.wink.travel/notification)

The Notifications API is a way for us to stay in touch with your user, property or affiliate account.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>notification-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(NotificationSDKConfiguration.class) or run a component scan over `travel.wink.sdk.notification` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- NotificationApi: Retrieve platform notifications.


### Ping

[API documentation](https://docs.wink.travel/ping)

Easy way to test your credentials.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>ping-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(PingSDKConfiguration.class) or run a component scan over `travel.wink.sdk.ping` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- PingApi: Test connection with Wink.


### Reference

[API documentation](https://docs.wink.travel/reference)

The Reference API exposes endpoints related to supported taxonomies of reference data that this platform supports.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>reference-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(ReferenceSDKConfiguration.class) or run a component scan over `travel.wink.sdk.reference` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- GeoDataApi: Find geo-name lookup data from geonames.org.
- ReferenceApi: Everything related to structured datasets and their meaning. E.g. OTA Room View Code list


### Travel Agent

[API documentation](https://docs.wink.travel/travel-agent)

The Travel Agent API exposes endpoints to manage agent-facilitated bookings. This API lets you:

- Travel Agent: Manage agent entity.
- Booking: Create / Manage bookings

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>travel-agent-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(TravelAgentSDKConfiguration.class) or run a component scan over `travel.wink.sdk.travel.agent` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- TravelAgentApi: Create agents and manage bookings.


### User Settings

[API documentation](https://docs.wink.travel/user-settings)

The User Settings API exposes endpoints to allow 3rd party integrators to communicate with Wink. This API lets you:

- Application: Manage 3rd party access to Wink.
- Bucket List: Manage your bucket list on Wink.
- User: Manage user settings.
- Webhook: Subscribe to receive Wink events as they occur in realtime.

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>user-settings-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

#### Usage

Using Spring, @Import(UserSettingsSDKConfiguration.class) or run a component scan over `travel.wink.sdk.user.settings` and `travel.wink.sdk.support`. That will give you access to the following Spring Beans:

- ApplicationApi: Manage 3rd party access to Wink.
- BucketListApi: Manage your bucket list on Wink.
- UserSettingsApi: Manage user settings.
- WebhookApi: Subscribe to receive Wink events as they occur in realtime.


## Configuration
You will need a client ID and a client secret to communicate with any of the Wink platform endpoints. You can create your account and get your credentials here:

[https://sell.wink.travel](https://sell.wink.travel)

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

- Wink IAM Java SDK repo: [https://github.com/wink-travel/iam-sdk-java](https://github.com/wink-travel/iam-sdk-java)
- TripPay Java SDK repo: [https://github.com/wink-travel/trip-pay-sdk-java](https://github.com/wink-travel/trip-pay-sdk-java)
- WordPress: [https://wordpress.org/plugins/wink2travel/](https://wordpress.org/plugins/iko-travel-affiliate/) 
