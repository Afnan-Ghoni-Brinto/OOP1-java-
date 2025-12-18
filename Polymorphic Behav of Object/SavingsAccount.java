public class SavingsAccount extends Account 
{
	private double interestRate;
	public SavingsAccount() { }
	public SavingsAccount(String accNumber, double accBalance, double interestRate)
	{
		super(accNumber, accBalance);
		System.out.println("PC Called SaVING Account");
		this.interestRate = interestRate;
	}
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate() { return this.interestRate; }
	
	
}