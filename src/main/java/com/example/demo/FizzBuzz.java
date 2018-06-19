package com.example.demo;

public class FizzBuzz {

	public String getResult(int value) {
		
		IFizzBuzz[] rules = {  new FizzBuzzRule(),new BuzzRule(), new FizzRule(),new JavaRule()};
		 
		for (IFizzBuzz rule : rules) {
		if(rule.isValid(value)) 
		   return rule.say();
		}
		return value + "";
		
		//return (value%3==0 && value%5==0?"FizzBuzz":(value%3==0?"Fizz":value%5==0?"Buzz":value+""));
		
	}

}

interface IFizzBuzz {
    boolean isValid(int input);
    String say();
}

class BuzzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%5 == 0;
    }
    public String say() {
        return "Buzz";
    }
}

class FizzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%3 == 0;
    }
    public String say() {
        return "Fizz";
    }
}

class JavaRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return input%7 == 0;
    }
    public String say() {
        return "Java";
    }
}

class FizzBuzzRule implements IFizzBuzz {
    public boolean isValid(int input) {
        return (input%3 == 0 && input%5 == 0);
    }
    public String say() {
        return "FizzBuzz";
    }
}

