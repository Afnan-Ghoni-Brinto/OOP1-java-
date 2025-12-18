public class Account{
	private int accNo;
	private double accBalance;
	
	public Account(){
		System.out.println("Empty Cons");
	}
	public Account(int accNo,double accBalance){
		this.accNo = accNo;
		this.accBalance = accBalance;
	}
	public void set_accBalance(double accBalance){
		this.accBalance = accBalance;
	}
	public double get_accBalance(){
		return accBalance;
	}
	public void showDetails(){
		System.out.println("Account No: "+accNo);
		System.out.println("Account Balance: "+accBalance);
		
	}
}