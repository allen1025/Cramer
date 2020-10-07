package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Dao.CramerDao;
import model.Cramer;

@Controller
@RequestMapping(value = "Calculation")
public class CalculationController {
	
	@RequestMapping(value = "Calculationnormal",method=RequestMethod.POST)
	public ModelAndView Calculationnormal(HttpServletRequest request ,HttpServletResponse reponse) throws Exception{
		double a1 =Double.parseDouble(request.getParameter("a1"));
		double a2=Double.parseDouble(request.getParameter("a2"));
		double a3=Double.parseDouble(request.getParameter("a3"));
		double b1=Double.parseDouble(request.getParameter("b1"));
		double b2=Double.parseDouble(request.getParameter("b2"));
		double b3=Double.parseDouble(request.getParameter("b3"));
		double c1=Double.parseDouble(request.getParameter("c1"));
		double c2=Double.parseDouble(request.getParameter("c2"));
		double c3=Double.parseDouble(request.getParameter("c3"));
		double d1=Double.parseDouble(request.getParameter("d1"));
		double d2=Double.parseDouble(request.getParameter("d2"));
		double d3=Double.parseDouble(request.getParameter("d3"));
		
		Object[] n=  (Object[]) new CramerDao().Calculationnormal(a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3);
		
		if(n==null) {
			return new ModelAndView("/error");
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("N", n);
			return new ModelAndView("/nsussess");
		}
		
	}
	@RequestMapping(value = "Calculationdifferent",method=RequestMethod.POST)
	public ModelAndView Calculationdifferent(HttpServletRequest request ,HttpServletResponse reponse)throws Exception {
		double a1 =Double.parseDouble(request.getParameter("a1"));
		double a2=Double.parseDouble(request.getParameter("a2"));
		double a3=Double.parseDouble(request.getParameter("a3"));
		double b1=Double.parseDouble(request.getParameter("b1"));
		double b2=Double.parseDouble(request.getParameter("b2"));
		double b3=Double.parseDouble(request.getParameter("b3"));
		double c1=Double.parseDouble(request.getParameter("c1"));
		double c2=Double.parseDouble(request.getParameter("c2"));
		double c3=Double.parseDouble(request.getParameter("c3"));
		double d1=Double.parseDouble(request.getParameter("d1"));
		double d2=Double.parseDouble(request.getParameter("d2"));
		double d3=Double.parseDouble(request.getParameter("d3"));
		
		Object[] n=  (Object[]) new CramerDao().Calculationnormal(a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3);
		
		if(n==null) {
			return new ModelAndView("/error");
		}else {
			HttpSession session=request.getSession();
			session.setAttribute("N", n);
			return new ModelAndView("/dsussess");
		}
		
	}
}
