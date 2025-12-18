public class Start{
	public static void main(String[] args){
		BookShop book=new BookShop("   AG   ");
		StoryBook s=new StoryBook("321","OVE","FAHMIDA",2000,5,"love");
		StoryBook s1=new StoryBook("421","MEW","FAHMIDA",4000,4,"love");
		StoryBook s2=new StoryBook("521","TAW","FAHMIDA",1500,3,"love");
		StoryBook s3=new StoryBook("621","RRR","FAHMIDA",1800,2,"love");
		StoryBook s4=new StoryBook("721","TTE","FAHMIDA",1900,1,"love");
		
		TestBook t=new TestBook("123","MATH","FAHMIDA",1200,10,1);
		TestBook t1=new TestBook("124","PHY","FAHMIDA",900,9,2);
		TestBook t2=new TestBook("125","CHE","FAHMIDA",800,9,3);
		TestBook t3=new TestBook("126","ICT","FAHMIDA",300,8,4);
		TestBook t4=new TestBook("127","DM","FAHMIDA",400,6,5);
		
		Book a1=new TestBook("987","JAVA","TAMANNA",200,50,9);
		book.insertBook(s);
		book.insertBook(s1);
		book.insertBook(s2);
		book.insertBook(s3);
		book.insertBook(s4);
		
		book.insertBook(t);
		book.insertBook(t1);
		book.insertBook(t2);
		book.insertBook(t3);
		book.insertBook(a1);
		
		book.removeBook(s1);
		book.removeBook(s3);
		book.removeBook(t1);
		book.showDetails();
		book.searchBook("321");
		if(book.searchBook("321")!=null){
			System.out.println("BOOK "+321+" EXISTS");}
		else{ System.out.println("BOOK "+321+" DOESNT EXISTS");}
		if(book.searchBook("444")!=null){
			System.out.println("BOOK "+444+" EXISTS");}
		else{ System.out.println("BOOK "+444+" DOESNT EXISTS");}
		
		
		
	}
}