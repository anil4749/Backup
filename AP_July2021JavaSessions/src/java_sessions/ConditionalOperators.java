package java_sessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("Both are equals");
		}
		else {
			System.out.println("Both are not equals");
		}
		
		//dead code
		if(false) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		boolean flag = true;
		if(flag) {
			System.out.println("ele is visible");
		}
		else {
			System.out.println("ele is not visible");
		}
		
		int total = 60;
		if(total<=100) {
			System.out.println("total is less than or equal to 100");
				if (total >=80) {
					System.out.println("total is gr than or equal to 80");
						if(total==80) {
							System.out.println(" GRADE A");
						}
						else {
							System.out.println("PASS");
						}
				}
				else {
					System.out.println("NA");
				}
		}
		else {
			System.out.println("BYE");
		}
		
		
		//logic --> Launch the Browser - chrome , ff , safari
		
//		String browser = "safari";
//		
//		if (browser.equals("chrome")) {
//			System.out.println("chrome launch");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("ff launch");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("safari launch");
//		}
//		else {
//			System.out.println("Pls pass the right browser name");
//		}
		
		String browser = "safari";
		
		if (browser.equals("chrome")) {
			System.out.println("chrome launch");	
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox launch");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari launch");
		}
		else  {
			System.out.println("Plz pass the right browser name");
		}
		
		//WAP --three diff numbers -- find out highest number
		int x=800;
		int y=500;
		int z=800;
		//&& -short circuit operator -AND operator
		if(x>y && x>z) {
			System.out.println("x is the highest");
		}
		else if(y>z) {
			System.out.println("y is the highest");
		}
		else {
			System.out.println("z is the highest");
		}
	}

}
