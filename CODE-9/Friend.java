public class Friend{
	private String name;
	private String uni;
	private double bal;
	private String address;
	
	public Friend(String name,String uni,double bal,String address){
		this.name=name;
		this.uni=uni;
		this.bal=bal;
		this.address=address;
	}
	public void setName(String name){this.name=name;}
	public void setUni(String uni){this.uni=uni;}
	public void setBal(double bal){this.bal=bal;}
	public void setAddress(String address){this.address=address;}

	public String getName(){return name;}
	public String getUni(){return uni;}
	public double getBal(){return bal;}
	public String getAddress(){return address;}
	
	public void show(){
		System.out.println("  ####FRIEND####  ");
		System.out.println("NAME   :"+name);
		System.out.println("UNI    :"+uni);
		System.out.println("BAL    :"+bal);
		System.out.println("ADDRESS:"+address);
	}
	
}