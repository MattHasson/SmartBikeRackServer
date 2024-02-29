package com.bikenest.smartbikerackserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SmartBikeRackServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartBikeRackServerApplication.class, args);
	}

}
