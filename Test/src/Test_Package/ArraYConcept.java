package Test_Package;

public class ArraYConcept {

	public static void main(String[] args) {
		
		//array :
		//1.Static array : SIZE IS FIXED;
		//limitations of static array :
		//a.size is fixed(static) : extra memory and less memory;
		//b.It cannot store diff types of data 
        //		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i.length);
		System.out.println(i[0]);
		
		for (int k=0 ; k<i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("_______");
		
		for (int e : i) {
			System.out.println(e);
		
		}
		
		//double array :
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 100;
		
		for(int k=0 ; k<d.length; k++) {
			System.out.println(d[k]);
		}
		
		for (double f :d) {
			System.out.println(f);
		}
		
		//3.char array :
		
		char c[] = new char[3];
		
		//4.String Array :
		String names[] = new String[3];
		names[0] = "Amol";
		names[1] = "asmita";
		names[2] = "Sameera";
//		names[3] = "veer";
		
		for (int f=0 ; f<names.length; f++)  {
			System.out.println(names[f]);
		}
		System.out.println("______");
		
		for (String e : names) {
			System.out.println(e);
		}
		
		System.out.println("____");
		
		//5.Emp data : name(String),age(int),gender(char),salary(double) , isPermananent(boolean)
		
		//Object Static Array
		
		Object empData[] = new Object[5];
		empData[0] = "Anil";
		empData[1] = 30;
		empData[2] = 'M';
		empData[3] = 34.55;
		empData[4] = true;
		
		System.out.println("for loop");
		
		for (int n=0 ; n<empData.length ; n++) {
			System.out.println(n + " = " +empData[n]);
		}
		
		System.out.println("for each loop");
		int count = 0;
		for (Object e : empData) {
			System.out.println(count + " = " + e);
			count++;	
		
		
		}
	}
}
