package OOP_Encapsulation;

public class TestCom {

	public static void main(String[] args) {

		Company obj = new Company();
		obj.setName("IBM");
		obj.setEmpCount(1000);
		obj.setHq("Banglore");
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpCount());
		System.out.println(obj.getHq());
		
		System.out.println(obj.getCompanyInfo());

	}

}
