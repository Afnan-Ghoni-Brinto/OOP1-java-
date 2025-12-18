public class Student{
	private String name;
	private int roll;
	private int Class;
	private String add;
	
	public Student(){}
	public Student(String name,int roll,int Class, String add){
		this.name=name;
		this.roll=roll;
		this.Class=Class;
		this.add=add;
	}//SETTER
	public void setName(String name){this.name=name;}
	public void setRoll(int roll){this.roll=roll;}
	public void setClass(int Class){this.Class=Class;}
	public void setAdd(String add){this.add=add;}
	//GETTER
	public String getName(){return name;}
	public int getRoll(){return roll;}
	public int getClss(){return Class;}
	public String getAdd(){return add;}
	
	public void show(){
		System.out.println("STUDENT NAME   :"+name);
		System.out.println("STUDENT ROLL   :"+roll);
		System.out.println("STUDENT CLASS  :"+Class);
		System.out.println("SYUDENT ADDRESS:"+add);
		
	}
}