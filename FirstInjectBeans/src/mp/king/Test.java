package mp.king;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author mapa0716
 *
 */
public class Test {
	public static void main(String []ar){
		Resource rs=new ClassPathResource("applicationContext.xml");
		BeanFactory fc=new XmlBeanFactory(rs);
		Student st=(Student)fc.getBean("student");
		st.disply();
		
		
	}

}
