package com.user.login.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Config {
	
	@Bean
	public OpenAPI cusOpenAPI() {
		return new OpenAPI().info(new Info()
                .title("User Service")
                .version("1.0")
                .description("Sample Swagger API documentation"));
	}
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

}
