package com.marketwinks.mwnotifications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.marketwinks.mwnotifications.repository.NotificationRepository;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = { "com.*" })
@EnableMongoRepositories(basePackages = "com.marketwinks.mwnotifications.repository")
@EnableCaching
public class MwnotificationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MwnotificationsApplication.class, args);
	}

	@Autowired
	NotificationRepository NotificationRepository;

}
