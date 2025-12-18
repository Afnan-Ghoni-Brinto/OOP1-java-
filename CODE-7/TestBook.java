public class TestBook extends Book{
	private int standard;
	
	public TestBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard){
		super(isbn,bookTitle,authorName, price,availableQuantity);
		this.standard=standard;
	}
public void setstandard(int standard){this.standard=standard;}
public int getstandard(){return standard;}
public void show(){
	System.out.println("  TEXT BOOK ");
	super.show();
	System.out.println("STANDARD : "+ standard);
}

}