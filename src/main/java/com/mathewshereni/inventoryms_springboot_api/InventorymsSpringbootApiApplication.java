package com.mathewshereni.inventoryms_springboot_api;

import com.mathewshereni.inventoryms_springboot_api.security.SpringSecurityAuditorAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class InventorymsSpringbootApiApplication {
	@Bean
	public AuditorAware<String> auditorAware(){
		return  new SpringSecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(InventorymsSpringbootApiApplication.class, args);
	}

}
