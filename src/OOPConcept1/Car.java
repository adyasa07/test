package OOPConcept1;

public class Car {
	
	// Class Variables :
	int model;
	String color;

	public static void main(String[] args) {
		
		//new Car() is the object of Car class and a,b,c are the Object reference variables that are pointing to the objects
		//after creating the objects, copies of class variables are given to each object
		
		Car a=new Car();
		
		Car b=new Car();
		
		Car c=new Car();
		
		a.model=2012;
		a.color="Black";
		
		b.model=2013;
		b.color="Blue";
		
		c.model=2014;
		c.color="Red";
		
		
		//Before shifting references
		System.out.println(a.model);
		System.out.println(a.color);
		
		System.out.println(b.model);
		System.out.println(b.color);
		
		System.out.println(c.model);
		System.out.println(c.color);
		
		//After shifting references
		
		a=b;
		b=c;
		c=a;
		
		c.model=2025;
		System.out.println(c.model);
		System.out.println(b.model);
		System.out.println(a.model);
		
	}

}
