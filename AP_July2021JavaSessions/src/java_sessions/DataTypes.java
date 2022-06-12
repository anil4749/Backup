package java_sessions;

public class DataTypes {
	

public static void main(String []arg ) {
		//data types-we cannot write variable without declaring data types
		//like a= 10 its wrong but int a =10 ; its right
		
		//1.Primitive data types:we dont need to create objects to store the values
		
	//1.byte - range -127 to 128 //size 1 byte = 8 bits
	byte b =10;
	b=20;
	byte b1= -10;
	byte b2=0;
	
	System.out.println(b);
	System.out.println(b1+b2);
	
	//2.short :-Range -32768 to 32767   //size :- 2 bytes = 16 bits
	
	short s =2300;
	short s1=10;
	System.out.println(s1+s);
	
	//3. int : Range :--2^31 to 2^31-1 //size :- 4 bytes = 32 bits
	int i =200;
	int p =9000;
	
	//4.long: Range:- -2^63 to 2^63-1 //size:- 8 bytes = 64 bits
	long aadhar = 9098765099l;
	System.out.println(aadhar);
	
	//5.Float Range:- after . upto 7 decimal digits //Size :- 4 bytes= 32 bits
	float f =12.33f;
	float f1=(float)34.55;
	System.out.println(f-f1);
	
	//6.double: Range:- //Size:- 8 bytes=64 bits
	double d1 = 12.334444444d;
	double d2=34.55;
	System.out.println(d1+d2);
	
	//7.Char Types ;-its single digit value
	//size 2 bytes = 16 bites
	//jAVA USES UNICODE CHARACTERS
	char c1='a';
	char c2='1';
	char c3='%';
	System.out.println(c1+c2+c3);
	System.out.println(c1);

	//8.Boolean :-Range:- True or False
	//size:- approx 1 bit 
	boolean flag = true ;
	boolean flag1= false;
	boolean isActive = true;
	boolean isCitizen = false;
	
	if(isActive) {
		System.out.println("yes");
	}
}


}
