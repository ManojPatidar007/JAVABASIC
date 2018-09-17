package mp.king;

public class Student {
	private String name;
	private int age;
	
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void disply(){
		
		System.out.println("Nmae="+name+"  age="+age);
	}

}
