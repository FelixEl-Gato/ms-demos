package com.synopsis.infrastructure.observability;

import org.springframework.boot.SpringApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableScheduling
@EnableAdminServer
public class ObservabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservabilityApplication.class, args);
	}

}
