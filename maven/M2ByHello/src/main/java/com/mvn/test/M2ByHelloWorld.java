package com.mvn.test;

import com.mvn.test.HelloWorld;
public class M2ByHelloWorld{

	public String sayHello(){
	
	    System.out.println("M2ByHelloWorld!");
	    return new HelloWorld().sayHello();
	}

}