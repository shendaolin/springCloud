package cn.com.winning.rhm6.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Rhm6EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Rhm6EurekaServerApplication.class, args);
	}
}
