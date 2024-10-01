package io.sebkostems.spring_test_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable());
        http.cors((cors) -> cors.disable());
        http.authorizeHttpRequests((requests) -> {
            requests.anyRequest().permitAll();
        })
                .headers(headers -> headers
                        .xssProtection(
                                (xss) -> xss.headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK))
                        .contentSecurityPolicy((cps) -> cps.policyDirectives(
                                "default-src * resource://devtools; connect-src 'self' 'unsafe-inline' localhost resource://devtools; style-src 'self' 'unsafe-inline'; script-src 'self' 'unsafe-inline' 'unsafe-eval' ")));

        return http.build();
    }

}
