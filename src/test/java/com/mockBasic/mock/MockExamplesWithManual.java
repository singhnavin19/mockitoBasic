package com.mockBasic.mock;

import static org.mockito.Mockito.times;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

public class MockExamplesWithManual {

	@Test
	public void testMockManualExample() {
		ArrayList<String> strings = Mockito.mock(ArrayList.class);

		strings.add("hello");
		Mockito.verify(strings).add("hello");

		strings.add("hello");
		Mockito.verify(strings, times(2)).add("hello");

//		System.out.println(strings.get(0));
//		strings.add("world");
//
//		Mockito.when(strings.size()).thenReturn(2);
//		Assert.assertEquals(2, strings.size());
	}

}
