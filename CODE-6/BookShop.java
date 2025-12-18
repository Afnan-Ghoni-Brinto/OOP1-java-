public class BookShop{
	private String name;
	private TextBook textBooks []=new TextBook[100];
	private StoryBook storyBooks []=new StoryBook[100];
	public BookShop(){}
	public BookShop(String name){this.name=name;}
	public void setName(String name){this.name=name;}
	public String getName(){return name;}
	
	public boolean insertTextbook(TextBook tb){
		int flag=0;
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i]==null){
				textBooks[i]=tb;
				flag=1;
				break;
		}}
			if(flag==1){System.out.println("INSERTED"); return true;}
			else{System.out.println("CAN'T BE INSERTED"); return false;}
		
	}
	public boolean removeTextBook(TextBook tb){
		int flag=0;
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i]==tb){
				textBooks[i]=null;
				flag=1;
				break;
		}}
			if(flag==1){ System.out.println("REMOVED"); return true;}
			else{System.out.println("CAN't REMOVE"); return false;}
		
	}
	public TextBook searchTextBook(String isbn){
		TextBook a =null;
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i]!=null){
				if(textBooks[i].getIsbn()==isbn){
					a=textBooks[i];
				}
			}
		}
		return a;
	}
	public void showAllTextBooks(){
		for(int i=0;i<textBooks.length;i++){
			if(textBooks[i]!=null){
				textBooks[i].showDetails();
				
			}
		}
	}
	
}