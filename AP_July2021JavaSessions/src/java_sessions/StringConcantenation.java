package java_sessions;

public class StringConcantenation {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		double d1=12.33;
		double d2=23.33;
		
		System.out.println(a+b);
		System.out.println(a-b);
		
		String s="Testing";
		String s1="Selenium";
		
		System.out.println(s+s1);
		
		String x="Hello";
		String y ="World";
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);

		
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));

		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		System.out.println("The sum is: "+(a +b));

		char c1='a';
		char c2='b';
		char c3='9';
		
		System.out.println(c1);//a
		System.out.println(c1+c2);//195
		//char is a numeric type and its gives ASCII values
		
		//a-z range 97 to 120 for LowerCase
		//A-Z range 65 to 90 for UpperCase
		//0-9 range 48 to 57
		
		System.out.println((int)c1);
		
		byte b1=12;
		byte b2=10;
		int b3= b1+b2; //(bye b3=b1+b2 is not allowed, what if tomorrow someone changes values)
		System.out.println(b3);
		
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		
		System.out.println(0/1);
		//System.out.println(9/0);//ArithmaticException
		//System.out.println(0/0);//ArithmaticException
		System.out.println(0.0/0);//NaN- not a number
		System.out.println(9.0/0);//Infinity

	}

}
