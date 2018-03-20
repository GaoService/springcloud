package com.forezp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.didispace.service.HelloService;
import com.didispace.service.User;

@RestController
public class RefactorHelloController implements HelloService{

	@Override
	public String sayHello(String name) {

		return "Hello" + name;
	}

	@Override
	public User sayHello(String name, int age) {

		return new User(name,age);
	}

	@Override
	public String sayHello(User user) {

		return "Hello" + user.getName() + "," + user.getAge();
	}

}
