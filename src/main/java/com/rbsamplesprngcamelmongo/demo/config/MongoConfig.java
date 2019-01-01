package com.rbsamplesprngcamelmongo.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;

@Configuration
public class MongoConfig {
	
	@Bean("mongoBean")
	public MongoClient getMongoClient(){
		return new MongoClient(new ServerAddress("localhost"), new MongoClientOptions.Builder().build());
	}

}
