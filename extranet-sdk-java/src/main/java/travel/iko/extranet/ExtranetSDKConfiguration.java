package travel.iko.extranet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtranetSDKConfiguration {
	@Value("${iko.travel.accesskey}")
	private String accessKey;

//	@Bean
//	public ApiClient apiClient() {
//		ApiClient apiClient = new ApiClient();
//
//		OAuth oauth = (OAuth) apiClient.getAuthentication("petstore_auth");
//		oauth.setAccessToken("special-key");
//
//		return apiClient;
//	}

}
