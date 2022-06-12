package java_sessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		//1.++--> Increment by 1
		//post increment
		
		int a=1;
		int b =a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=-99;
		int d=c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		//pre-increment ++
		int h =1;
		int g =++h;
		System.out.println(h);//2
		System.out.println(g);//2

		int p=-97;
		int q=++p;
		System.out.println(p);//-96
		System.out.println(q);//-96
		
		//Post Decrement -- decrease value by 1
		int r=2;
		int s=r--;
		System.out.println(r);//1
		System.out.println(s);//2
		
		int x =-999;
		int y =x--;
		
		System.out.println(x);//-1000
		System.out.println(y);//-999
		
		//predecrement :--
		int u=2;
		int v=--u;
		System.out.println(u);//1
		System.out.println(v);//1
		
		int n=2;
		System.out.println(n++);//first print 2 then increment by 1
		System.out.println(n);//3
		
		int m=3;
		System.out.println(++m);//4
		
		char b1 = 'a';
		char b2 = 'b';
		System.out.println(b1+""+b2);//ab
		System.out.println(""+b1+b2);//ab
				
	}

}
