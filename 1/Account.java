public class Account{
	public int accountNumber;
	public String accountHolderName;
	public double balance;
	public void setAccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public double getBalance(){
		return balance;
	}
	public void ShowDetails(){
		System.out.println("\nName-> "+accountHolderName);
		System.out.println("Your account NUMBER is -> "+ accountNumber);
		System.out.println("Available BALANCE -> "+balance);
	}
	
}
