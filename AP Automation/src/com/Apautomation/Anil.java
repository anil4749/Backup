package com.Apautomation;

import java.security.DrbgParameters.Capability;
import java.util.Scanner;




public class Anil {
	
	
	static int a, b;
	public void Aniladd(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}

	
	public static void main(String[] args) {
		
		//Anil m = new Anil();
		
		//m.getNo();
		//m.display();
		//m.add();
		String s1="Anil";
		 //s1="Anil1";
		String s2="Shubham";
		String s4=new String("111");
		s1=s1.concat("abc");
		
		System.out.println(s1+" "+ s2+" "+s4);
		
		StringBuffer ab=new StringBuffer("Anil");
		int i=2;
		ab.capacity();
		
		System.out.println(ab.capacity());
		
		
	}
	public void getNo() {
		
		System.out.println("First Number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Second Number");
		b = sc.nextInt();
	}
//	public void add() {
//		System.out.println(a+b);
//	}
	public void display() {
		System.out.println("The Sum of "+a + " and "+b +" is " );
	}

}
