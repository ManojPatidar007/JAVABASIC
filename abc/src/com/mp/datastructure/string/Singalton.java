class Singalton{
	private static Singalton s;
	static{
	 s=new Singalton();}
	private Singalton(){
		
	}
	public static Singalton getInstance(){
		return s;
	}
	public void show(){
		getInstance();
		System.out.println("class is working");
		
	}
	
	public static void main(String ar[]){
		Singalton s1=getInstance();
		s1.show();
	}
}