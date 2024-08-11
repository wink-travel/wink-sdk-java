package travel.wink.sdk.extranet.distribution;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.distribution.api.AffiliateApi;
import travel.wink.sdk.extranet.distribution.api.DailyRateApi;
import travel.wink.sdk.extranet.distribution.api.InventoryApi;
import travel.wink.sdk.extranet.distribution.api.InventoryUsageApi;
import travel.wink.sdk.extranet.distribution.api.SalesChannelApi;
import travel.wink.sdk.extranet.distribution.api.SchedulerApi;
import travel.wink.sdk.extranet.distribution.api.SalesChannelRelationshipRequestsApi;
import travel.wink.sdk.extranet.distribution.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetDistributionSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AffiliateApi affiliateApi() {
		return new AffiliateApi(apiClient());
	}

	@Bean
	public DailyRateApi dailyRateApi() {
		return new DailyRateApi(apiClient());
	}

	@Bean
	public InventoryApi inventoryApi() {
		return new InventoryApi(apiClient());
	}

	@Bean
	public InventoryUsageApi inventoryUsageApi() {
		return new InventoryUsageApi(apiClient());
	}

	@Bean
	public SalesChannelApi salesChannelApi() {
		return new SalesChannelApi(apiClient());
	}

	@Bean
	public SchedulerApi schedulerApi() {
		return new SchedulerApi(apiClient());
	}

	@Bean
	public SalesChannelRelationshipRequestsApi salesChannelRelationshipRequestsApi() {
		return new SalesChannelRelationshipRequestsApi(apiClient());
	}
}
