package day1;

public class ComparisionOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <> operator
		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
			
		// == operator
		
		int i=40;
		int j=50;
		
		if(i==j) {
			System.out.println("i and j are equal");
		}
		else {
			System.out.println("i and j are not equal");
		}
		
		// write a logic to find the greatest number
		
		int a1=100;
		int b1=200;
		int c1=300;
		
		// use nested if-else
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest number");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest number");
		}
		
		else {
			System.out.println("c1 is the greatest number");
		}

	}

}
