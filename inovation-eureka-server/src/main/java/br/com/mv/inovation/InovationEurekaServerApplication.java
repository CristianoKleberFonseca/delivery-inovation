package br.com.mv.inovation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InovationEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InovationEurekaServerApplication.class, args);
	}
}
