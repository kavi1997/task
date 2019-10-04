package com.maven.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output= test.countA("alphabet");
		assertEquals(2,output);
	}

}
