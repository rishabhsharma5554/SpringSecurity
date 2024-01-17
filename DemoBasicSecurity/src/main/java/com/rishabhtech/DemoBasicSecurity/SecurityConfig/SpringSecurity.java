package com.rishabhtech.DemoBasicSecurity.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		UserDetails userDetails = User.builder()
				.username("user")
				.password("user")
				.roles("USER")
				.build();

		UserDetails adminDetails = User.builder()
				.username("admin")
				.password("admin")
				.roles("ADMIN")
				.build();
		
		UserDetails superaAdminDetails = User.builder()
				.username("superadmin")
				.password("superadmin")
				.roles("SUPER_ADMIN")
				.build();

		return new InMemoryUserDetailsManager(userDetails, adminDetails, superaAdminDetails);
	}


	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
