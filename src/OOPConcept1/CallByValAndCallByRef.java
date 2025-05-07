package OOPConcept1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		int x=60;
		int y=40;
		
		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		
		int d=obj.testSum(x, y);// Call by value or Pass by value
		System.out.println(d);
		
		obj.p=50;
		obj.q=60;
		
		System.out.println("p= " +obj.p +" q=" + obj.q);
		
		//calling swap method
		obj.swap(obj);// Call by Reference(controversial)
		System.out.println("p= " +obj.p +" q=" + obj.q);
		
		

	}
	
	public int testSum(int a, int b) {
		
//		 a=40;
//		 b=40;  -------> c will take the latest value
		int c =a+b;
		return c;
		}
	
	public void swap(CallByValAndCallByRef t) {
		
		int temp=t.p;//temp=50
		t.p=t.q;//t.p=60
		t.q=temp;//t.q=50
		
		
		
	}
	
	

}
