package abcd;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDao(101,"abc",5);
		StudentDao dao1=new StudentDao(102,"abc",6);
		StudentDao dao2=new StudentDao(103,"abc",3);
		StudentDao dao3=new StudentDao(104,"abc",3);
		StudentDao dao4=new StudentDao(105,"abc",3);
		StudentDao dao5=new StudentDao(106,"abc",1);
		Set<StudentDao> st=new TreeSet<>();
		st.add(dao);
		st.add(dao1);
		st.add(dao2);
		st.add(dao3);
		st.add(dao4);
		st.add(dao5);
		dao.setMarks(50);
		for(StudentDao std:st){
			System.out.println("id=:"+std.id+ " name=:"+std.name+" sem=:"+std.sem);
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
