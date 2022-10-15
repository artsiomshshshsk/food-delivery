package com.artsiomshshshsk.fooddelivery.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .httpBasic().disable()
                .headers().frameOptions().disable()
                .and()
                .authorizeRequests().antMatchers("/h2-console/**",
                        "/login",
                        "/swagger-resources/**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**",
                        "/v3/api-docs").permitAll()
                .anyRequest().authenticated()
                .and()
//                .formLogin();
                .httpBasic();
    }


    @Bean(name = "JDBCdataSource")
    UserDetailsService dataSource(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }
}
