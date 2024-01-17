package com.IdCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.IdCard.service.impl")
public class IdCardMakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdCardMakerApplication.class, args);
	}

}
