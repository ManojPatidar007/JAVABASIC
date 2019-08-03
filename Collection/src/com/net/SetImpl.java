import java.util.*;

class SetImpl{
	public static void main(String sr[]){
		Set<Employee> em=new HashSet();
		Employee e=new Employee(10,"asd");
		e.setName("hello");
		e.setId(10);
		Employee e1=new Employee(3,"dca");
		Employee e2=new Employee(3,"dsdadsa");
		Employee e3=new Employee(4,"2131");
		em.add(e);
		em.add(e1);
		em.add(e2);
		em.add(e3);
		em.add(e3);
		for(Employee ea:em)
		System.out.println(ea);
		
		
		
	}
	
}