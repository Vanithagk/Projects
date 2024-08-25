package com.example.onlineticket.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
@Component
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    //authentication
	@Bean
	public UserDetailsService userdetails(PasswordEncoder encrypts) {
		UserDetails user = User.withUsername("user")
				           .password(encrypts.encode("user123"))
				           .roles("USER")
				           .build();
		UserDetails admin=User.withUsername("admin")
				.password(encrypts.encode("admin123"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	//Authorization
	@Bean
	public SecurityFilterChain securityfilter(HttpSecurity security) throws Exception {
		return security.csrf().disable()
		        .authorizeHttpRequests()
		        .requestMatchers("/ticket/bus").permitAll()
		        .and()
		        .authorizeHttpRequests()
		        .requestMatchers("/ticket/**").authenticated()
		        .and()
		        .formLogin()
		        .and()
		        .httpBasic()
		        .and()
		        .build();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
