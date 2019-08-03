import java.util.*;
class Employee{
	
	int id;
	String name;
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(int id){
		this.id=id;
	}
	public String toString(){
		return this.id+" "+this.name;
	}
		public Employee(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	public boolean equals(Object e){
		Employee a=(Employee)e;
		return this.id==a.id;

	}
	public int hashCode(){
		return (this.id%10);
	}	
}