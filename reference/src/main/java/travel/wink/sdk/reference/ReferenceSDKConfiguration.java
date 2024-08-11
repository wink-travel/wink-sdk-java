package travel.wink.sdk.reference;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.reference.api.GeoDataApi;
import travel.wink.sdk.reference.api.ReferenceApi;
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
	public GeoDataApi geoDataApi() {
		return new GeoDataApi(apiClient());
	}
}
