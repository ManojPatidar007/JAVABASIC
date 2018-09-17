package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String []qq){
		
		Resource factory=new ClassPathResource("AppContext.xml");
		BeanFactory fc= new XmlBeanFactory(factory);
	}

}
