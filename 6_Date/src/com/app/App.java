package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.mp.ExDate;

public class App {
	public static void main(String []agw)
	{
		Resource resource=new ClassPathResource("AppContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		ExDate date=(ExDate)factory.getBean("exdate");
		date.printDate();
		
		
	}
}
