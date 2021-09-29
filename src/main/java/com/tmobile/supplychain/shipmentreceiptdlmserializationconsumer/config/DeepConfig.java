package com.tmobile.supplychain.shipmentreceiptdlmserializationconsumer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class DeepConfig {
	@Value("${deep.rules.uri}")
	String rulesURI;
	@Value("${deep.env}")
	String env;
	@Value("${deep.consumerName}")
	String consumerName;
	@Value("${deep.consumer.userName}")
	String userName;
	@Value("${deep.consumer.password}")
	String password;
}
