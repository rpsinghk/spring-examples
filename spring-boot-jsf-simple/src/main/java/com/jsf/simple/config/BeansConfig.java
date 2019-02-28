package com.jsf.simple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jsf.simple.bean.JSFSpringBean;

@Configuration
public class BeansConfig {
	@Bean
	public JSFSpringBean jsfSpringBean() {
		return new JSFSpringBean();
	}

}
