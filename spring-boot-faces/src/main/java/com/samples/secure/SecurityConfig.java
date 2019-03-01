package com.samples.secure;

import org.springframework.beans.factory.annotation.Value;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {//extends WebSecurityConfigurerAdapter {
    @Value(value = "${auth.apiAudience}")
    private String apiAudience;
    @Value(value = "${auth.issuer}")
    private String issuer;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        JwtWebSecurityConfigurer
//                .forRS256(apiAudience, issuer)
//                .configure(http)
//                .cors().and().csrf().disable().authorizeRequests()
//                .anyRequest().permitAll();
//    }
}
