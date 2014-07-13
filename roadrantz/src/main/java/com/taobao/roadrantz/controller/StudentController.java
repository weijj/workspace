package com.taobao.roadrantz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.taobao.roadrantz.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping(method=RequestMethod.GET, params = "register")
	public String getRegister(Model model) {
		model.addAttribute(new Student());
		return "jsp/register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String handleRegister(@Valid Student student, BindingResult bindingResult, HttpSession session) {
		if (bindingResult.hasErrors()) {
			return "jsp/register";
		}
		
		session.setAttribute("student", student);
		
		return "redirect:/student/info";
	}
	
	@RequestMapping(method=RequestMethod.GET, value = {"/info"})
	public String getInfo(HttpSession session) {		
		return "/jsp/student";
	}
}
