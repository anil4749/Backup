package OOP_Encapsulation;

public class Company {

	private String name;
	private int empCount;
	private String hq;
	
	public String getCompanyInfo() {
		String info = name + empCount + hq;
		return info;
	}
	
	//This is generated automatically :- Right click ->source-.Getter and setter-->Select -->finish

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	// setter and getter methods -->public in nature
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}

//	public static void main(String[] args) {
//
//		Company obj = new Company();
//		obj.name = "IBM";
//		obj.empCount = 1000;
//		
//		System.out.print(obj.name);
//	}

}
