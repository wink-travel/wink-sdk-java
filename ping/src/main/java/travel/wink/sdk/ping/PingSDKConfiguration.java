package travel.wink.sdk.ping;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.ping.api.PingApi;
import travel.wink.sdk.ping.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class PingSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public PingApi pingApi() {
		return new PingApi(apiClient());
	}

}
