package OOPConcept2;

public class HSBCBank implements USBank, BrazilBank {
	
	//if a class is implementing an interface, then it is mandatory to define/override all the methods from the Interface
	//methods from USBank Interface
	public void credit() {
		
		System.out.println("HSBC credit method");
	}
	
	public void debit() {
		
		System.out.println("HSBC debit method");
	}

	@Override
	public void transferMoney() {
		
		System.out.println("HSBC Transfer Money method");
		
	}
    
	//Methods from BrazilBank Interface
	@Override
	public void mutualFund() {
		
		System.out.println("HSBC Mutual Fund method");
		
	}
	
	//own methods
	
	public void educationLoan(){
		
		System.out.println("HSBC Education Loan method");
	}
	
	public void personalLoan() {
		
		System.out.println("HSBC Personal Loan method");
	}
	


}
