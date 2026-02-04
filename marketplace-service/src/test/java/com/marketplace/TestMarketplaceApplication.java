package com.marketplace;

import org.springframework.boot.SpringApplication;

public class TestMarketplaceApplication {

	public static void main(String[] args) {
		SpringApplication.from(MarketplaceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
