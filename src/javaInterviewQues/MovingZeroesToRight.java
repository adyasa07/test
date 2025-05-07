package javaInterviewQues;

import java.util.Arrays;

public class MovingZeroesToRight {

	public static void main(String[] args) {
		
		int[] arr= {1,5,0,0,9,0,9,0};
		
	String newArray=Arrays.toString(shiftingZeroes(arr));
	System.out.println(newArray);
		
	}
	
	public static int[] shiftingZeroes(int[] a) {
		
		if(a.length==1) {  //if a single element is present in an array return the same(will be used for single element test case)
			return a;
		}
		
		int[] newArr=new int[a.length];
		int count=0;
		 for(int num:a ) {
			 
			 if(num!=0) {
				 
				 newArr[count]=num;
				 count++;
		 }
	}
        return newArr;
}
}
