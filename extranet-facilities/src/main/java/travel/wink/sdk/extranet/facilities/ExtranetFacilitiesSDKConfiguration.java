package travel.wink.sdk.extranet.facilities;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.facilities.api.GuestRoomApi;
import travel.wink.sdk.extranet.facilities.api.MeetingRoomApi;
import travel.wink.sdk.extranet.facilities.api.RestaurantApi;
import travel.wink.sdk.extranet.facilities.api.SpaApi;
import travel.wink.sdk.extranet.facilities.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetFacilitiesSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public GuestRoomApi guestRoomApi() {
		return new GuestRoomApi(apiClient());
	}

	@Bean
	public MeetingRoomApi meetingRoomApi() {
		return new MeetingRoomApi(apiClient());
	}

	@Bean
	public RestaurantApi restaurantApi() {
		return new RestaurantApi(apiClient());
	}

	@Bean
	public SpaApi spaApi() {
		return new SpaApi(apiClient());
	}

}
