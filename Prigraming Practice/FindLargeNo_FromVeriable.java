
public class FindLargeNo_FromVeriable {

	public static void main(String[] args) {
		
		FindLargeNo_FromVeriable findLargeNo_FromVeriable=new FindLargeNo_FromVeriable();
		
		
		int a=findLargeNo_FromVeriable.findLargestNo(56, 21, 90);
		
		System.out.println("Largest no is : " +a);
		
	}

	
	
	
	public void findLargestNo(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}
		
		else if(b>c) {
			return b;
		}
		
		else {
			return c;
		}
		
	}
}
