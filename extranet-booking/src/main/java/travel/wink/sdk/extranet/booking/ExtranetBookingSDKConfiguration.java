package travel.wink.sdk.extranet.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.booking.api.BookingApi;
import travel.wink.sdk.extranet.booking.api.ReviewApi;
import travel.wink.sdk.extranet.booking.api.CalendarSyncApi;
import travel.wink.sdk.extranet.booking.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetBookingSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public BookingApi bookingApi() {
		return new BookingApi(apiClient());
	}

	@Bean
	public ReviewApi reviewApi() {
		return new ReviewApi(apiClient());
	}

	@Bean
	public CalendarSyncApi calendarSyncApi() {
		return new CalendarSyncApi(apiClient());
	}
}
