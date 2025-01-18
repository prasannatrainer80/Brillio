package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.mvc.dao.EmployDao;
import com.java.mvc.model.Employ;

@Controller
public class HomeController {

	@Autowired
	private EmployDao employDaoImpl;
	
	 @RequestMapping(value = "/deleteemploy", method = RequestMethod.GET)
	 public ModelAndView deleteContact(HttpServletRequest request) {
	     int empno = Integer.parseInt(request.getParameter("empno"));
	     employDaoImpl.deleteEmployDao(empno);
	     return new ModelAndView("redirect:/");
	 }

	 @RequestMapping(value="/editemploy")
		public ModelAndView editEmploy(HttpServletRequest request) {
		    int empno = Integer.parseInt(request.getParameter("empno"));
		    Employ employ = employDaoImpl.searchEmployDao(empno);
		    ModelAndView model = new ModelAndView("employsearchform");
		    model.addObject("employ", employ);
		 
		    return model;
		}
	 
	 @RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	 public ModelAndView saveEmploy(@ModelAttribute Employ employ) {
	     employDaoImpl.addEmployDao(employ);
	     return new ModelAndView("redirect:/");
	 }

	 @RequestMapping(value = "/updateemploy", method = RequestMethod.POST)
	 public ModelAndView updateEmploy(@ModelAttribute Employ employ) {
	     employDaoImpl.updateEmployDao(employ);
	     return new ModelAndView("redirect:/");
	 }
	 
	 @RequestMapping(value = "/newemploy", method = RequestMethod.GET)
	 public ModelAndView newContact(ModelAndView model) {
	     Employ employ = new Employ();
	     model.addObject("employ", employ);
	     model.setViewName("employform");
	     return model;
	 }

	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = employDaoImpl.showEmployDao();
		return new ModelAndView("home","employList",employList);
	}
}
