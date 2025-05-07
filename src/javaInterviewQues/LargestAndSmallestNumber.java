package javaInterviewQues;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int[] nums= {99,76,8,3,6,100,101};
		
		int smallest=nums[0];
		int largest=nums[0];
		
		for(int i=1; i<nums.length;i++) {
			
			if(nums[i]>largest) {
				
				largest=nums[i];	
			
			}
			else if(nums[i]<smallest) {
				
				smallest=nums[i];
			}
			
		}
		//1st: comparing 99 to 76---> largest=99 and smallest=76
		//2nd: largest ----> 99>8 and smallest----> 8<76
		//3rd: largest-----> 99>3 and smallest---->3<8
		//4th: 
		
		
		System.out.println("\n Given array is: " + Arrays.toString(nums));
		
		System.out.println("Largest Number is: " + largest);
		System.out.println("Smallest Number  is: " +smallest);
		
	}

}
