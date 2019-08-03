

class Student implements Comparable<Student>{
int id;
	String name;
	public int compareTo(Student s){
		if(this.id>s.id){
			return 1;
		}
		else if(this.id<s.id){
			return -1;
		}
		else return 0;
	}
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
	public Student(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	
	//treeset never use equals and hashCode and vise versa
	public boolean equals(Object e){
		//System.out.println("inside equals");
		Student a=(Student)e;
		return this.id==a.id;

	}
	public int hashCode(){
				//System.out.println("inside hashCode");
		return (this.id%10);
	}
}