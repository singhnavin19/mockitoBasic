package com.mockBasic.mock;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockExamplesWithAnnotation {

	@Mock
	ArrayList<String> strings;

	@Test
	public void MockExamplesWithAnnotationTest() {

		this.strings.add("hello");
		Mockito.when(this.strings.size()).thenReturn(100);
		assertEquals(100, this.strings.size());
	}
}
