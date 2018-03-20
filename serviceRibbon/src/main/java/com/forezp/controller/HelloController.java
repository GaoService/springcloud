package com.forezp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.forezp.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService service;
	
	@RequestMapping("/hi")
	public String hiService(){
		return service.hiService();
	}
}
