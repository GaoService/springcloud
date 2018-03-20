package com.didispace.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("refactor")
public interface HelloService {
	
	@RequestMapping(value = "/hello4" ,method = RequestMethod.GET)
	public String sayHello(@RequestParam("name") String name);

	@RequestMapping(value = "/hello5" ,method = RequestMethod.GET)
	public User sayHello(@RequestHeader("name") String name,@RequestHeader("age") int age);
	
	
	@RequestMapping(value = "/hello6",method = RequestMethod.POST)
	public String sayHello(@RequestBody User user);
}
