package com.forezp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod="HiError")
	public String hiService() {
		return restTemplate.getForObject("http://EUREKACLIENT/hi", String.class);
	}

	public String HiError() {

		return "error";
	}
}
