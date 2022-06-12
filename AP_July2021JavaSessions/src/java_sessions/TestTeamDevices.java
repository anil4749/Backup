package java_sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTeamDevices {

	public static void main(String[] args) {

		Team t1 = new Team();
		ArrayList<String> QADevices = t1.getDevicesList("QA");
	
		System.out.println(QADevices);
		
		if (QADevices.size()==3) {
			System.out.println("PASS for QA team device count");
		}
		
		if(QADevices.contains("iphone 7")) {
			System.out.println("iphone 7 is present");
		}
		
		t1.getDevicesList("emp");
		
		t1.launchBrowser("Chrome");
		t1.launchBrowser("firefox");
		
		Object ob[] = t1.getStudentInfo("Sonam");
		System.out.println(Arrays.toString(ob));
		
	}
	
	
}
