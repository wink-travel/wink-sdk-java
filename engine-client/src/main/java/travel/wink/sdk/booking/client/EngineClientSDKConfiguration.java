package travel.wink.sdk.booking.client;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.booking.client.api.ConfigurationApi;
import travel.wink.sdk.booking.client.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class EngineClientSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public ConfigurationApi configurationApi() {
		return new ConfigurationApi(apiClient());
	}
}
