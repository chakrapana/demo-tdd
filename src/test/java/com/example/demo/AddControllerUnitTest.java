package com.example.demo;

import static org.mockito.BDDMockito.*;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class AddControllerUnitTest {

	@Mock
	private AddOpeation addOperation;
	private AddController controller;
	
	@Before
	public void initial() {
		initMocks(this);
		controller = new AddController();
		controller.setOperation(addOperation);
	}
	
	@Test
	public void test() {
		given(addOperation.calulate(2, 1)).willReturn(3.0);
		String actualResult = controller.add(2, 1);
		assertEquals("3.0", actualResult);
	}

}
