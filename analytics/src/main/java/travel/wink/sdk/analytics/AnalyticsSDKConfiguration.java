package travel.wink.sdk.analytics;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.analytics.api.AnalyticsApi;
import travel.wink.sdk.analytics.api.LeaderboardApi;
import travel.wink.sdk.analytics.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AnalyticsSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AnalyticsApi bookingApi() {
		return new AnalyticsApi(apiClient());
	}

    @Bean
    public LeaderboardApi leaderboardApi() {
        return new LeaderboardApi(apiClient());
    }
}
