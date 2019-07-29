package co.grandcircus.springlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringLabController {

	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showResult( 
		@RequestParam("mpg") double mpg,
		@RequestParam("gallons")double gallons
		) {
			double result = gallons * mpg;
		  ModelAndView mv = new ModelAndView("mileage-result");
				mv.addObject("result", result);
				return mv;
	}
	
	
	@RequestMapping("/addNums-form")
	public ModelAndView showAddNumsForm() {
		return new ModelAndView("addNums-form");
	}
	
	@RequestMapping("/addResult-form")
	public ModelAndView showAddResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int result = num1 + num2;
		
		ModelAndView mav = new ModelAndView("addResult-form");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("result", result);
		return mav;
	}
	
	
	
	
	@RequestMapping("/divNums-form")
	public ModelAndView showDivisionForm() {
		return new ModelAndView("divNums-form");
	}
	
	@RequestMapping("/divisionResult-form")
	public ModelAndView showDivResult(
			@RequestParam("num1") int num1,
			@RequestParam("num2") int num2) {
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		ModelAndView mav = new ModelAndView("divisionResult-form");
		mav.addObject("num1", num1);
		mav.addObject("num2", num2);
		mav.addObject("quotient", quotient);
		mav.addObject("remainder", remainder);
		return mav;
	}
	
	
	@RequestMapping("/RepeatWord-form")
	public ModelAndView showRepeatWordForm() {
	return new ModelAndView("RepeatWord-form");
	}
	
	@RequestMapping("/RepeatWord-result")
	public ModelAndView showRepeatWordResult( 
		@RequestParam("word") String word,
		@RequestParam("num")int num
		) {
		String message = "";
		for (int i = 0; i < num; i++) {
			message += word + " ";
			
		}
		ModelAndView mv = new ModelAndView("RepeatWord-result");
				mv.addObject("message", message);
				return mv;
	}
	
}//end class
