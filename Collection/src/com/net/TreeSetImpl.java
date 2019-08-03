import java.util.*;
import java.util.*;
class TreeSetImpl{
	
	public static void main(String ar[]){
		Student s=new Student(2,"Dello");
		Student sa=new Student(1,"Dellos");
		Student sc=new Student(1,"Delloooo");
		Student sb=new Student(3,"Dello");
		Set<Student> s1=new LinkedHashSet();
		Set<Student> s2=new TreeSet();
		s1.add(sb);
		s1.add(sa);
		s1.add(s);
		s1.add(sc);
		s2.add(sb);
		s2.add(sa);
		s2.add(s);
		s2.add(sc);
		
		for(Student a:s1){
			System.out.println(a);
		}
		System.out.println("tree.................");
		for(Student a:s2){
			System.out.println(a);
		}
	}
}