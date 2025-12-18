import java.lang.*;
public class Start 
{
	public static void main(String[] args)
	{
		//Polymorhics behav of object
		Account a1 = new FixedAccount("AC1", 250000.00, 2);
		Account a2 = new SavingsAccount("AC2", 10000.00, 0.2);

		a1.showInfo();

		
		Customer c1 = new Customer(102313, "Mr X", 3); //array size = 3
		c1.addAccount(a1); //index 0 = a1
		c1.addAccount(a2); //index 1 = a2
		System.out.println();
		c1.showAllAccounts();
		c1.addAccount(a1); //index 2 = a1
		System.out.println();
		c1.removeAccount(a2); //index 1 = null
		System.out.println();
		c1.showAllAccounts();
	}
}