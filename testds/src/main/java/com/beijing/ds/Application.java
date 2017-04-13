package com.beijing.ds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhaozhou on 2017/4/6.
 */
@PropertySource("classpath:application.yml")
@PropertySource("classpath:datasouce.properties")
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
