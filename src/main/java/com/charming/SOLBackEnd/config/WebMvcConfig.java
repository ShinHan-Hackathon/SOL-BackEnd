package com.charming.SOLBackEnd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080", "http://localhost:3000")
                .allowedMethods("GET","POST","PUT","PATCH","DELETE","OPTIONS")
                .allowedHeaders("headers")
                .allowCredentials(true)
                .maxAge(3000);
    }
}
