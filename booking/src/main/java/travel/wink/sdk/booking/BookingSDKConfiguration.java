package travel.wink.sdk.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.booking.api.BookingApi;
import travel.wink.sdk.booking.api.CheckoutApi;
import travel.wink.sdk.booking.api.ReviewApi;
import travel.wink.sdk.booking.api.ShoppingCartApi;
import travel.wink.sdk.booking.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class BookingSDKConfiguration {
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
	public CheckoutApi checkoutApi() {
		return new CheckoutApi(apiClient());
	}

	@Bean
	public ReviewApi reviewApi() {
		return new ReviewApi(apiClient());
	}

	@Bean
	public ShoppingCartApi shoppingCartApi() {
		return new ShoppingCartApi(apiClient());
	}

}
