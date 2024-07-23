package com.vamsi.rest.webservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
	//url: /hello-world
	
	//"Hello World"
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
}
