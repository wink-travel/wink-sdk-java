package travel.wink.sdk.affiliate;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.api.ApplicationApi;
import travel.wink.sdk.affiliate.api.BookingsApi;
import travel.wink.sdk.affiliate.api.CampaignApi;
import travel.wink.sdk.affiliate.api.CompanyApi;
import travel.wink.sdk.affiliate.api.CustomizationApi;
import travel.wink.sdk.affiliate.api.DiscoverApi;
import travel.wink.sdk.affiliate.api.InventoryCardsApi;
import travel.wink.sdk.affiliate.api.InventoryGridsApi;
import travel.wink.sdk.affiliate.api.InvoiceApi;
import travel.wink.sdk.affiliate.api.MapsApi;
import travel.wink.sdk.affiliate.api.InventoryLinksApi;
import travel.wink.sdk.affiliate.api.SupplierLinksApi;
import travel.wink.sdk.affiliate.api.AffiliateLeadApi;
import travel.wink.sdk.affiliate.api.HotelRelationshipRequestsApi;
import travel.wink.sdk.affiliate.api.NotificationApi;
import travel.wink.sdk.affiliate.api.SalesChannelApi;
import travel.wink.sdk.affiliate.api.SearchCategoriesApi;
import travel.wink.sdk.affiliate.api.SupplierApi;
import travel.wink.sdk.affiliate.api.SyndicationEntryPublisherApi;
import travel.wink.sdk.affiliate.api.TestApi;
import travel.wink.sdk.affiliate.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AffiliateLeadApi affiliateLeadApi() {
		return new AffiliateLeadApi(apiClient());
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
	public ApplicationApi applicationApi() {
		return new ApplicationApi(apiClient());
	}

	@Bean
	public CompanyApi companyApi() {
		return new CompanyApi(apiClient());
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
	public HotelRelationshipRequestsApi hotelRelationshipRequestsApi() {
		return new HotelRelationshipRequestsApi(apiClient());
	}

	@Bean
	public InventoryLinksApi inventoryLinksApi() {
		return new InventoryLinksApi(apiClient());
	}

	@Bean
	public InventoryCardsApi inventoryCardsApi() {
		return new InventoryCardsApi(apiClient());
	}

	@Bean
	public InventoryGridsApi inventoryGridsApi() {
		return new InventoryGridsApi(apiClient());
	}

	@Bean
	public InvoiceApi invoiceApi() {
		return new InvoiceApi(apiClient());
	}

	@Bean
	public MapsApi mapsApi() {
		return new MapsApi(apiClient());
	}

	@Bean
	public NotificationApi notificationApi() {
		return new NotificationApi(apiClient());
	}

	@Bean
	public SalesChannelApi salesChannelApi() {
		return new SalesChannelApi(apiClient());
	}

	@Bean
	public SearchCategoriesApi searchCategoriesApi() {
		return new SearchCategoriesApi(apiClient());
	}

	@Bean
	public SupplierApi supplierApi() {
		return new SupplierApi(apiClient());
	}

	@Bean
	public SupplierLinksApi supplierLinksApi() {
		return new SupplierLinksApi(apiClient());
	}

	@Bean
	public SyndicationEntryPublisherApi syndicationEntryPublisherApi() {
		return new SyndicationEntryPublisherApi(apiClient());
	}

	@Bean
	public TestApi testApi() {
		return new TestApi(apiClient());
	}
}
