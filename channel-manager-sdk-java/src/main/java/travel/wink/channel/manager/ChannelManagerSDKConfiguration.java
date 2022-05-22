package travel.wink.channel.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.channel.manager.api.ChannelManagerApi;
import travel.wink.channel.manager.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ChannelManagerSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public ChannelManagerApi channelManagerApi() {
		return new ChannelManagerApi(apiClient());
	}

}
