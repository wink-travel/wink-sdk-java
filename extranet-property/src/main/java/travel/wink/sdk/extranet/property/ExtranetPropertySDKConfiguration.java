package travel.wink.sdk.extranet.property;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.property.api.AnnouncementApi;
import travel.wink.sdk.extranet.property.api.ChannelManagerApi;
import travel.wink.sdk.extranet.property.api.GeoLocationApi;
import travel.wink.sdk.extranet.property.api.LifestyleApi;
import travel.wink.sdk.extranet.property.api.MediaApi;
import travel.wink.sdk.extranet.property.api.PolicyApi;
import travel.wink.sdk.extranet.property.api.PropertyApi;
import travel.wink.sdk.extranet.property.api.RecognitionApi;
import travel.wink.sdk.extranet.property.api.SocialNetworkApi;
import travel.wink.sdk.extranet.property.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetPropertySDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AnnouncementApi announcementApi() {
		return new AnnouncementApi(apiClient());
	}

	@Bean
	public ChannelManagerApi channelManagerApi() {
		return new ChannelManagerApi(apiClient());
	}

	@Bean
	public GeoLocationApi geoLocationApi() {
		return new GeoLocationApi(apiClient());
	}

	@Bean
	public LifestyleApi lifestyleApi() {
		return new LifestyleApi(apiClient());
	}

	@Bean
	public MediaApi mediaApi() {
		return new MediaApi(apiClient());
	}

	@Bean
	public PolicyApi policyApi() {
		return new PolicyApi(apiClient());
	}

	@Bean
	public PropertyApi propertyApi() {
		return new PropertyApi(apiClient());
	}

	@Bean
	public RecognitionApi recognitionApi() {
		return new RecognitionApi(apiClient());
	}

	@Bean
	public SocialNetworkApi socialNetworkApi() {
		return new SocialNetworkApi(apiClient());
	}

}
