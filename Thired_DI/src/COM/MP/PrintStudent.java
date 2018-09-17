package COM.MP;

public class PrintStudent {
	StudentDao st;
	StudentDao dao;
	public PrintStudent(){}
	public  PrintStudent(StudentDao st) {
		this.st=st;
		
	}
	public void printSt(){
	System.out.println("name="+st.getName()+"  age="+st.getAge());
	}
public void setDao(StudentDao dao){
	this.dao=dao;
}
public void printStst(){
System.out.println("name="+dao.getName()+"  age="+dao.getAge());
}
}
