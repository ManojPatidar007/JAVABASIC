package com.mp;

import java.io.IOException;
import java.sql.SQLException;

public class Student extends Clg{
	public void showStudent(int a) throws studentNotFound{
		
		if(a<18){
			throw new studentNotFound("not valid marks");
		}
			throw new  NullPointerException();
		
		
	};
	public String getStudent()throws IOException,SQLException,studentNotFound,Exception{
		return null;
		//throw new NullPointerException();
		
	}

	
	
	
}
