package day1;

public class TwoDArray {

	public static void main(String[] args) {
		
		String x[][]=new String[3][5];
		
		System.out.println(x.length); // row size=3----> 0,1,2
		
		System.out.println(x[0].length); //column size=5----->0,1,2,3,4 (x[1].length/x[2].length -----> will also give the column size)
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		
		System.out.println(x[0][2]);
		
		//printing all the values of 2D array x
		// row---> 0  col---> 0 to 4------->1st iteration
		// row---> 1  col---> 0 to 4---------->2nd iteration
		// row--->2   col---> 0 to 4----------> 3rd iteration
		
		for(int row=0;row<x.length;row++) {
			
			for(int col=0;col<x[0].length;col++) {
				
				System.out.println(x[row][col]);
			}
		}
		
		/*
		 * for(String rows[]:x) { for(String cols:rows) {
		 * 
		 * System.out.println(cols); }
		 * 
		 * }
		 */
	}

}
