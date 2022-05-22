package travel.wink.payment;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.payment.api.AccountApi;
import travel.wink.payment.api.AccountMappingsApi;
import travel.wink.payment.api.AgentApi;
import travel.wink.payment.api.ContractApi;
import travel.wink.payment.api.MappingApi;
import travel.wink.payment.api.PingApi;
import travel.wink.payment.invoker.ApiClient;

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
	public MappingApi mappingApi() {
		return new MappingApi(apiClient());
	}
	@Bean
	public PingApi pingApi() {
		return new PingApi(apiClient());
	}
}
