package demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@Autowired 
	OrderDAO dao;
	
	@GetMapping("/book")
	public ModelAndView order(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		Order o = new Order();
		o.setFirstname(req.getParameter("firstname"));
		o.setLastname(req.getParameter("lastname"));
		o.setEmail(req.getParameter("email"));
		o.setMob(req.getParameter("mob"));
		o.setDate(req.getParameter("date"));
		o.setMovie(req.getParameter("movie"));
		o.setTkts(Integer.parseInt(req.getParameter("tkts")));
		o.setPrice(Integer.parseInt(req.getParameter("tkts"))*200);
		dao.insert(o);
		mv.setViewName("ordered.html");
		return mv;
		
	}
	@GetMapping("/get")
	public ModelAndView order1(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv=new ModelAndView();
		String s = req.getParameter("email");
		List<Order> o = dao.get(s);
		mv.setViewName("ticket.jsp");
		mv.addObject("o", o);
		return mv;
	}	

}
