package java_sessions;

import java.net.SocketOptions;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList --Default Class -Inbuild Class
		//dynamic array
		//Size is not fixed
		
		//create the object of the ArrayList class
		
		ArrayList ar  = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());//5
		
		ar.add(400);//5
		ar.add(500);//6
		
		System.out.println(ar.size());//7
		
		ar.remove(3);
		System.out.println(ar.get(3));//500
		System.out.println(ar.size());//6
		
		//to print all the values from arraylist for loop
		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.add("testing");
		ar.add(12.33);
		ar.add(true);
		ar.add('F');
		
		for (Object e : ar) {
			System.out.println(e);
		}
		
		//Generic in nature
		
		//AR -- names (String)
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tanu");
		empList.add("Tom");
		
		ArrayList<Integer> empNumber = new ArrayList<Integer>();
		empNumber.add(100);
		empNumber.add(200);
		
		//AR --emp Data --> String , int ,double , true ,char
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Lisa");
		empData.add(30);
		empData.add(34.55);
		empData.add(true);
		empData.add('F');
		
		for (Object e: empData){
			 System.out.println(e);
		 }
		
		System.out.println(empData);//WHEN WE WANT TO PRINT DIRECT ARRAY
	
		for (int i = 0; i <empData.size(); i++) {
			System.out.println(empData.get(i));
				if(empData.get(i).equals("Lisa")) {
					System.out.println("emp Name is Lisa = Yes");
					break;
				}
		}
		
		//Use cases in selenium :
		//10 links on the page
		//collect all 10 links in an arraylist
		//start a loop :
			//if(ele.text().equls("amazon")
			//click
			//break;
		
		//drop down selection :
		//20 elements/SocketOptions areOptions there
		//collect all 20 values in arraylist
		//start a loop :
			//if(ele.text().equals("ind")
				//select the value
				//break;
		
		ArrayList<Object> namesList = new ArrayList<Object>();
		
		namesList.add("Tom");
		namesList.add("Lisa");
		namesList.add("Peter");
		namesList.add(120);
		
		//Object can hold any type data
		//so if we have integer data so keep integer
		//so if we have only string data , so keep String data

		ArrayList<String> product = new ArrayList<String>();
		product.add("Mac");
		product.add("Samsung");
		
		System.out.println(product);
	} 

}















