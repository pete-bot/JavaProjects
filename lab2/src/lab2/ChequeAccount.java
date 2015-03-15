package lab2;

public class ChequeAccount extends BankAccount{
	
	public static int chequeCount;
	
	// default constructor 
	public ChequeAccount(){}
	
	// class should inherit attributes from super class
	public ChequeAccount(float balance, int accountNumber, String accountName ,int numChecks){
		super(balance, accountNumber, accountName);
		
	}
	
	private int numChecks;
	
}
