package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
public class WebSecurity {
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(requests -> {
				try {
					requests
							.requestMatchers("security-none/", "/security-none/**")
							.permitAll()
							.anyRequest()
							.authenticated();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			})
			.httpBasic(Customizer.withDefaults());

		return http.build();
	}
}
