package WebAPIs.ProductAPI;


import java.util.Collections;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ProductApiApplication {
	
		public static void main(String[] args) {
		
		
		SpringApplication application = new SpringApplication(ProductApiApplication.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "8884"));
        application.run(args);
		
	}

}
