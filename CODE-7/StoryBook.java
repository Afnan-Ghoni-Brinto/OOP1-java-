public class StoryBook extends Book{
	private String category;
	
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category){
		super(isbn,bookTitle,authorName, price,availableQuantity);
		this.category=category;
	}
public void setCategory(String category){this.category=category;}
public String getCategory(){return category;}
public void show(){
	System.out.println("  STORY BOOK ");
	super.show();
	System.out.println("CATeGORY : "+category);
}

}