package javaInterviewQues;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Selenium";
		
		//1st method----> Using for loop
		int len=s.length();
		
		System.out.println(len);
		
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			
			rev= rev + s.charAt(i);
			//1st iteration= rev + s.charAt(7)--->rev=m;
			//2nd---> rev+ s.charAt(6)---->m+u---> rev=mu;
			//3rd--->reve(mu) + s.charAt(5)---->mu+i----> rev=mui;
		}
		
		System.out.println(rev);
		
		
		//2nd Method ---> using StringBuffer Class(mutable class)
		
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
