package com.junit.hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello() {
		HelloWorld hello = new HelloWorld();
		Assert.assertEquals("hello", hello.hello());
	}
}
