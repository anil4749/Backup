package DeleteMail;

public class EmpData {

	private	String employeeName="";
	private String dateOfBirth; // 26 march 2022
	private	String language[]= new String[3];
			 
			 public EmpData setname(String Name) {
				 
				 employeeName=Name;
				 return this;
				 
			 }
			 
			 public EmpData setdob(String dob) {
				 
				 dateOfBirth=dob;
				 return this;
				 
			 }
			 public EmpData setlag(String[] lag) {
 
				 language=lag;
				 return this;
 
			 }
			 
			 public String getname() {
				 
				 return employeeName;
				 
			 }
			 
			 public String getdob() {
				 return dateOfBirth;
				 
				
				 
			 }
			 public String[] getlag() {
 
				 return language;
 
			 }
}
