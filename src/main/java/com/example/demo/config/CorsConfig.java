package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:8080") // 보안에서 vue는 허용하겠다.
                .allowedOrigins("http://localhost:8080")
                .allowedOrigins("http://43.201.152.175")
                .allowedOrigins("ec2-43-201-152-175.ap-northeast-2.compute.amazonaws.com")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
