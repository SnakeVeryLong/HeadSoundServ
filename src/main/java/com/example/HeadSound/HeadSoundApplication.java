package com.example.HeadSound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class HeadSoundApplication {

		public static void main (String[]args){
			try {
				SpringApplication.run(HeadSoundApplication.class, args);
			}
			catch (Throwable t){
				System.out.println(t.getMessage());
				t.printStackTrace();
			}

		}
	@RequestMapping(value = "/products")
	public String getProductName() {
		return "Honey";
	}
}
