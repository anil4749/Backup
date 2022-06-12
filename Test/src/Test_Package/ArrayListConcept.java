package Test_Package;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//Arraylist : Default Class
		//Size not fixed
		//Arraylist Index Based --maintain the order
		//create the object of the arraylist class
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//3
		
		System.out.println(ar.size());
		
		ArrayList<Object> empData = new ArrayList<Object>(5);
		empData.add("Anil");
		empData.add(30);
		empData.add(45.55);
		empData.add('M');
		empData.add(true);
		
		for ( Object e : empData) {
			System.out.println(e);
		}
	}
}
