package com.mockBasic.spy;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;



public class SpyExampleWithManual {


	@Test
	public void SpyExampleWithManualTest() {
		ArrayList<String> strings = Mockito.spy(new ArrayList<String>());
		strings.add("hello");
		strings.add("world");

		strings.forEach(System.out::println);

		Assert.assertEquals(2, strings.size());

	}
}
