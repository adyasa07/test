package OOPConcept1;

public class ConstructorConcept {
	
	String name;
	int age;
	
	
	//Constructors can be overloaded
	ConstructorConcept(){//0 param constructor
		
		System.out.println("0 param const");
	}
	
	ConstructorConcept(int i){// 1 	param constructor
		
		System.out.println("1 param const");
		System.out.println(i);
		
	}
	
	ConstructorConcept(int i,int j){// 2 params constructor
		
		System.out.println("2 param const");
		System.out.println(i + " " + j);
	}

	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);
		

	}

}
