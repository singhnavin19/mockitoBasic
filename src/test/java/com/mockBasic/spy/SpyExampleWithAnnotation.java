package com.mockBasic.spy;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpyExampleWithAnnotation {

	@Spy
	private ArrayList<String> strings = new ArrayList<String>();

	@Test
	public void SpyExampleWithAnnotationTest() {
		this.strings.add("hello");
		this.strings.add("world");

		this.strings.forEach(System.out::println);
	}
}
