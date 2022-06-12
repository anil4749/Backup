package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop();//Inherited Method
		b.refuel();//Inherited
		b.start();//Overridden
		b.autoParking();//Individual Method->Child Class
		BMW.getName();
		b.getName();
		b.engine();
		
		b.speed = 500;
		System.out.println(b.speed);
		
		
		//parent class can not take anything from child class
		Car c = new Car();
		c.start();//Parent Class
		c.stop();//
		c.refuel();
		Car.getName();
		c.engine();
		//Child class object without reference
		//child class object can be referred by parent class ref variable
		
		//Top-Casting
		Car c1 = new BMW();
		c1.stop();
		c1.refuel();
		c1.start();//overridden
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		
		//down casting :- parent object can be referred by child class ref variable
		//BMW b1 = (BMW) new Car();It give ClassCastException
		
		//BMW b2=	(BMW) new Vehicle();
		//b2.autoParking();//ClassCastException
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.childLock();
		//Siblings can not be inherited
	
		
	}

}
