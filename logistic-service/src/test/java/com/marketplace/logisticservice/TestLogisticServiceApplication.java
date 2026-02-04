package com.marketplace.logisticservice;

import org.springframework.boot.SpringApplication;

public class TestLogisticServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(LogisticServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
