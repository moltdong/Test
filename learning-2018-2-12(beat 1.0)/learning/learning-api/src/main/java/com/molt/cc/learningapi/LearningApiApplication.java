package com.molt.cc.learningapi;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Molt
 */
@ServletComponentScan
@SpringBootApplication
@ComponentScan("com.molt.cc")
public class LearningApiApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(LearningApiApplication.class);
 		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(LearningApiApplication.class);
	}

}
