package com.whyNot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@Configuration
@MapperScan(basePackages = "com.whyNot.model.dao")
@SpringBootApplication
public class WhyNotApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(WhyNotApplication.class, args);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry){
		registry.addResourceHandler("/api/**").addResourceLocations("classpath:/static/");
		
		registry.addResourceHandler("/swagger-ui/**")
		.addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
	}
	
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/api/**")
//                .allowedOrigins("http://localhost:5173")
//                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                .allowCredentials(true);
//    }



}
