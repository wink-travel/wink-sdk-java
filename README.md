# Wink Java SDK

Welcome to the Java SDK that enables you to communicate with all that the Wink platform has to offer.

## Getting started
This SDK contains 5 unique libraries you can leverage to communicate with the Wink platform.

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

### Channel manager

[API documentation](https://api.wink.travel/docs?api=channel-manager)

The Channel Manager API enables external channel manager partners to map, exchange rate / availability information with us as well as be informed of bookings that occur on the wink platform for one of their properties.  

```
<dependency>
  <groupId>travel.wink</groupId>
  <artifactId>channel-manager-sdk-java</artifactId>
  <version><!-- see Releases --></version>
  <packaging>jar</packaging>
</dependency>
```

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

