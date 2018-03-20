package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(value="eurekaClient",fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	public String sayHello();
	
	@RequestMapping(value = "/hello1" ,method = RequestMethod.GET)
	public String sayHello(@RequestParam("name") String name);

	@RequestMapping(value = "/hello2" ,method = RequestMethod.GET)
	public User sayHello(@RequestHeader("name") String name,@RequestHeader("age") int age);
	
	
	@RequestMapping(value = "/hello3",method = RequestMethod.POST)
	public String sayHello(@RequestBody User user);
}
