public class BookShop implements BookShopOperations{
	private String name;
	private Book[] b=new Book[100];
	
	public BookShop(){}
	public BookShop(String name){
		this.name=name;
	}
	public void setName(String name){this.name=name;}
	public String getName(){return name;}

	public boolean insertBook(Book a){
		int flag=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==null){
				b[i]=a;
				flag=1;
				break;}}
				
			if(flag==1){return true;}
			else{return false;}
	}
	public boolean removeBook(Book a){
		int flag=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==a){
				b[i]=null;
				flag=1;
				break;}}
				
			if(flag==1){return true;}
			else{return false;}
	}
	public Book searchBook(String isbn){
		Book a=null;
		for(int i=0;i<b.length;i++){
			if(b[i]!=null){
				if(b[i].getIsbn()==isbn){
					a=b[i];
				}
			}
		}
		return a;
	}
	public void showDetails(){
		System.out.println("     AG STORE   ");
		for(int i=0;i<b.length;i++){
			if(b[i]!=null){
				b[i].showDetails();
			}
		}
	}
}