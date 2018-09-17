import java.util.HashMap;
import java.util.Map;

import javax.naming.ldap.Control;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController extends com.sun.org.apache.xpath.internal.operations.String implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest re, HttpServletResponse rs) throws Exception {
		// TODO Auto-generated method stub
		
		String name=re.getParameter("name");
		Map m=new HashMap();
		m.put("msg", "Hello "+name);
		
		return new ModelAndView("Success",m);
	}

public char charAt(int i){
	return 'a';
}

}
