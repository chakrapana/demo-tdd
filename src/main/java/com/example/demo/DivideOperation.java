package com.example.demo;

public class DivideOperation {

	public double calculate(int i, int j) throws DivideOperationException {

		if(j==0) {
			throw new DivideOperationException();
		}
		return i/j;
	}

}
