public final class Test{
	private final int x=10;
	private final int y;
	
	public Test(){
		y=30;
	}
	public Test(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	/*public final void show(){
		System.out.println(x+y);
	}*/
	
	public abstract void show();
	
}