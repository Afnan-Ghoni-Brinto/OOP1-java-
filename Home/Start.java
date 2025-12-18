public class Start{
	public static void main(String[]args){
		System.out.println("       DETAILS");
		System.out.println("       1st");
		Adib a=new Adib("ADIB ALI",30,017,3.8,15,"CSE","RAJSHAHI",3);
		a.ShowInfo();
		System.out.println("       2nt");
		Brinto b=new Brinto("AFNAN",21,016,3.9,15,"CSE","BHAIRAB",0);
		b.ShowInfo();
		System.out.println("       3rd");
		Rohan r=new Rohan("MD.ROHAN",22,017,3.85,15,"CSE","CTG",1);
		r.ShowInfo();
		System.out.println("       4th");
		Wafi w=new Wafi("WAFIUL ALAM",16,017,4.0,15,"CSE","CTG",-2);
		w.ShowInfo();
		
		
	}
}