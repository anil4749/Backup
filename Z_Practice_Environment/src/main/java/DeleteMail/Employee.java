package DeleteMail;

import java.security.PublicKey;

import org.bouncycastle.asn1.DERTaggedObject;

public class Employee {

	public static void main(String[] args) {
		
		EmpData employee = new EmpData();
		
//		employee.setname("Anil");
//		employee.dob(29);
//		employee.setlag("Eng");
		
//		employee.setname("ABc");
//		employee.dob(28);
//		employee.setlag("English Panjabi Hindi");
		
		String lang[]= {"Marathi", "Panjabi" ,"Hindi"};
		
		
		employee.setname("Xyz").setdob("01 jun 1993").setlag(lang);
		
		
		String empLang[] =employee.getlag();
		
		
		System.out.println("Name : " +employee.getname() + " Date Of Birth "+ employee.getdob() +" Language :");
		for(String a:empLang) {
			System.out.println(a);
			
		}
	
		 
		 

	}
	

}
