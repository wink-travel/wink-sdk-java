package travel.wink.sdk.inventory;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.inventory.api.InventoryApi;
import travel.wink.sdk.inventory.api.ShareableLinkApi;
import travel.wink.sdk.inventory.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class InventorySDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public InventoryApi inventoryApi() {
		return new InventoryApi(apiClient());
	}

	@Bean
	public ShareableLinkApi shareableLinkApi() {
		return new ShareableLinkApi(apiClient());
	}

}
