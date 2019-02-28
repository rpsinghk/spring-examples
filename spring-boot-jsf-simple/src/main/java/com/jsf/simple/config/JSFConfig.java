package com.jsf.simple.config;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.faces.config.FacesInitializer;

@Configuration
public class JSFConfig{

	@Bean
    public ServletRegistrationBean<?> facesServletRegistration() {
        return  new JsfServletRegistrationBean();
    }
	
	class JsfServletRegistrationBean extends ServletRegistrationBean {

	    public JsfServletRegistrationBean() {
	        super();
	    }
	  
	    @Override
	    public String getDescription() {
	    	return "ConfigureJSF Servlet";
	    }
	    
	    @Override
	    public  ServletRegistration.Dynamic  addRegistration(String description, ServletContext servletContext){
	    	ServletRegistration.Dynamic dynamic  = null;
	        try {
	        	FacesInitializer facesInitializer = new FacesInitializer();
	            Set<Class<?>> clazz = new HashSet<Class<?>>();
	            clazz.add(JSFConfig.class);
	            facesInitializer.onStartup(clazz, servletContext);
			} catch (ServletException e) {
				e.printStackTrace();
			}
	        
	        return dynamic;
	    }
	}
	
}
