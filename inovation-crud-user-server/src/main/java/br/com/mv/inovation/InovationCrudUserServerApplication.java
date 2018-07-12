package br.com.mv.inovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InovationCrudUserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InovationCrudUserServerApplication.class, args);
	}
}
