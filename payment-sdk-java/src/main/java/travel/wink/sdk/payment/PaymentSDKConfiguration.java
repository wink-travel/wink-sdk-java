package travel.wink.sdk.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.payment.api.AccountApi;
import travel.wink.sdk.payment.api.AccountMappingsApi;
import travel.wink.sdk.payment.api.AgentApi;
import travel.wink.sdk.payment.api.ContractApi;
import travel.wink.sdk.payment.api.PingApi;
import travel.wink.sdk.payment.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class PaymentSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AccountApi accountApi() {
		return new AccountApi(apiClient());
	}
	@Bean
	public AccountMappingsApi accountMappingsApi() {
		return new AccountMappingsApi(apiClient());
	}
	@Bean
	public AgentApi agentApi() {
		return new AgentApi(apiClient());
	}
	@Bean
	public ContractApi contractApi() {
		return new ContractApi(apiClient());
	}
	@Bean
	public PingApi pingApi() {
		return new PingApi(apiClient());
	}
}
