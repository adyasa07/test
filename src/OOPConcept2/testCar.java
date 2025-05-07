package OOPConcept2;

public class testCar {
	//Method Overriding---> when same name methods are present in both parent as well as child class with same arguments

	public static void main(String[] args) {
		
		Honda h=new Honda();
		
		//Static polymorphism---->compile time polymorphism
		h.start();//start method is present in both parent as well as child class but child class method is executed and given priority
		h.stop();
		h.body();
		h.theftSafety();
		h.wheel();
		
		System.out.println("********************************");
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.wheel();
		
		System.out.println("************************************");
		
		
		//Top Casting
		Car b=new Honda();// child class object can referred by parent class reference variable-->Dynamic Polymorphism---->runtime polymorphism
		//in runtime polymorphism we can only execute the methods that are common to both child and parent class 
		b.start();
		b.stop();
		b.wheel();
		
		System.out.println("*********************************************");
		
		Vehicle v=new Car();
		
		v.wheel();
		
		System.out.println("*******************************************");
		
		//Down Casting
		
		//Honda a=(Honda)new Car(); //java.lang.ClassCastException
		
		

	}

}
