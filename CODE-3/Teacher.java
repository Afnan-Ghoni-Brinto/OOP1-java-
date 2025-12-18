public class Teacher{
	private String tname;
	private double salary;
	private String phn;
	private Student s;
	
	public Teacher(String tname,double salary,String phn,Student s){
		this.tname=tname;
		this.salary=salary;
		this.phn=phn;
		this.s=s;
	}//SETTER
	public void setTname(String tname){this.tname=tname;}
	public void setSalary(double salary){this.salary=salary;}
	public void setPhn(String phn){this.phn=phn;}
	public void setStudent(Student s){this.s=s;}
	//GETTER
	public String getTname(){return tname;}
	public double getSalary(){return salary;}
	public String getPhn(){return phn;}
	public Student getStudent(){return s;}
	
	public void show(){
		System.out.println("TEACHER NAME   :"+tname);
		System.out.println("SALARY         :"+salary);
		System.out.println("TEACHER PHN    :"+phn);
		s.show();
	}
	
}