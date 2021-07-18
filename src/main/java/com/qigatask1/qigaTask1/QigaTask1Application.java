package com.qigatask1.qigaTask1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
 //@ComponentScan({ "com.qigatask1.qigaTask1.*" })
public class QigaTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(QigaTask1Application.class, args);
	}
}
