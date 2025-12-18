public class Person{
	public String name;
	public int age;
	public int number;
	public Person(){
		System.out.println("Empty");}
	public Person(String name,int age,int number){
		this.name=name;
		this.age=age;
		this.number=number;
	}
	public void setN(String name){
		this.name=name;
	}
	public void setA(int age){
		this.age=age;
	}
	public void setN(int number){
		this.number=number;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getNumber(){
		return number;
	}
	public void ShowInfo(){
		System.out.println("NAME:"+name);
		System.out.println("AGE:"+age);
		System.out.println("NUMBER:"+number);
	}
	
}