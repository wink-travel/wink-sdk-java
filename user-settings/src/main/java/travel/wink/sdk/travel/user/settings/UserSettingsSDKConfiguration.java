package travel.wink.sdk.travel.user.settings;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.user.settings.api.ApplicationApi;
import travel.wink.sdk.user.settings.api.BucketListApi;
import travel.wink.sdk.user.settings.api.UserSettingsApi;
import travel.wink.sdk.user.settings.api.WebhookApi;
import travel.wink.sdk.user.settings.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class UserSettingsSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}


	@Bean
	public ApplicationApi applicationApi() {
		return new ApplicationApi(apiClient());
	}

	@Bean
	public BucketListApi bucketListApi() {
		return new BucketListApi(apiClient());
	}

	@Bean
	public UserSettingsApi userSettingsApi() {
		return new UserSettingsApi(apiClient());
	}

	@Bean
	public WebhookApi webhookApi() {
		return new WebhookApi(apiClient());
	}
}
