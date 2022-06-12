package OOP_Interface;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

public interface USMedical extends WHO {
	
	int min_fee = 10;
	//Variable are static and final by default
	
	//we cant create the object of interface
	//abstract methods:- a method which doesn't have any method body
	//Prototype Method
	
	//Interface method can not be static 
	
	public void physioServices() ;
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void dermaServices();
	
	public void emergencyServices();
	
	//after JDK 8:
	
	//1.can have static method the body
	
	public static void medicalEquipment() {
		System.out.println("US--medicalEquipment");
	}
	
	//2. can have default method with method body--//Non-abstract
	//default method can not be final or static
	
	default void medicalCertificate() {
		System.out.println("US--medicalCertificate");
	}
}

