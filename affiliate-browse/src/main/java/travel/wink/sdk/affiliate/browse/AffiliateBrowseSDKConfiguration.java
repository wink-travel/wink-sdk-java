package travel.wink.sdk.affiliate.browse;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import travel.wink.sdk.affiliate.browse.api.SearchCategoriesApi;
import travel.wink.sdk.affiliate.browse.api.BrowseApi;
import travel.wink.sdk.affiliate.browse.api.CuratedListApi;
import travel.wink.sdk.affiliate.browse.api.SavedSearchApi;
import travel.wink.sdk.affiliate.browse.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class AffiliateBrowseSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public BrowseApi browseApi() {
		return new BrowseApi(apiClient());
	}

	@Bean
	public CuratedListApi curatedListApi() {
		return new CuratedListApi(apiClient());
	}

	@Bean
	public SavedSearchApi savedSearchApi() {
		return new SavedSearchApi(apiClient());
	}
	@Bean
	public SearchCategoriesApi searchCategoriesApi() {
		return new SearchCategoriesApi(apiClient());
	}

}
