package COM.MP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String []ar)
	{
	    Resource resource=new ClassPathResource("ApplicationContexts.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
		PrintStudent ps=(PrintStudent)factory.getBean("printStd");
		ps.printSt();
		PrintStudent pst=(PrintStudent)factory.getBean("printStdSetter");
		pst.printStst();
		
		
	}

}
