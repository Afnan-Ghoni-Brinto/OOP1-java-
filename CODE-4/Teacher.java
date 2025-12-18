public class Teacher{
	private String tname;
	private double salary;
	private String phn;
	private Student[] s;
	
	public Teacher(String tname,double salary,String phn,int size){
		this.tname=tname;
		this.salary=salary;
		this.phn=phn;
		this.s=new Student[size];
	}//SETTER
	public void setTname(String tname){this.tname=tname;}
	public void setSalary(double salary){this.salary=salary;}
	public void setPhn(String phn){this.phn=phn;}
	//GETTER
	public String getTname(){return tname;}
	public double getSalary(){return salary;}
	public String getPhn(){return phn;}
	
	public void showAll(){
		for(int i=0;i<s.length;i++){
			if(s[i]!=null){
			    System.out.println("STUDENT NAME     :"+s[i].getName());
		        System.out.println("STUDENT ROLL     :"+s[i].getRoll());
		        System.out.println("STUDENT CLASS    :"+s[i].getClass());
		        System.out.println("SYUDENT ADDRESS  :"+s[i].getAdd());
			}
		}
		
	}
	public void insertStudent(Student a){
		int flag=0;
		for(int i=0;i<s.length;i++){
			if(s[i]==null){
				s[i]=a;
				flag=1;
				break;}
		}if(flag==1){System.out.println("INSERTED");}
		else{System.out.println(" CAN'T INSERT STUDENT :"+a.getName());}
	}
	public void removeStudent(Student a){
		int flag=0;
		for(int i=0;i<s.length;i++){
			if(s[i]==a){
				s[i]=null;
				flag=1;
				break;
			}
		}if(flag==1){System.out.println("Student "+a.getName()+" Removed from class");}
		else{System.out.println("Student "+a.getName()+"Could not be Removed from class");}
	}
	public Student searchStudent(String name){
		Student a=null;
		for(int i=0;i<s.length;i++){
			if(s[i]!=null){
				if(s[i].getName()==name){
					a=s[i];
					break;
				}
				
			}
		}
		return a;
	}
	
}