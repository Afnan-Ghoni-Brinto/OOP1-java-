public interface BookShopOperations{
	boolean insertBook(Book a);
	boolean removeBook(Book a);
	void showDetails();
	Book searchBook(String isbn);
}