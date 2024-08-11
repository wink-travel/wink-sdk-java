package travel.wink.sdk.affiliate.inventory;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.inventory.api.CustomizationApi;
import travel.wink.sdk.affiliate.inventory.api.EmbeddableInventoriesApi;
import travel.wink.sdk.affiliate.inventory.api.ItemsApi;
import travel.wink.sdk.affiliate.inventory.api.GridsApi;
import travel.wink.sdk.affiliate.inventory.api.MapsApi;
import travel.wink.sdk.affiliate.inventory.api.InventoryLinksApi;
import travel.wink.sdk.affiliate.inventory.api.RankedGridsApi;
import travel.wink.sdk.affiliate.inventory.api.SupplierLinksApi;
import travel.wink.sdk.affiliate.inventory.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateInventorySDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public CustomizationApi customizationApi() {
		return new CustomizationApi(apiClient());
	}

	@Bean
	public EmbeddableInventoriesApi embeddableInventoriesApi() {
		return new EmbeddableInventoriesApi(apiClient());
	}

	@Bean
	public ItemsApi itemsApi() {
		return new ItemsApi(apiClient());
	}

	@Bean
	public GridsApi gridsApi() {
		return new GridsApi(apiClient());
	}

	@Bean
	public MapsApi mapsApi() {
		return new MapsApi(apiClient());
	}

	@Bean
	public InventoryLinksApi inventoryLinksApi() {
		return new InventoryLinksApi(apiClient());
	}

	@Bean
	public RankedGridsApi rankedGridsApi() {
		return new RankedGridsApi(apiClient());
	}

	@Bean
	public SupplierLinksApi supplierLinksApi() {
		return new SupplierLinksApi(apiClient());
	}
}
