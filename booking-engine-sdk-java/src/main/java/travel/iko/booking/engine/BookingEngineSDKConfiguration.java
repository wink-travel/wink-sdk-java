package travel.iko.booking.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.iko.booking.engine.api.BookingApi;
import travel.iko.booking.engine.api.ByLookupApi;
import travel.iko.booking.engine.api.ByPropertyApi;
import travel.iko.booking.engine.api.ByRecordApi;
import travel.iko.booking.engine.api.LookupApi;
import travel.iko.booking.engine.api.RegistrationApi;
import travel.iko.booking.engine.api.SessionApi;
import travel.iko.booking.engine.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class BookingEngineSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public RegistrationApi registrationApi() {
		return new RegistrationApi(apiClient());
	}

	@Bean
	public BookingApi bookingApi() {
		return new BookingApi(apiClient());
	}

	@Bean
	public ByLookupApi byLookupApi() {
		return new ByLookupApi(apiClient());
	}

	@Bean
	public ByPropertyApi byPropertyApi() {
		return new ByPropertyApi(apiClient());
	}

	@Bean
	public ByRecordApi byRecordApi() {
		return new ByRecordApi(apiClient());
	}

	@Bean
	public LookupApi lookupApi() {
		return new LookupApi(apiClient());
	}

	@Bean
	public SessionApi sessionApi() {
		return new SessionApi(apiClient());
	}
}
