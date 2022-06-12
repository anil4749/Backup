package java_sessions;

import java.util.ArrayList;

public class Team {
	
	//WAF :- pass the team name:
	//return : the list of devices--> ArrayList<String>
	
	public ArrayList<String> getDevicesList(String teamName) {
		
		System.out.println("team name is : "+ teamName);
		ArrayList<String> deviceList = new ArrayList<String>();
		
		if(teamName.equals("QA")) {
			deviceList.add("iphone x");
			deviceList.add("iphone 7");
			deviceList.add("Samsung 8");
		}
		else if (teamName.equals("Dev")) {
			deviceList.add("iphone 12");
			deviceList.add("iphone 8");
			deviceList.add("Samsung 7");
			}
		else if (teamName.equals("DevOps")) {
			deviceList.add("iPhone plus 12");
		}
		else {
			System.out.println("team is not found..."+ teamName);
		}
		
		return deviceList;
	}
	
	//WAF : input : browserName(String)
	//return : void initially
	
	public void launchBrowser(String browerName) {
		switch (browerName.toLowerCase())
		{
		case "chrome":
			System.out.println("launch browser");
			break;

		case "firefox":
			System.out.println("launch browser");
			break;
		
		case "safari":
			System.out.println("launch browser");
			break;
			
		default:
			System.out.println("Plz pass the right browser name : "+ browerName);
			break;
		}
	}

	//WAF : input parameter : StudentName(String)
	//return : static array: Object Array
	
	public Object[] getStudentInfo(String name) {
		System.out.println("student name is : "+ name);
		
		Object info[] = new Object[3];
		
		if (name.equals("Karthik")) {
			info[0]="Karthik Sharma";
			info[1]=10;
			info[2]= 'A';
		}
		
		else if (name.equals("Sonam")) {
			info[0]= "Sonam Gupta";
			info[1]= 11;
			info[2]= 'B';
		}
		else if (name.equals("Ravi")) {
			info[0]= "Ravi Kumar";
			info[1]= 12;
			info[2]= 'C';
		}
		else {
			System.out.println("Student name is not found ... " + name);
		}
		
		return info;
	}
	
	
	
	
	
	
}
