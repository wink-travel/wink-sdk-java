package travel.wink.sdk.reference;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.reference.api.GeoNameApi;
import travel.wink.sdk.reference.api.ReferenceApi;
import travel.wink.sdk.reference.api.TestApi;
import travel.wink.sdk.reference.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ReferenceSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}


	@Bean
	public ReferenceApi referenceApi() {
		return new ReferenceApi(apiClient());
	}

	@Bean
	public GeoNameApi geoNameApi() {
		return new GeoNameApi(apiClient());
	}

	@Bean
	public TestApi testApi() {
		return new TestApi(apiClient());
	}
}
