package com.family.model;

import org.junit.Assert;
import org.junit.Test;

public class HelloEclipseTest {

	@Test
	public void say() {
		System.out.println(new HelloEclipse().say());
		Assert.assertEquals("I'm Father!", new HelloEclipse().say());
	}

}
