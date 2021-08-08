package travel.iko.affiliate;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.iko.affiliate.api.AnalyticsApi;
import travel.iko.affiliate.api.BookingsApi;
import travel.iko.affiliate.api.CampaignApi;
import travel.iko.affiliate.api.CardsApi;
import travel.iko.affiliate.api.CuratedListsApi;
import travel.iko.affiliate.api.CustomizationApi;
import travel.iko.affiliate.api.DiscoverApi;
import travel.iko.affiliate.api.GridsApi;
import travel.iko.affiliate.api.IntegrationApi;
import travel.iko.affiliate.api.LeaderboardApi;
import travel.iko.affiliate.api.LinksApi;
import travel.iko.affiliate.api.MapsApi;
import travel.iko.affiliate.api.RegistrationApi;
import travel.iko.affiliate.api.SavedSearchesApi;
import travel.iko.affiliate.api.SessionApi;
import travel.iko.affiliate.api.TrackApi;
import travel.iko.affiliate.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AnalyticsApi analyticsApi() {
		return new AnalyticsApi(apiClient());
	}

	@Bean
	public BookingsApi bookingApi() {
		return new BookingsApi(apiClient());
	}

	@Bean
	public CampaignApi campaignApi() {
		return new CampaignApi(apiClient());
	}

	@Bean
	public CardsApi cardsApi() {
		return new CardsApi(apiClient());
	}

	@Bean
	public CuratedListsApi curatedListsApi() {
		return new CuratedListsApi(apiClient());
	}

	@Bean
	public CustomizationApi customizationApi() {
		return new CustomizationApi(apiClient());
	}

	@Bean
	public DiscoverApi discoverApi() {
		return new DiscoverApi(apiClient());
	}

	@Bean
	public GridsApi gridsApi() {
		return new GridsApi(apiClient());
	}

	@Bean
	public IntegrationApi integrationApi() {
		return new IntegrationApi(apiClient());
	}

	@Bean
	public LeaderboardApi leaderboardApi() {
		return new LeaderboardApi(apiClient());
	}

	@Bean
	public LinksApi linksApi() {
		return new LinksApi(apiClient());
	}

	@Bean
	public MapsApi mapsApi() {
		return new MapsApi(apiClient());
	}

	@Bean
	public RegistrationApi registrationApi() {
		return new RegistrationApi(apiClient());
	}

	@Bean
	public SavedSearchesApi savedSearchesApi() {
		return new SavedSearchesApi(apiClient());
	}

	@Bean
	public SessionApi sessionApi() {
		return new SessionApi(apiClient());
	}

	@Bean
	public TrackApi trackApi() {
		return new TrackApi(apiClient());
	}
}
