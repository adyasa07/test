package javaInterviewQues;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String a="@#$%#$#@ Adyasa Nayak 9348385808";
		
		a=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(a);

	}

}
