package travel.wink.sdk.affiliate.sales.channel;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.sales.channel.api.AvailableSupplierApi;
import travel.wink.sdk.affiliate.sales.channel.api.RelationshipRequestApi;
import travel.wink.sdk.affiliate.sales.channel.api.SalesChannelApi;
import travel.wink.sdk.affiliate.sales.channel.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateSalesChannelSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AvailableSupplierApi availableSupplierApi() {
		return new AvailableSupplierApi(apiClient());
	}

	@Bean
	public RelationshipRequestApi relationshipRequestApi() {
		return new RelationshipRequestApi(apiClient());
	}

	@Bean
	public SalesChannelApi salesChannelApi() {
		return new SalesChannelApi(apiClient());
	}
}
