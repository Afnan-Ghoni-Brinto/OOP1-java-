public class TestBook extends Book{
	private int standard;
	
	public TestBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard){
		super(isbn,bookTitle,authorName, price,availableQuantity);
		this.standard=standard;
	}
     public void setstandard(int standard){this.standard=standard;}
     public int getstandard(){return standard;}
	 public void showDetails() {
        System.out.println("Text Book");
        System.out.println("ISBN: " +super.getIsbn());
        System.out.println("Title: " +super.getBookTitle());
        System.out.println("Author: " +super.getAuthorName());
        System.out.println("Price: $" + super.getPrice());
        System.out.println("Available Quantity: " +super.getAvailableQuantity());
	    System.out.println("Standard: " + standard);}
}