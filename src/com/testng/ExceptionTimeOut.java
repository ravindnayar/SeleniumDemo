package com.testng;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
/*	@Test
	public void infiniteLoop(){
		int i =1;
		while(i==1){
			System.out.println(i);
			
		}
	}*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test(){
		String a = "100A";
		Integer.parseInt(a);
	}
	

}
