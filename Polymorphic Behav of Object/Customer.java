import java.lang.*;
public class Customer 
{
	private int nid;
	private String name;
	//Customer has many Accounts (1 to many association)
	private Account accounts[];// = new Account[50]; //if size is mentioned
	public Customer() { }
	public Customer(int nid, String name, int size)
	{
		this.nid = nid;
		this.name = name;
		this.accounts = new Account[size]; //Array 2nd approach
	}
	public void setNid(int nid) { this.nid = nid; }
	public void setName(String name) { this.name = name; }
	public int getNid() { return this.nid; }
	public String getName() { return this.name; }
	
	public void addAccount(Account acc)
	{
		boolean flag = false; //intially no account is added
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = acc; //account added
				flag = true;
				System.out.println("***Account "+i+" information***");
				break;
			}
		}
		if(flag == true)
		{
			System.out.println("Account Inserted!");
		}
		else 
		{
			System.out.println("Account cann't insert");
		}
	}
	public void showAllAccounts()
	{
		System.out.println("Customer NID: "+this.nid);
		System.out.println("Customer Name: "+this.name);
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				System.out.println("***Account "+i+" information***");
				System.out.println("Nothing to show");
				System.out.println();
			}
			else
			{
				System.out.println("***Account "+i+" information***");
				System.out.println("Account number: "+accounts[i].getAccNumber());
				System.out.println("Account balance: "+accounts[i].getAccBalance());
				System.out.println();
			}
		}
	}
	public void removeAccount(Account acc)
	{
		int flag = 0; //intially no account is deleted
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == acc)
			{
				accounts[i] = null; //account deleted
				flag = 1;
				System.out.println("***Account "+i+" information***");
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account Deleted!");
		}
		else 
		{
			System.out.println("Account cann't find");
		}
	}
}