package travel.wink.sdk.travel.agent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.travel.agent.api.TravelAgentApi;
import travel.wink.sdk.travel.agent.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class TravelAgentSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}


	@Bean
	public TravelAgentApi travelAgentApi() {
		return new TravelAgentApi(apiClient());
	}
}
