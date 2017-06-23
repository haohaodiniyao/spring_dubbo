package com.demo.spring_dubbo_service;

import com.demo.spring_dubbo_api.HelloWorldService;
/**
 * 服务实现
 * @author yaokai
 *
 */
public class HelloWorldServiceImp implements HelloWorldService {

	@Override
	public String sayMsg(String msg) {
		System.out.println(msg);
		return msg;
	}

}
