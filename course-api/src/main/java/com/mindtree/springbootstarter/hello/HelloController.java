package com.mindtree.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public Topic sayHi()
	{
		Topic t =new Topic();
		t.setId("01");
		t.setDescription("Spring Boot with Jenkins");
		t.setName("Java");
	}
}
