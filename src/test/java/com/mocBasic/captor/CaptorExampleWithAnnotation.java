package com.mocBasic.captor;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CaptorExampleWithAnnotation {
	@Mock
	ArrayList<String> listOfString;
	@Captor
	ArgumentCaptor<String> cc;

	@Test
	public void MockExampleWithManualTest() {
		this.listOfString.add("One");
		Mockito.verify(this.listOfString).add(this.cc.capture());

		System.out.println(this.cc.getAllValues());
	}
}
