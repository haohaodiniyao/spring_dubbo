package com.demo.spring_dubbo_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_dubbo_api.HelloWorldService;

@RestController
public class DemoController {
	@Autowired
	private HelloWorldService helloWorldService;
	@RequestMapping("/test")
	public String sayHello(String msg){
		System.out.println("msg:"+helloWorldService.sayMsg(msg));
		return msg;
	}
}
