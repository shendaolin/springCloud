package cn.com.winning.rhm6.frame.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AgentController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "{application}/*")
	public String agent(HttpServletRequest request, @PathVariable String application,
			@RequestParam String name) {
		String method = request.getMethod();
		String queryString = request.getQueryString();
		String uri = request.getRequestURI();
		System.out.println("http:/" + uri + "?" + queryString);
		return restTemplate.getForObject("http:/" + uri + "?" + queryString, String.class);
	}
}
