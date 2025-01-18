package com.java.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@RequestMapping(value="/students")
	public ModelAndView showNames() {
		List<String> names = new ArrayList<String>();
		names.add("Dinesh");
		names.add("Aakash");
		names.add("Poojitha");
		names.add("Manjunath");
		names.add("Geethika");
		return new ModelAndView("show","names",names);
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest req) {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/logincheck")
	public ModelAndView logincheck(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Java") && pwd.equals("Java")) {
			return new ModelAndView("menu");
		}
		return new ModelAndView("login","error","Invalid Credentials...");
	}
	
	
	@RequestMapping(value="/calc")
	public ModelAndView calRes(HttpServletRequest req) {
		return new ModelAndView("calc");
	}
	
	@RequestMapping(value="/calcresult")
	public ModelAndView calInp(HttpServletRequest req) {
		int fno = Integer.parseInt(req.getParameter("firstNo"));
		int sno = Integer.parseInt(req.getParameter("secondNo"));
		int c = fno + sno;
		String res = "";
		res+=c;
		return new ModelAndView("result","res",res);
	}
	
	@RequestMapping(value="/result")
	public ModelAndView result(HttpServletRequest request) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
//		String fullName = firstName + " " +lastName;
		String fullName = firstName.concat(lastName);
		return new ModelAndView("result", "fullName", fullName);

	}
	
	public ModelAndView calc() {
		return new ModelAndView("calc");
	}
	@RequestMapping(value="/namepage")
	public ModelAndView show() {
		return new ModelAndView("namepage");
	}
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/anoop")
	public ModelAndView anoop() {
		return new ModelAndView("anoop");
	}
}
