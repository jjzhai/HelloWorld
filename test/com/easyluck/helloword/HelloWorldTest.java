package com.easyluck.helloword;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testSayHello() {
		HelloWorld world = new HelloWorld();
		assert(world != null);
		assertEquals("Hello World", world.sayHello());
	}

	public void testSayHelloWithName() {
		HelloWorld world = new HelloWorld();
		assert(world != null);
		assertEquals("Hello World,jack", world.sayHello("jack"));
	}
}