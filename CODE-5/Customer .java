public class Customer{
	private String cusName;
	private int cusNid;
	private Account ac[];
	
	public Customer(){}
	public Customer(String cusName, int cusNid,int sizeOfArray){
		this.cusName = cusName;
		this.cusNid = cusNid;
		ac = new Account[sizeOfArray];
	}
	public void set_account(Account aacc){
		for(int i = 0; i<ac.length; i++){
			if(ac[i] == null){
				ac[i] = aacc;
				break;
			}
		}
	}
	public void showinfo(){
		System.out.println("Customer Name: "+cusName);
		System.out.println("Customer Nid: "+cusNid);
		for(int i = 0; i<ac.length; i++){
			if(ac[i] == null){
				System.out.println("Information of Account no. "+(i+1));
				System.out.println("null");
				System.out.println("-----------------");
			}else{
				System.out.println("Information of Account no. "+(i+1));
				ac[i].showDetails();
				System.out.println("-----------------");
			}
		}
		
	}

}