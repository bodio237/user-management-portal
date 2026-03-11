package com.pricilia.usermanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())        // désactive la protection CSRF
            .cors(cors -> cors.disable())        // désactive CORS temporairement
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()        // autorise toutes les requêtes
            );

        return http.build();
    }
}