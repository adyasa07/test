package OOPConcept2;

public class testBank {

	public static void main(String[] args) {
	
		//static Polymorphism----->compile time polymorphism
		HSBCBank test=new HSBCBank();
		
		test.credit();
		test.debit();
		test.transferMoney();
		test.mutualFund();
		test.personalLoan();
		test.educationLoan();
	
		System.out.println("*******************************");
	
	//dynamic Polymorphism------>runtime polymorphism
	//child class object is referred by parent interface reference variable
	
		//only overridden methods from the parent interface is allowed
	USBank b=new HSBCBank();
	b.credit();
	b.debit();
	b.transferMoney();
	//b.educationLoan();-------> not allowed(own methods of HSBC Bank)
	
	System.out.println("***************************************");
	
	BrazilBank a=new HSBCBank();
	a.mutualFund();
	

	
	

}
}
