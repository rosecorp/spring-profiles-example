package com.rosecorp.springprofilesexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@PropertySource(value = {
		"classpath:application.yml"},
		ignoreResourceNotFound = true)
@EnableScheduling
public class SpringProfilesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesExampleApplication.class, args);

	}
}
