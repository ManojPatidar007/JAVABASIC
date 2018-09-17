package com.mp.dao;

import com.mp.arraylist.ArrayListPro;

public class Student implements Comparable<Student>{
int id;
String name;
String clg;
public Student(){}
public Student(int id, String name, String clg) {
	super();
	this.id = id;
	this.name = name;
	this.clg = clg;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getClg() {
	return clg;
}
public void setClg(String clg) {
	this.clg = clg;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", clg=" + clg + "]";
}
public void show(Student s){
	System.out.println("ID="+s.getId()+" name="+s.getName()+" clg="+s.getClg());
}
public boolean equals(Student s){
	if(this.id==s.id){
		return true;
	}
	return false;
	
}

@Override
public int hashCode()
{
     
    // We are returning the Geek_id 
    // as a hashcode value.
    // we can also return some 
    // other calculated value or may
    // be memory address of the 
    // Object on which it is invoked. 
    // it depends on how you implement 
    // hashCode() method.
    return this.id;
}
@Override
public int compareTo(Student b) {
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }
}
 
}
