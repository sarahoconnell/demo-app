package ie.cit.adf.demo.web;

import ie.cit.adf.demo.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TimeController {
	
	@Autowired
	private TimeService timeService;
	
	/*  use @Autowired instead
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
	*/

	@RequestMapping("time")
	public String time(Model model){		
		model.addAttribute("time", timeService.getCurrentDate());
		return "index.jsp";
		
	}
	
	/* Construct the view manually.
	 
	@RequestMapping("time")
	public ModelAndView time(){
		
		ModelAndView model = new ModelAndView("index.jsp");
		model.addObject("time", timeService.getCurrentDate());
		return model;
		
	}*/

}
