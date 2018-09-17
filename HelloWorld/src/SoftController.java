import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.mp.Test;

public class SoftController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Map m=new HashMap<>();
		Test t=new Test();
		m.put("msg",t.show(req.getParameter("name")));
		
		// TODO Auto-generated method stub
		return new ModelAndView("Hello",m);
	}

}
