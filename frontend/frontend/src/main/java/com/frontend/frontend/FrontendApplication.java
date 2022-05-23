package com.frontend.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.HttpHeaders;

@SpringBootApplication
public class FrontendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Bean
	public WebClient getWebClient(WebClient.Builder webClient){
		return webClient
				.baseUrl("http://localhost:8080")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}

}
