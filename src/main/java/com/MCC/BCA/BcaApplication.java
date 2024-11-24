package com.MCC.BCA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "https://mccbca.netlify.app")
public class BcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcaApplication.class, args);
	}

}
