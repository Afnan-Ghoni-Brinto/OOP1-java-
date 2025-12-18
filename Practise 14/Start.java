public class Start{
	public static void main(String [] args)
	{
		Test t= new Test();
		Test t1= new Test(50);
		//FTest t= new FTest();
		System.out.println(t.getX());
		System.out.println(t.getY());
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		
	}
}