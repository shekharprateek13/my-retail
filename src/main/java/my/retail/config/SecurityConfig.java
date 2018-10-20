package my.retail.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configureUser(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("password")).roles("ADMIN")
		.and().withUser("prateek").password(encoder.encode("root")).roles("ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		
//		http.authorizeRequests()
//		.mvcMatchers("/actuator/beans").hasRole("ADMIN")
//		.requestMatchers(EndpointRequest.to("health", "info")).permitAll()
//		.requestMatchers(EndpointRequest.toAnyEndpoint().excluding(MappingsEndpoint.class)).hasRole("ADMIN")
//		.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
//		.antMatchers("/products").fullyAuthenticated().and().httpBasic();
		
	}
}


/**

//package sample.actuator.customsecurity;
//
//import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
//import org.springframework.boot.actuate.web.mappings.MappingsEndpoint;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
//		return new InMemoryUserDetailsManager(
//				User.withDefaultPasswordEncoder().username("user").password("password")
//						.authorities("ROLE_USER").build(),
//				User.withDefaultPasswordEncoder().username("beans").password("beans")
//						.authorities("ROLE_BEANS").build(),
//				User.withDefaultPasswordEncoder().username("admin").password("admin")
//						.authorities("ROLE_ACTUATOR", "ROLE_USER").build());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// @formatter:off
//		http.authorizeRequests()
//				.mvcMatchers("/actuator/beans").hasRole("BEANS")
//				.requestMatchers(EndpointRequest.to("health", "info")).permitAll()
//				.requestMatchers(EndpointRequest.toAnyEndpoint().excluding(MappingsEndpoint.class)).hasRole("ACTUATOR")
//				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
//				.antMatchers("/foo").permitAll()
//				.antMatchers("/**").hasRole("USER")
//				.and()
//			.cors()
//				.and()
//			.httpBasic();
//		// @formatter:on
//	}
//
//}
 */
