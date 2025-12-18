public class Student extends Person{
	private double cgpa;
	private int course;
	public String BSc;
	public Student(){};
	public Student(String name,int age,int number,double cgpa,int course,String BSc){
		super(name,age,number);
		this.cgpa=cgpa;
		this.course=course;
		this.BSc=BSc;
	}
	public void setC(double cgpa){
		this.cgpa=cgpa;
	}
	public void setCourse(int course){
		this.course=course;
	}
	public void setBSc(String BSc){
		this.BSc=BSc;
	}
	public double getC(){
		return cgpa;
	}
	public int getCourse(){
		return course;
	}
	public String getBSc(){
		return BSc;
	}
	public void ShowInfo(){
		super.ShowInfo();
		System.out.println("CGPA :"+cgpa);
		System.out.println("COURSE :"+course);
		System.out.println("BSc :"+BSc);
	}
}