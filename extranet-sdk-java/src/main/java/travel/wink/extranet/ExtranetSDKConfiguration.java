package travel.wink.extranet;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.extranet.api.AccessApi;
import travel.wink.extranet.api.ActivityApi;
import travel.wink.extranet.api.AddOnApi;
import travel.wink.extranet.api.AffiliateApi;
import travel.wink.extranet.api.AnalyticsApi;
import travel.wink.extranet.api.AnnouncementApi;
import travel.wink.extranet.api.AttractionApi;
import travel.wink.extranet.api.BookingApi;
import travel.wink.extranet.api.CalDavApi;
import travel.wink.extranet.api.CancellationPolicyApi;
import travel.wink.extranet.api.ChannelManagerApi;
import travel.wink.extranet.api.ContactsApi;
import travel.wink.extranet.api.DailyRateApi;
import travel.wink.extranet.api.GeoLocationApi;
import travel.wink.extranet.api.GeoNameApi;
import travel.wink.extranet.api.GuestRoomApi;
import travel.wink.extranet.api.InventoryApi;
import travel.wink.extranet.api.LeaderboardApi;
import travel.wink.extranet.api.LifestyleApi;
import travel.wink.extranet.api.MasterRateApi;
import travel.wink.extranet.api.MediaApi;
import travel.wink.extranet.api.MeetingRoomApi;
import travel.wink.extranet.api.NotificationApi;
import travel.wink.extranet.api.OnboardingApi;
import travel.wink.extranet.api.PackageApi;
import travel.wink.extranet.api.PlaceApi;
import travel.wink.extranet.api.PolicyApi;
import travel.wink.extranet.api.PromotionApi;
import travel.wink.extranet.api.PromotionBundleApi;
import travel.wink.extranet.api.PropertyApi;
import travel.wink.extranet.api.RatePlanApi;
import travel.wink.extranet.api.RecognitionApi;
import travel.wink.extranet.api.ReferenceApi;
import travel.wink.extranet.api.RestaurantApi;
import travel.wink.extranet.api.ReviewApi;
import travel.wink.extranet.api.SalesChannelsApi;
import travel.wink.extranet.api.SchedulerApi;
import travel.wink.extranet.api.SocialNetworkApi;
import travel.wink.extranet.api.SpaApi;
import travel.wink.extranet.api.TestApi;
import travel.wink.extranet.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AccessApi accessApi() {
		return new AccessApi(apiClient());
	}

	@Bean
	public AffiliateApi affiliateApi() {
		return new AffiliateApi(apiClient());
	}

	@Bean
	public ActivityApi activityApi() {
		return new ActivityApi(apiClient());
	}

	@Bean
	public AddOnApi addOnApi() {
		return new AddOnApi(apiClient());
	}

	@Bean
	public AnalyticsApi analyticsApi() {
		return new AnalyticsApi(apiClient());
	}

	@Bean
	public AnnouncementApi announcementApi() {
		return new AnnouncementApi(apiClient());
	}

	@Bean
	public AttractionApi attractionApi() {
		return new AttractionApi(apiClient());
	}

	@Bean
	public BookingApi bookingApi() {
		return new BookingApi(apiClient());
	}

	@Bean
	public CalDavApi calDavApi() {
		return new CalDavApi(apiClient());
	}

	@Bean
	public CancellationPolicyApi cancellationPolicyApi() {
		return new CancellationPolicyApi(apiClient());
	}

	@Bean
	public ChannelManagerApi channelManagerApi() {
		return new ChannelManagerApi(apiClient());
	}

	@Bean
	public ReferenceApi referenceApi() {
		return new ReferenceApi(apiClient());
	}

	@Bean
	public ContactsApi contactsApi() {
		return new ContactsApi(apiClient());
	}

	@Bean
	public SalesChannelsApi salesChannelsApi() {
		return new SalesChannelsApi(apiClient());
	}

	@Bean
	public TestApi testApi() {
		return new TestApi(apiClient());
	}

	@Bean
	public DailyRateApi dailyRateApi() {
		return new DailyRateApi(apiClient());
	}

	@Bean
	public GeoLocationApi geoLocationApi() {
		return new GeoLocationApi(apiClient());
	}

	@Bean
	public GeoNameApi geoNameApi() {
		return new GeoNameApi(apiClient());
	}

	@Bean
	public GuestRoomApi guestRoomApi() {
		return new GuestRoomApi(apiClient());
	}

	@Bean
	public NotificationApi notificationApi() {
		return new NotificationApi(apiClient());
	}

	@Bean
	public InventoryApi inventoryApi() {
		return new InventoryApi(apiClient());
	}

	@Bean
	public LeaderboardApi leaderboardApi() {
		return new LeaderboardApi(apiClient());
	}

	@Bean
	public LifestyleApi lifestyleApi() {
		return new LifestyleApi(apiClient());
	}

	@Bean
	public MasterRateApi masterRateApi() {
		return new MasterRateApi(apiClient());
	}

	@Bean
	public MediaApi mediaApi() {
		return new MediaApi(apiClient());
	}

	@Bean
	public MeetingRoomApi meetingRoomApi() {
		return new MeetingRoomApi(apiClient());
	}

	@Bean
	public OnboardingApi onboardingApi() {
		return new OnboardingApi(apiClient());
	}

	@Bean
	public PackageApi packageApi() {
		return new PackageApi(apiClient());
	}

	@Bean
	public PlaceApi placeApi() {
		return new PlaceApi(apiClient());
	}

	@Bean
	public PolicyApi policyApi() {
		return new PolicyApi(apiClient());
	}

	@Bean
	public PromotionApi promotionApi() {
		return new PromotionApi(apiClient());
	}

	@Bean
	public PromotionBundleApi promotionBundleApi() {
		return new PromotionBundleApi(apiClient());
	}

	@Bean
	public PropertyApi propertyApi() {
		return new PropertyApi(apiClient());
	}

	@Bean
	public RatePlanApi ratePlanApi() {
		return new RatePlanApi(apiClient());
	}

	@Bean
	public RecognitionApi recognitionApi() {
		return new RecognitionApi(apiClient());
	}

	@Bean
	public RestaurantApi restaurantApi() {
		return new RestaurantApi(apiClient());
	}

	@Bean
	public ReviewApi reviewApi() {
		return new ReviewApi(apiClient());
	}

	@Bean
	public SchedulerApi schedulerApi() {
		return new SchedulerApi(apiClient());
	}

	@Bean
	public SocialNetworkApi socialNetworkApi() {
		return new SocialNetworkApi(apiClient());
	}

	@Bean
	public SpaApi spaApi() {
		return new SpaApi(apiClient());
	}

}
