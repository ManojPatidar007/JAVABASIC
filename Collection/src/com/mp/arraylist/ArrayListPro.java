package com.mp.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.mp.dao.Student;

public class ArrayListPro extends Student{
	public static ArrayList<Student> list=new ArrayList<>(0);
	public ArrayListPro() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayListPro(int id,String name,String clg){
		//super(id, clg, clg);
		this.setId(id);
		this.setClg(clg);
		this.setName(name);
		list.add(this);
	}
	
	public void show(){
		Iterator ir=this.list.iterator();
		while(ir.hasNext()){
			Student s=(Student) ir.next();
			System.out.println("ID="+s.getId()+" name="+s.getName()+" clg="+s.getClg());
		}
		//list.
	}
	public void showID(){
		Iterator ir=this.list.iterator();
		//while(ir.hasNext()){
			//Student s=(Student) ir.next();
			System.out.println("ID="+this.getId()+" name="+this.getName()+" clg="+this.getClg());
		
		//this.getId();
		//list.
			for(Student s:list){
				System.out.println("ID="+this.getId()+" name="+this.getName()+" clg="+this.getClg());
			}
	}

}
