package travel.wink.booking.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.booking.engine.api.BookingApi;
import travel.wink.booking.engine.api.InventoryApi;
import travel.wink.booking.engine.api.LookupApi;
import travel.wink.booking.engine.api.ReferenceApi;
import travel.wink.booking.engine.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class BookingEngineSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public InventoryApi inventoryApi() {
		return new InventoryApi(apiClient());
	}

	@Bean
	public BookingApi bookingApi() {
		return new BookingApi(apiClient());
	}

	@Bean
	public ReferenceApi referenceApi() {
		return new ReferenceApi(apiClient());
	}

	@Bean
	public LookupApi lookupApi() {
		return new LookupApi(apiClient());
	}

}
