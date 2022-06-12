package ConstructorConcept;

import java.util.ArrayList;

public class TestUniversity {

	public static void main(String[] args) {

		ArrayList<String> courses = new ArrayList<String>();
		
		courses.add("Physics");
		courses.add("Maths");
		
		University u1 = new University("Delhi", "DL", courses);
		System.out.println("University Name..."+ u1.getName());
		System.out.println("HQ name..."+u1.getHq());
		System.out.println("Courses Name..."+u1.getCourses());
		
	}

}
