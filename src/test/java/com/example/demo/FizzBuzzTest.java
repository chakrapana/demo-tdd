package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzbuzz = new FizzBuzz();
	
	@Test
	public void input_1_should_be_return_1() {
		
		String actualResult = fizzbuzz.getResult(1);
		assertEquals("1", actualResult);
	}
	
	@Test
	public void input_2_should_be_return_2() {
		
		String actualResult = fizzbuzz.getResult(2);
		assertEquals("2", actualResult);
	}

	@Test
	public void input_3_should_be_return_Fizz() {
		
		String actualResult = fizzbuzz.getResult(3);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void input_4_should_be_return_4() {
		
		String actualResult = fizzbuzz.getResult(4);
		assertEquals("4", actualResult);
	}
	
	@Test
	public void input_5_should_be_return_Buzz() {
		
		String actualResult = fizzbuzz.getResult(5);
		assertEquals("Buzz", actualResult);
	}
	
	@Test
	public void input_6_should_be_return_6() {
		
		String actualResult = fizzbuzz.getResult(5);
		assertEquals("Buzz", actualResult);
	}
	
	@Test
	public void input_7_should_be_return_java() {
		
		String actualResult = fizzbuzz.getResult(7);
		assertEquals("Java", actualResult);
	}
	
	@Test
	public void input_8_should_be_return_8() {
		
		String actualResult = fizzbuzz.getResult(8);
		assertEquals("8", actualResult);
	}
	
	@Test
	public void input_9_should_be_return_9() {
		
		String actualResult = fizzbuzz.getResult(9);
		assertEquals("Fizz", actualResult);
	}
	
	@Test
	public void input_10_should_be_return_buzz() {
		
		String actualResult = fizzbuzz.getResult(10);
		assertEquals("Buzz", actualResult);
	}
	
	@Test
	public void input_15_should_be_return_FizzBuzz() {
		
		String actualResult = fizzbuzz.getResult(15);
		assertEquals("FizzBuzz", actualResult);
	}
}
