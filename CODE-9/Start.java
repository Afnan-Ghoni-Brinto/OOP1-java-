public class Start{
	public static void main(String [] args){
		Brinto b=new Brinto("01608095452");
		
		Friend f1=new Friend("ADIB","AIUB",900000,"RAJSHAHI");
		Friend f2=new Friend("Wafi","AIUB",900000,"CTG");
		Friend f3=new Friend("ROHAN","AIUB",900000,"CTG");
		Friend f4=new Friend("SAHARIAR","AIUB",900000,"DHAKA");
		Friend f5=new Friend("FARHA","AIUB",900000,"DHAKA");
		Friend f6=new Friend("SHAN","SUST",900000,"BHAIRAB");
		Friend f7=new Friend("JESHAN","DC",900000,"CTG");
		Friend f8=new Friend("SAMI","CU",900000,"BHAIRAB");
		
		b.add(f1);
		b.add(f2);
		b.add(f3);
		b.add(f4);
		b.add(f5);
		b.add(f6);
		b.add(f7);
		b.add(f8);
		
		b.show();
		
		b.remove(f6);
		b.remove(f7);
		b.remove(f8);
		
		if(b.search("ADIB")!=null){
			System.out.println("ADIB is a friend ");
		}
		else{System.out.println("ADIB is not a Friend ");}
		
		
		
		
		
	}
}