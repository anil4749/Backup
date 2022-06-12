package com.Apauto.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	
	public void test() {
		System.out.println("TEST3 TEST");
		
	}
	@Test(dataProvider = "dp")
	public void testString(String s ) {
		System.out.println("TEst3, inpt =" + s);
	}

	@DataProvider
	public Object[]dp() {
		return new Object[] {"A","B"};
		}
	}


