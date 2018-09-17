package com.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.controller.Controller;

public class App {
public static void main(String []as){
	
	Resource rs=new ClassPathResource("AppContext.xml");
	BeanFactory factory=new XmlBeanFactory(rs);
	Controller cr=(Controller)factory.getBean("controller");
	cr.stPrint();
}

}
