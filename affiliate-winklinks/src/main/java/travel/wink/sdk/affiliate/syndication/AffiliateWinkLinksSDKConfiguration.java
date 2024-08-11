package travel.wink.sdk.affiliate.syndication;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.syndication.api.SyndicationPublisherApi;
import travel.wink.sdk.affiliate.syndication.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateWinkLinksSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public SyndicationPublisherApi syndicationPublisherApi() {
		return new SyndicationPublisherApi(apiClient());
	}
}
