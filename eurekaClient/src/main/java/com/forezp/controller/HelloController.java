package com.forezp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${server.port}")
	String post;
	
	@RequestMapping("/hi")
	public String  hello(){
		return "Hello word" + post;
	}
	
	@RequestMapping(value="/hello1",method = RequestMethod.GET)
	public String hello(@RequestParam String name){
		
		return "hello" + name;
	}
	
	@RequestMapping(value="/hello2",method = RequestMethod.GET)
	public User hello(@RequestHeader String name,@RequestHeader Integer age){
		
		return new User(name,age);
	}
	
	@RequestMapping(value="/hello3",method = RequestMethod.POST)
	public String hello(@RequestBody User user){
		
		return "hello" + user.getName() + "," + user.getAge();
	}
}
