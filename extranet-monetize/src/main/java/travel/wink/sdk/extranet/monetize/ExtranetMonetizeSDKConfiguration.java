package travel.wink.sdk.extranet.monetize;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.monetize.api.AddOnApi;
import travel.wink.sdk.extranet.monetize.api.CancellationPolicyApi;
import travel.wink.sdk.extranet.monetize.api.MasterRateApi;
import travel.wink.sdk.extranet.monetize.api.PromotionApi;
import travel.wink.sdk.extranet.monetize.api.PromotionBundleApi;
import travel.wink.sdk.extranet.monetize.api.RatePlanApi;
import travel.wink.sdk.extranet.monetize.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetMonetizeSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AddOnApi addOnApi() {
		return new AddOnApi(apiClient());
	}

	@Bean
	public CancellationPolicyApi cancellationPolicyApi() {
		return new CancellationPolicyApi(apiClient());
	}

	@Bean
	public MasterRateApi masterRateApi() {
		return new MasterRateApi(apiClient());
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
	public RatePlanApi ratePlanApi() {
		return new RatePlanApi(apiClient());
	}

}
