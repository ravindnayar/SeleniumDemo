package com.testng;

import org.testng.annotations.Test;

public class InvocationCout {
	
	@Test(invocationCount=10)
	public void sum(){
		int a = 10;
		int b = 20;
		int c = a + b;	
	}
	


}
