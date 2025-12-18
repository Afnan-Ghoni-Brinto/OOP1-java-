public class Adib extends Student{
	private String ADD;
	private int GF;
	public Adib(){};
	public Adib(String name,int age,int number,double cgpa,int course,String BSc,String ADD,int GF)
	{
		super(name,age,number,cgpa,course,BSc);
		this.ADD=ADD;
		this.GF=GF;
	}
	public void setADD(String ADD){
		this.ADD=ADD;
	}
	public void setGF(int GF){
		this.GF=GF;
	}
	public String getADD(){
		return ADD;
	}
	public int getGF(){
		return GF;
	}
	public void ShowInfo(){
		super.ShowInfo();
		System.out.println("ADDRESS:"+ADD);
		System.out.println("GF:"+GF);
		
	}
}