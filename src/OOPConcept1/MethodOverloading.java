package OOPConcept1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading s=new MethodOverloading();
		
		s.sum();
		System.out.println(s.sum(4));
		System.out.println(s.sum(10, 10));
		System.out.println(s.sum(9.9, 0.9));
	    s.sum(10, 9.9);
	    s.sum(6.9, 10);
	    main(9);  //static methods can be called without using the object
	    main("Automation","Testing" );
		
	}
	
	//main method overloading is allowed
	
	public static void main(int q) {
		
		System.out.println("This is main method with int param");
		System.out.println(q);
	}
	
	public static void main(String s, String t) {
		
		System.out.println("This is main method with two params");
		
		System.out.println(s + " " +t);
	}
	
	//Method overloading----> methods with same name but different arguments/input parameters
	
	//Different ways of Method Overloading:
	
	//1.changing the number of parameters:
	
	public void sum() {
		System.out.println("Sum Method----> 0 input param");
		
	}
	
	public int sum(int x) {
		System.out.println("Sum Method---->1 input param");
				return x;
		
	}
	public int sum(int a, int b) {
		
		System.out.println("Sum Method---->2 input param");
		return(a+b);
		
	}
	//2.Changing the data type:
	
	public double sum(double d, double e) {
		
		System.out.println("Sum Method-----> different datatype param");
		
		return(d+e);
	}
	
	//3.Changing the order:
	
	public void sum(int m,double n) {
		
		System.out.println("Sum Method-----> 2 datatypes in one method");
		
		System.out.println(m+n);
	}
	
	public void sum(double n, int m) {
		
		System.out.println("Sum Method-----> chaging the order of arguments from previous method");
		
		System.out.println(m+n);
	}

}
