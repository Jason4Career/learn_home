package com.mvn.test;
import org.junit.*;
import org.junit.Assert.*;
import com.mvn.test.HelloWorld;

public class M2ByHelloWorldTest{
	
		@Test
		public void testHello(){
		
			Assert.assertEquals("Hello World!",new M2ByHelloWorld().sayHello());
			
		}
			
}