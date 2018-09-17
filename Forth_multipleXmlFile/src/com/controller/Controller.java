package com.controller;

import com.mp.Student;

public class Controller {
	
	Student st;
	Student sts;
	public Controller(Student st){
		this.st=st;
	}
	public void stPrint(){
		
		System.out.println("student"+st);
	}
	public Student setSt(){
		return new Student();
	}

}
