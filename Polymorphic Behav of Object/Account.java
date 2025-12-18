import java.lang.*;
public class Account  
{
	private String accNumber;
	private double accBalance;
	public Account() { }
	public Account(String accNumber, double accBalance)
	{
		System.out.println("PC Called Account");
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}
	public void setAccNumber(String accNumber)
	{
		this.accNumber = accNumber;
	}
	public void setAccBalance(double accBalance)
	{
		this.accBalance = accBalance;
	}
	public String getAccNumber() { return this.accNumber; }
	public double getAccBalance() { return this.accBalance; }
	public void showInfo(){
		System.out.println("PC Called Account ShowInfo");
	}
}