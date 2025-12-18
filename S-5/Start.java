public class Start{
	public static void main(String[] args){
		StoryBook s1=new StoryBook("123","HERO","AFNAN",60000,3,"ROMANCE");
		s1.showDetails();
		TextBook t1=new TextBook("193","PHYSICS","ALISON",500,10,4);
		t1.showDetails();
		s1.addQuantity(500);
		
		System.out.println(s1.getAvailableQuantity());
	}
}