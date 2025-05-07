package day1;

public class StringConcatenation {

	public static void main(String[] args) {
		// "+" : concatenation operator		
		int a= 200;
		int b= 100;
		
		String x="Hello";
		String y="World";
		
		//any operations in the print statement is executed from left to right
		System.out.println(a+b);
		System.out.println(x+ " " +y);
		System.out.println(a+b+x+y);// 100+200(300)+(300+Hello)+(300Hello+World)
		
		System.out.println(x+y+a+b);// Hello+World(HelloWorld)+200(HelloWorld200)+100(HelloWorld200100)
		
		System.out.println(x+y+(a+b)); //Hello+ World(HelloWorld)+(100+200){HelloWorld300}
		
		System.out.println(a+b+x+y+a+x+y+b);
		
		System.out.println("The value of a is : " +a);
		
		
		// Difference between println and print
		
		System.out.println("Hi");
		System.out.println("Myself Adyasa");
		
		System.out.print("Hi");
		System.out.println("Myself Adyasa");
		System.out.println("from Bdbl");
		
		//println --- used to print on the console on a new line
		//print --- just used to print on the console
		
		
		
		
		
		
	}

}
