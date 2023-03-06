package travel.wink.sdk.extranet;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.api.AccessApi;
import travel.wink.sdk.extranet.api.ActivityApi;
import travel.wink.sdk.extranet.api.AddOnApi;
import travel.wink.sdk.extranet.api.AffiliateApi;
import travel.wink.sdk.extranet.api.AgreementApi;
import travel.wink.sdk.extranet.api.AnnouncementApi;
import travel.wink.sdk.extranet.api.AttractionApi;
import travel.wink.sdk.extranet.api.BookingApi;
import travel.wink.sdk.extranet.api.CalDavApi;
import travel.wink.sdk.extranet.api.CancellationPolicyApi;
import travel.wink.sdk.extranet.api.ChannelManagerApi;
import travel.wink.sdk.extranet.api.ContactsApi;
import travel.wink.sdk.extranet.api.DailyRateApi;
import travel.wink.sdk.extranet.api.GeoLocationApi;
import travel.wink.sdk.extranet.api.GuestRoomApi;
import travel.wink.sdk.extranet.api.InventoryApi;
import travel.wink.sdk.extranet.api.LifestyleApi;
import travel.wink.sdk.extranet.api.MasterRateApi;
import travel.wink.sdk.extranet.api.MediaApi;
import travel.wink.sdk.extranet.api.MeetingRoomApi;
import travel.wink.sdk.extranet.api.NotificationApi;
import travel.wink.sdk.extranet.api.OnboardingApi;
import travel.wink.sdk.extranet.api.PlaceApi;
import travel.wink.sdk.extranet.api.PolicyApi;
import travel.wink.sdk.extranet.api.PromotionApi;
import travel.wink.sdk.extranet.api.PromotionBundleApi;
import travel.wink.sdk.extranet.api.PropertyApi;
import travel.wink.sdk.extranet.api.RatePlanApi;
import travel.wink.sdk.extranet.api.RecognitionApi;
import travel.wink.sdk.extranet.api.RestaurantApi;
import travel.wink.sdk.extranet.api.ReviewApi;
import travel.wink.sdk.extranet.api.SalesChannelRelationshipRequestsApi;
import travel.wink.sdk.extranet.api.SalesChannelsApi;
import travel.wink.sdk.extranet.api.SchedulerApi;
import travel.wink.sdk.extranet.api.SocialNetworkApi;
import travel.wink.sdk.extranet.api.SpaApi;
import travel.wink.sdk.extranet.api.TestApi;
import travel.wink.sdk.extranet.invoker.ApiClient;

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
	public ActivityApi activityApi() {
		return new ActivityApi(apiClient());
	}

	@Bean
	public AddOnApi addOnApi() {
		return new AddOnApi(apiClient());
	}

	@Bean
	public AffiliateApi affiliateApi() {
		return new AffiliateApi(apiClient());
	}

	@Bean
	public AgreementApi agreementApi() {
		return new AgreementApi(apiClient());
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
	public ContactsApi contactsApi() {
		return new ContactsApi(apiClient());
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
	public GuestRoomApi guestRoomApi() {
		return new GuestRoomApi(apiClient());
	}

	@Bean
	public InventoryApi inventoryApi() {
		return new InventoryApi(apiClient());
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
	public NotificationApi notificationApi() {
		return new NotificationApi(apiClient());
	}

	@Bean
	public OnboardingApi onboardingApi() {
		return new OnboardingApi(apiClient());
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
	public SalesChannelRelationshipRequestsApi salesChannelRelationshipRequestsApi() {
		return new SalesChannelRelationshipRequestsApi(apiClient());
	}

	@Bean
	public SalesChannelsApi salesChannelsApi() {
		return new SalesChannelsApi(apiClient());
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

	@Bean
	public TestApi testApi() {
		return new TestApi(apiClient());
	}

}
