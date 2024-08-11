package travel.wink.sdk.affiliate;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.api.AffiliateApi;
import travel.wink.sdk.affiliate.api.AccountManagerApi;
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
	public AffiliateApi affiliateApi() {
		return new AffiliateApi(apiClient());
	}

	@Bean
	public AccountManagerApi accountManagerApi() {
		return new AccountManagerApi(apiClient());
	}
}
