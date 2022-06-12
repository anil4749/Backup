package OOP_Encapsulation;

import java.lang.ProcessHandle.Info;
import java.util.jar.Attributes.Name;

public class ProblemEmployee {
	
	private String name ;
	private int age;
	private double salary;
	private boolean isActive ;
	private char Gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	public String getEmpInfo() {
		String info = name + age + salary + isActive + Gender;
		return info;
		
	}

}
