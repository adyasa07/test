package javaInterviewQues;

public class OccurencesOfChar {

	public static void main(String[] args) {
		
		String str="java is a programming language";
		
		charCountStrLength(str,"a");
		charCountCharArray(str,'m');
		getCharCountStrLength(str,'j');
	}
	
	public static void charCountStrLength(String str,String val) {
		
		//1.using string length and removing chars
		
		int totalCount=str.length();
		int countAfterRemove=str.replaceAll(val, "").length();
		
		int count=totalCount-countAfterRemove;
		System.out.println("Number of Occurences of the given character is : " + count);
		
	}
	
	public static void charCountCharArray(String str,char val) {
		
		//2.converting the string to char array
		
		int count=0;
		
		for(char ch:str.toCharArray() ) {
			
			if(ch == val) {
				
				count++;
			}
		
		}
		System.out.println(val + " : " + count);
	}
	
	public static void getCharCountStrLength(String str, char val) {
		
		//3. Using string length and for loop
		int count=0;
		
		for(int i=0; i<str.length() ;i++) {
			
			if(str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + " : " +count);
		
	}
	
	

}
