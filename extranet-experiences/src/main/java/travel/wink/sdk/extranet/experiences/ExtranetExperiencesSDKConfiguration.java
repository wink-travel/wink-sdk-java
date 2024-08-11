package travel.wink.sdk.extranet.experiences;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.experiences.api.ActivityApi;
import travel.wink.sdk.extranet.experiences.api.AttractionApi;
import travel.wink.sdk.extranet.experiences.api.PlaceApi;
import travel.wink.sdk.extranet.experiences.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetExperiencesSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public ActivityApi activityApi() {
		return new ActivityApi(apiClient());
	}

	@Bean
	public AttractionApi attractionApi() {
		return new AttractionApi(apiClient());
	}

	@Bean
	public PlaceApi placeApi() {
		return new PlaceApi(apiClient());
	}

}
