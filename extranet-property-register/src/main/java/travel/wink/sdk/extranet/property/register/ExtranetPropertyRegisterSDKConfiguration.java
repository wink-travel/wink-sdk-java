package travel.wink.sdk.extranet.property.register;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.extranet.property.register.api.ManageLeadsApi;
import travel.wink.sdk.extranet.property.register.api.PropertyRegistrationApi;
import travel.wink.sdk.extranet.property.register.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class ExtranetPropertyRegisterSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public ManageLeadsApi manageLeadsApi() {
		return new ManageLeadsApi(apiClient());
	}

	@Bean
	public PropertyRegistrationApi propertyRegistrationApi() {
		return new PropertyRegistrationApi(apiClient());
	}

}
