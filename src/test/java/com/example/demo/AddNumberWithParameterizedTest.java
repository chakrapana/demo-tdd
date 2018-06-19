package com.example.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddNumberWithParameterizedTest {

	private int operand1;
	private int operand2;
	private double expextedResult;
	
	
	
	public AddNumberWithParameterizedTest(int operand1, int operand2, double expextedResult) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.expextedResult = expextedResult;
	}

	@Parameters
	public static Collection<Object[]> myData(){
		return Arrays.asList(new Object[][] {
			{1,1,2.0},
			{2,2,4.0},
			{7,6,13.0},
		});
	}
	
	@Test
	public void add() {
		AddOpeation addOpation = new AddOpeation();
		double actualResult = addOpation.calulate(this.operand1,this.operand2);
		assertEquals(this.expextedResult, actualResult,0.000);
	}

}
