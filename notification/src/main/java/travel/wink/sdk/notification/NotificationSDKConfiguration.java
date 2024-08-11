package travel.wink.sdk.notification;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.notification.api.NotificationApi;
import travel.wink.sdk.notification.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class NotificationSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public NotificationApi notificationApi() {
		return new NotificationApi(apiClient());
	}

}
