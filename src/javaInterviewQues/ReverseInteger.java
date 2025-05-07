package javaInterviewQues;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1st Method: Using Algo
		int num=4727;
		int rev=0; //initializing reverse number to 0
		
		while(num!=0) {
			rev= rev*10+ num%10;
			num=num/10;
			
		}
		
		/*1st iteration:
		 * 4727!=0-->rev=0*10(0) +4727 % 10(7)=0+7=7----> num= 4727/10=472;
		 * 
		 * 2nd iteration:
		 * num=472!=0;
		 * rev= 7*10(70) + 472%10(2)=70+2=72-------> num= 472/10=47;
		 * 
		 * 3rd iteration:
		 * num=47!=0;
		 * rev= 72*10(720) + 47 % 10(7)=720+7=727----->num=47/10=4;
		 * 
		 * 4th iteration: 
		 * num=4!=0;
		 * rev= 727 * 10(7270)+ 4%10(4)=7270+4=7274------>num=4/10=0;
		 * 
		 * 5th iteration:
		 * num=0;
		 * 
		 * compiler will come out of the loop and print rev=7274;
		
		 * */
		
		System.out.println(rev);
		
		//2nd Method: Using StringBuffer
		
		int num1=2345;
		String val=String.valueOf(num1); //getting the string value of int num1;
		StringBuffer rev1=new StringBuffer(val);
		
		System.out.println(rev1.reverse());

	}

}
