package com.mp.linkedList;
import com.mp.*;
import com.mp.dao.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String ar[]){
		Collection<? extends String> List = null;
		//ArrayList<String> al=new ArrayList<String>(List);
		List<Student> list=new LinkedList<>();
		List<Student> list2=new LinkedList<>();
		System.out.println(list.equals(list2));
		
		ArrayList<Integer> list1=new ArrayList<>();
		List<Student> list3=new LinkedList<>();
		System.out.println(list1.equals(list3));
		Student s=new Student(101,"hello","abc");
		Student s1=new Student(102,"hello","abc");
		Student s2=new Student(103,"hello","abc");
		Student s3=new Student(104,"hello","abc");
		Student s4=new Student(105,"hello","abc");

		Abc a=new Abc();
		list.add(s);
		list.add(s1);list.add(s2);
		list.add(1,s3);
		list.add(s4);
		Student sa=list.get(1);
		System.out.println("ID="+sa.getId()+" name="+sa.getName()+" clg="+sa.getClg());
		//list.add(a);
		for(Student t:list){
			System.out.println("ID="+t.getId()+" name="+t.getName()+" clg="+t.getClg());
		}
	}

}
class Abc{}
