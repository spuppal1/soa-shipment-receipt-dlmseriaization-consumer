package com.tmobile.supplychain.shipmentreceiptdlmserializationconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@Configuration
@ComponentScan(basePackages = {"com.tmobile.deep", "com.tmobile.supplychain"})
@EnableJpaRepositories(basePackages = {"com.tmobile.supplychain.shipmentreceiptdlmserializationconsumer.repository"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ShipmentReceiptDlmSerializationConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShipmentReceiptDlmSerializationConsumerApplication.class, args);

	}
}