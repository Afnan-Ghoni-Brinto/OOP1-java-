public class FixedAccount extends Account 
{
	private int year;
	public FixedAccount() { }
	public FixedAccount(String accNumber, double accBalance, int year)
	{
		
		super(accNumber, accBalance);
		System.out.println("PC Called Fixed Account");
		this.year = year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public int getYear() { return this.year; }
	
}