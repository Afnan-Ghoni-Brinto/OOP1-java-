public class Start{
	public static void main(String args[]){
		Account ac1 = new Account(238567,400000000);
		Account ac2 = new Account(348658,4000);
		Account ac3 = new Account(453223,40);
		
		
		Customer c1 = new Customer("Abdur Rahman",64654656,3);
		c1.set_account(ac1);
		c1.set_account(ac2);
		c1.set_account(ac3);
		c1.showinfo();
	}
}