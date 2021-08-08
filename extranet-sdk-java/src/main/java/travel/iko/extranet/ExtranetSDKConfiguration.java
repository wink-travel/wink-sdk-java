package travel.iko.extranet;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.iko.extranet.api.AccessApi;
import travel.iko.extranet.api.AccountsApi;
import travel.iko.extranet.api.ActivityApi;
import travel.iko.extranet.api.AddOnApi;
import travel.iko.extranet.api.AnalyticsApi;
import travel.iko.extranet.api.AnnouncementApi;
import travel.iko.extranet.api.AttractionApi;
import travel.iko.extranet.api.BookingApi;
import travel.iko.extranet.api.CalDavApi;
import travel.iko.extranet.api.CalendarApi;
import travel.iko.extranet.api.CancellationPolicyApi;
import travel.iko.extranet.api.ChannelManagerApi;
import travel.iko.extranet.api.ChannelsApi;
import travel.iko.extranet.api.ContactsApi;
import travel.iko.extranet.api.CountryApi;
import travel.iko.extranet.api.CurrencyApi;
import travel.iko.extranet.api.DailyRateApi;
import travel.iko.extranet.api.GeoIpApi;
import travel.iko.extranet.api.GeoLocationApi;
import travel.iko.extranet.api.GeoNameApi;
import travel.iko.extranet.api.GreenIndexQuestionnaireApi;
import travel.iko.extranet.api.GuestRoomApi;
import travel.iko.extranet.api.HotelierApi;
import travel.iko.extranet.api.InventoryApi;
import travel.iko.extranet.api.LeaderboardApi;
import travel.iko.extranet.api.LifestyleApi;
import travel.iko.extranet.api.LifestylesApi;
import travel.iko.extranet.api.MasterRateApi;
import travel.iko.extranet.api.MediaApi;
import travel.iko.extranet.api.MeetingRoomApi;
import travel.iko.extranet.api.OnboardingApi;
import travel.iko.extranet.api.OtaCodesApi;
import travel.iko.extranet.api.PackageApi;
import travel.iko.extranet.api.PerksApi;
import travel.iko.extranet.api.PlaceApi;
import travel.iko.extranet.api.PolicyApi;
import travel.iko.extranet.api.PromotionApi;
import travel.iko.extranet.api.PromotionBundleApi;
import travel.iko.extranet.api.PropertyApi;
import travel.iko.extranet.api.RatePlanApi;
import travel.iko.extranet.api.RecognitionApi;
import travel.iko.extranet.api.RestaurantApi;
import travel.iko.extranet.api.ReviewApi;
import travel.iko.extranet.api.SegmentsApi;
import travel.iko.extranet.api.ServicesApi;
import travel.iko.extranet.api.SocialNetworkApi;
import travel.iko.extranet.api.SocialNetworksApi;
import travel.iko.extranet.api.SpaApi;
import travel.iko.extranet.api.TrackApi;
import travel.iko.extranet.invoker.ApiClient;

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
	public AccountsApi accountsApi() {
		return new AccountsApi(apiClient());
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
	public CalendarApi calendarApi() {
		return new CalendarApi(apiClient());
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
	public ChannelsApi channelsApi() {
		return new ChannelsApi(apiClient());
	}

	@Bean
	public ContactsApi contactsApi() {
		return new ContactsApi(apiClient());
	}

	@Bean
	public CountryApi countryApi() {
		return new CountryApi(apiClient());
	}

	@Bean
	public CurrencyApi currencyApi() {
		return new CurrencyApi(apiClient());
	}

	@Bean
	public DailyRateApi dailyRateApi() {
		return new DailyRateApi(apiClient());
	}

	@Bean
	public GeoIpApi geoIpApi() {
		return new GeoIpApi(apiClient());
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
	public GreenIndexQuestionnaireApi greenIndexQuestionnaireApi() {
		return new GreenIndexQuestionnaireApi(apiClient());
	}

	@Bean
	public GuestRoomApi guestRoomApi() {
		return new GuestRoomApi(apiClient());
	}

	@Bean
	public HotelierApi hotelierApi() {
		return new HotelierApi(apiClient());
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
	public LifestylesApi lifestylesApi() {
		return new LifestylesApi(apiClient());
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
	public OtaCodesApi otaCodesApi() {
		return new OtaCodesApi(apiClient());
	}

	@Bean
	public PackageApi packageApi() {
		return new PackageApi(apiClient());
	}

	@Bean
	public PerksApi perksApi() {
		return new PerksApi(apiClient());
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
	public SegmentsApi segmentsApi() {
		return new SegmentsApi(apiClient());
	}

	@Bean
	public ServicesApi servicesApi() {
		return new ServicesApi(apiClient());
	}

	@Bean
	public SocialNetworkApi socialNetworkApi() {
		return new SocialNetworkApi(apiClient());
	}

	@Bean
	public SocialNetworksApi socialNetworksApi() {
		return new SocialNetworksApi(apiClient());
	}

	@Bean
	public SpaApi spaApi() {
		return new SpaApi(apiClient());
	}

	@Bean
	public TrackApi trackApi() {
		return new TrackApi(apiClient());
	}
}
