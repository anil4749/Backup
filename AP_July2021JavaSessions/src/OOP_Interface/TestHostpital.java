package OOP_Interface;

public class TestHostpital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		
		fh.neuroServices();
		fh.emergencyServices();
		fh.dentalServices();
		fh.dermaServices();
		fh.MedicalInsurance();
		fh.MedicalTraining();
		
		fh.helpDesk();
		fh.biling();
		
		fh.covid19Test();
		fh.medicalCertificate();
		
		fh.pandemicAnnouncement();
		
		UNHealthGroup.pandemicAnnouncement();
		//USMedical.min_fee =200;
		System.out.println(USMedical.min_fee);
		USMedical.medicalEquipment();
		
		//Top Casting :- child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.physioServices();
		us.emergencyServices();
		us.dentalServices();
		us.dermaServices();
		
		UKMedical uk = new FortisHospital();
		uk.cardioServices();
		uk.emergencyServices();
		uk.pediaServices();
		
		//downCasting : NA
	//	new USMedical(;)
		
		
	}

}
