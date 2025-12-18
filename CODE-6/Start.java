public class Start{
	public static void main(String[] args){
		StoryBook s1=new StoryBook("123","HERO","AFNAN",60000,3,"ROMANCE");
		
		
		BookShop b=new BookShop("AFNAN ENTERPRICE");
		TextBook t1=new TextBook("2","PHYSICS","ALISON",500,0,1);
		TextBook t2=new TextBook("13","CHE","ALISON",600,20,2);
		TextBook t3=new TextBook("93","MATH","ALISON",700,9,3);
		TextBook t4=new TextBook("19","ICT","ALISON",800,7,4);
		TextBook t5=new TextBook("3","BGS","ALISON",900,3,5);
		b.insertTextbook(t1);
		b.insertTextbook(t2);
		b.insertTextbook(t3);
		b.insertTextbook(t4);
		b.insertTextbook(t5);
		b.showAllTextBooks();
		b.removeTextBook(t2);
		b.removeTextBook(t3);
		b.showAllTextBooks();
		
		
		
		

	}
}