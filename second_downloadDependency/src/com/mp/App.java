package com.mp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mp.AppConfigs;

public class App {
public static void main(String []ar){
	
	ApplicationContext aps=new AnnotationConfigApplicationContext(AppConfigs.class);
	teacher tc=(teacher)aps.getBean("teacher");
	tc.printMsg();
	
}
}
