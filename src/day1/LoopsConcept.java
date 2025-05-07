package day1;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// While Loop //dis advantage----> it will generate infinite loop if incremental/decremental part is not given
		
		//Printing first 10 positive integers
		
		int i=1; //initialization
		
		while(i<=10) { //conditional

			System.out.println(i);
			i++;  // incremental/decremental
			
			// if i++ is not given it'll be a infinite loop
	}
		
		System.out.println("*********************************");
       
		//FOR loop
		
		for(int j=1;j<=10;j++) {         //for(initialization,conditional,incremental/decremental)
			
			System.out.println(j);
		}
		System.out.println("***********************************");
		
		//Printing 10 to 1 in decreasing order
		
		for(int k=10;k>=1;k--) {
			
			System.out.println(k);
		}
		
		
		
}
}
