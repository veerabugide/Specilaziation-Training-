package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String dem()
	{
		return "index.jsp";
	}
	
	
	@RequestMapping("/print")
	public ModelAndView demo(@RequestParam("name") String name, ModelAndView mv)
	{

		mv.setViewName("welcome.jsp");
		mv.addObject("username",name);
//		mv.addObject("Des",designation);
		return mv;
	}

	@RequestMapping("/save")
	public ModelAndView empsave(ModelAndView mv, Employee emp)
	{

		mv.setViewName("welcome.jsp");
		mv.addObject("emp",emp);
		return mv;
	}

}
