public class Start{
	public static void main(String[] args){
		Student s1=new Student("BRINTO",36,13,"BHAIRAB");
		Teacher t=new Teacher("AFNAN GHONI",50000,"01608095452",2);
		t.insertStudent(s1);
		t.showAll();
		
	}
}