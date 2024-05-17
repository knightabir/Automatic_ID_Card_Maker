package com.abir.joblisting.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtAuthenticationEntryPoint point;

    @Autowired
    @Lazy
    private JwtAuthenticationFilter filter;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.csrf(csrf->csrf.disable())
                .exceptionHandling(ex->ex.authenticationEntryPoint(point))
                .sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/api/admin/**").hasAuthority("ADMIN")
                        .requestMatchers("/api/printer/**").hasAuthority("PRINTER")
                        .requestMatchers("/api/school/**").hasAuthority("SCHOOL")
                        .requestMatchers("/auth/login/**").permitAll()
                        .anyRequest().authenticated());

        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
