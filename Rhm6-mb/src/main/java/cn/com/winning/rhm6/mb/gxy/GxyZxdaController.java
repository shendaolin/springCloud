package cn.com.winning.rhm6.mb.gxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class GxyZxdaController {
	
	@Value("${spring.cloud.client.ipAddress}")
	String ip;

	@RequestMapping("/helloWorld")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from ip:" + ip;
	}
}
