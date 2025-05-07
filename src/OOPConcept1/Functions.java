package OOPConcept1;

public class Functions {

	public static void main(String[] args) {
		
		Functions obj=new Functions();
		
		obj.test();
		
		int sum=obj.add();
		System.out.println(sum);
		
		String str=obj.qa();
		System.out.println(str);
		
		int div=obj.div(30, 10);
		System.out.println(div);
		
		//main method is void---->never returns a value

	}
	
	
	//non static methods/functions
	
	//return type----> void(doesn't return any value)
	public void test() {
		
		System.out.println("This is test Method");
		
	}
	
	//return type-----> int
	public int add() {
		
		System.out.println("This is add method");
		int a=10;
		int b=20;
		
		int c=a+b;
		
		return c;
	}
	
	
	//return type----> String
	public String qa() {
		
		System.out.println("This is qa method");
		
		String s="Selenium";
		
		return s;
	}
	
	//Return type----> int
	public int div(int x, int y) {
		
	System.out.println("This is division method");
		int d=x/y;
		
		return d;
		
		
	}

}
