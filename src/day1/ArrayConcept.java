package day1;

public class ArrayConcept {

	public static void main(String[] args) {
		// array: to store same data type variables in an array variable
		
		//1.int array
		//lowest bound/index :0
		//upper bound or index : n-1(n is the size of array)
		
		int i[]= new int[4];
		
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		
		//System.out.println(i[4]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		//print all the values of array: use for loop
		
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}

		// 2.char array
		
		char c[]=new char[3];
		
		c[0]='M';
		c[1]='N';
		c[2]='O';
		
		//printing all values of c[] using while loop
		
		int a=0;
		
		while(a<c.length) {
			
			System.out.println(c[a]);
			a++;
		}
		
		
		// This is one D array
		
		//disadvantages:
		//1. Size is fixed---> Static array---To overcome this problem we use Collections---> e.g. ArrayList,HashTable---> these are called dynamic array
		//2. Stores only similar data types value---> To overcome this problem we use Object Array
		
		
		
	}

}
