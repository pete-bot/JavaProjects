package lab2;
// peter kydd
// create a bankAccount class
// create a checque accoutn class

// clearly this is not a correct import 


import java.util.Date;

public class BankAccount {
	
	// create an account counter
	// we want this to be public so that we can address it with:
	// BankAccount.numAccounts
	public static int numAccounts; 
	
	// default constructor for sub type
	public BankAccount(){}
	
	// constructor
	public BankAccount(float balance, int accountNumber, String accountName){
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	// return account balance
	public float getBalance(){
		return this.balance;
	}
	
	// return account number
	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	
	// make a deposit
	// no restriciton on deposits
	public void deposit(float amount){
		this.balance = this.balance + amount;
		System.out.println("Current balance is now: $" + this.balance);
	}
	
	// can only subtract up to 800 a day. 
	public void withdrawal(int amount){
		
		if( ((this.balance-amount) < 0 ) && ((this.dailyDraw + amount) < 800.0)){
			System.out.println("Insufficient Funds - cancelling transaction");
		}else{
			System.out.println("Funds withdrawn");
			
			// call class method to simulate bank stuffs
			BankAccount.accInterface();
		}
		
		// also that the user has not withdrawn more than 800 per day 
		// need to check the time that 
		
	}
	
	// simulate the completion of bank interface (ie, move money, etc)
	private static void accInterface(){
		System.out.println("Completing internal transaction.");
		// do bank stuffs here
	}
	
	
	// funds remaining
	private float balance;
	// account number
	private int accountNumber;
	// account name - user or else
	private String accountName;
	// amount of funds drawn this instance of 24hours. 
	private float dailyDraw;

}
