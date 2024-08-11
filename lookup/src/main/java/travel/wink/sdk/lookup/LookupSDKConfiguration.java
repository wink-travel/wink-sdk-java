package travel.wink.sdk.lookup;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.lookup.api.LookupApi;
import travel.wink.sdk.lookup.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class LookupSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public LookupApi lookupApi() {
		return new LookupApi(apiClient());
	}

}
