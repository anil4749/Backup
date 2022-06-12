package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical , UKMedical , IndianMedical {

	//Interface to interface use Extend keyword
	//Class to interface use implements
	//class to class means extend keyword
	//
	
	//US
	@Override
	public void physioServices() {	
		System.out.println("FH--physioServices");
	}

	@Override
	public void oncologyServices() {	
		System.out.println("FH--oncologyServices");
	}
	@Override
	public void dentalServices() {
		System.out.println("FH--dentalServices");
	}

	@Override
	public void dermaServices() {
		System.out.println("FH--Derma Services");
	}
	
	//UK
	@Override
	public void pediaServices() {
		System.out.println("FH--pedia Services");		
	}

	//UK
	@Override
	public void cardioServices() {
		System.out.println("FH--Cardio Services");
	}

	//IndianMedical
	@Override
	public void neuroServices() {
		System.out.println("FH--Neuro Services");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH--Ortho Services");
		
	}

	@Override
	public void entServices() {
		System.out.println("FH--ENT Services");
		
	}

	//Its is common for all interfaces , means override only once
	@Override
	public void emergencyServices() {
		System.out.println("FH --Emergency Services");
		
	}
	
	//Individual
	public void MedicalInsurance() {
		System.out.println("FH--Medical Insurance");
	}
	
	public void MedicalTraining() {
		System.out.println("FH--Medical Training");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("Hospital Help Desk");
	}

	@Override
	public void covid19Test() {
		System.out.println("Fortis Hospital covid 19 Test");
	}
	
	//Individual Method
	public void medicalCertificate() {
		System.out.println("US--medicalCertificate");
	}
}
