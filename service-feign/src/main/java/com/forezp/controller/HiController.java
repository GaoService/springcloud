package com.forezp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.service.SchedualServiceHi;
import com.forezp.service.User;

@RestController
public class HiController {

	@Autowired
	SchedualServiceHi service;
	
	@RequestMapping(value = "/hi",method =RequestMethod.GET)
	public String sayHello(){
		
		return service.sayHello();
	}
	
	@RequestMapping(value = "/feign" ,method = RequestMethod.GET)
	public String helloConsumer2(){
		
		StringBuilder builder = new StringBuilder();
		builder.append(service.sayHello());
		builder.append(service.sayHello("DIDI"));
		builder.append(service.sayHello("DIDI", 30));
		builder.append(service.sayHello(new User("DIDI",30)));
		return builder.toString();
		
	}
}
