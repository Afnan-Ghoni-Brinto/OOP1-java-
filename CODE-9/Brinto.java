public class Brinto{
	private String num;
	private Friend[] f=new Friend[100];
	
	public Brinto(String num){this.num=num;} 
	public void setNum(){this.num=num;}
    public 	String getNum(){return num;}
	
	public void add(Friend a){
		int flag=1;
		for(int i=0;i<f.length;i++){
			if(f[i]==null){
				f[i]=a;
				flag=1;
				break;}}
		    if(flag==1){System.out.println(" Inserted");}
			else{System.out.println(" CAN'T BE UR FRIEND");}
	}
	
	public void remove(Friend a){
		int flag=0;
		for(int i=0;i<f.length;i++){
			if(f[i]==a){
				f[i]=null;
				flag=1;
				break;}}
				if(flag==1){System.out.println(a.getName()+" Removed");}
			else{System.out.println(a.getName()+" CAN'T REMOVE");}
	}
	public Friend search(String name){
		Friend a=null;
		for(int i=0;i<f.length;i++){
			if(f[i]!=null){
				if(f[i].getName()==name){
					a=f[i];}}
		}
		return a;
	}
	
	public void show(){
		for(int i=0;i<f.length;i++){
			if(f[i]!=null){
				f[i].show();
			}
		}
	}
}