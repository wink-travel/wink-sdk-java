package travel.wink.sdk.events;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.events.api.IntegrationsApi;
import travel.wink.sdk.events.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class EventsSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public IntegrationsApi integrationsApi() {
		return new IntegrationsApi(apiClient());
	}
}
