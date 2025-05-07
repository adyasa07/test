package OOPConcept1;

public class WrapperClass {

	public static void main(String[] args) {
		
		//String to Integer
		
		String a="100";
		System.out.println(a+20);
		
		int b=Integer.parseInt(a);
		System.out.println(b+20);
		
		//String to Double
		
		String m="40.5";
		System.out.println(m+10);
		
		double n=Double.parseDouble(m);
		System.out.println(n+10);
		
		//String to boolean
		
		String j="True";
		boolean k=Boolean.parseBoolean(j);
		System.out.println(k);
		
		//int to String
		
		int e=600;
		System.out.println(e+20);
		String f=String.valueOf(e);
		System.out.println(f+20);
		
		//Exception
//		String l="100A";
//		Integer o=Integer.parseInt(l); //java.lang.NumberFormatException: For input string: "100A"
//		System.out.println(o);
	
	
	}

}
