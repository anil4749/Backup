package OOP_Encapsulation;

public class ProblemEmployeeSolution {

	public static void main(String[] args) {

		ProblemEmployee obj = new ProblemEmployee();
		obj.setName("Amol");
		obj.setAge(28);
		obj.setSalary(35456.78);
		obj.setActive(true);
		obj.setGender('M');
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSalary());
		System.out.println(obj.getGender());
		
		System.out.println(obj.getEmpInfo());
	}

}
