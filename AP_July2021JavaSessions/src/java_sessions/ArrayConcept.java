package java_sessions;

import javax.swing.border.EmptyBorder;

public class ArrayConcept {

	public static void main(String[] args) {

		//array
		//1.static array: a)size is fixed : extra memory and less memory
		//b. can not store diff type of data
		//to overcome for both the limitations : we have to use dynamic array: Collections --> ArrayList
		
		//2.dynamic array: dynamic size
		
		//int array:
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//ArrayIndexOutofBoundException
		
		System.out.println("Li = "+0);
		System.out.println("length ="+ i.length);
		int l =i.length; //4
		System.out.println("Hi ="+ (l-1));//3
	
		System.out.println(i[0]);//10
		System.out.println(i[3]);//40
		//System.out.println(i[4]);//ArrayIndexOutofBoundException-RuntimeException
		//System.out.println(i[-1]);//ArrayIndexOutofBoundException-Runtime

		System.out.println(i[0] + i[3]);
		//System.out.println(i[4]);//ArrayindexOutofBoundException
	
		int price[] = new int[100];
		price[0] = 10;
		price[1] = 20;
		//actual memory taken 2*4 = 8 bytes
		//waste memory = 400-8 =392 bytes
		
		System.out.println(price[0]);
		
		//To print all the values from array:- used for loop
		System.out.println("Typical for loop_______");
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);//10 20 30 40
		}
		System.out.println("Each loop_________");
		for (int e: i) {
			System.out.println(e);
		}
		
		//2.double array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 100;//console print 100.00
		
		for(int k =0; k<d.length;k++) //why int bcaz 0 represent index
			{
			System.out.println(d[k]);
		}
		System.out.println("______");
		
		for (double e:d)//and here double represent data types
		{
			System.out.println(e);
		}
		
		//Array is homonegenous data so , we can store simillar type of data
		
		//3.char array:
		char c[] = new char[3];
		
		//4.String array:
		String names[] = new String[3];
		names[0] ="Mohit";
		names[1] ="Sonam";
		names[2] ="Sachin";

		for (int t = 0; t < names.length; t++) {
			System.out.println(names[t]);
		}
		for(String e:names) {
			System.out.println(e);//dont print names print e(variable name)
		}
		//5. Emp Data : name(String) , age(int) , gender(char) , salary(double) , isPermanantBoolean
		//Object static Array :
		//Object: is a parent class of all the classes in Java
		// Object is a super class 
		//Object can store all type of data
		
		Object empData[] = new Object[5];
		empData[0] = "Lisa";
		empData[1] = 30;
		empData[2] = 'F';
		empData[3] = 34.55;
		empData[4] = true;
		
		//to print all the EmpData Values:
		System.out.println("______");
		for(int n=0 ; n<empData.length; n++ ) {
			System.out.println(n+"="+empData[n]);
		}
		System.out.println("______");
	
		int count =0;
		for(Object e: empData ) {
			System.out.println(count +"="+e);
			count++;
		}
		
		Object carInfo[] = new Object[5];
		carInfo[0] = "Swift";
		carInfo[1] = "White";
		carInfo[2] = 4;
		carInfo[3] = false;
		carInfo[4] = "Sedan";
		
		for (int j = 0; j < carInfo.length; j++) {
			System.out.println(carInfo[j]);
		}
		
		for (Object e: carInfo) {
			System.out.println(e);
		}
	}

}




















