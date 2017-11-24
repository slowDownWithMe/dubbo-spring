package com.zhangfeng.dubbo.provider;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Welcome to ZhangFeng's Dubbo, Hello " + name;
	}

}
