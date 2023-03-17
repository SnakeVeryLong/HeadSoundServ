package com.example.HeadSound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

}
