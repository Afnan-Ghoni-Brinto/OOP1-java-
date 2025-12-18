public class Start{
	public static void main(String[] args){
		System.out.println("\n\nWELCOME TO OUR LIBRARY\n\n");
		Book b=new Book("10-12312-2","HARRY POTTER","J.K.ROWLING",2000,5);
		b.addQuantity(3);
		b.sellQuantity(1);
		b.showDetails();
		
		System.out.println("\n\nANOTHER OBJECT\n\n");
		Book c=new Book("29-90992-4","THE LOST IN BLUE","J.K.ROWLING",5000,2);
		c.addQuantity(2);
		c.sellQuantity(2);
		c.showDetails();
	}
}