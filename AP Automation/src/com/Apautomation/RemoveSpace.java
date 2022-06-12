package com.Apautomation;

public class RemoveSpace {

	public static void main(String args[]) {

		String str = "I am Automation Tester";
		
		 // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
        
//		char[]strArray = str.toCharArray();
//		StringBuffer sb = new StringBuffer();

		
		
	}
}
