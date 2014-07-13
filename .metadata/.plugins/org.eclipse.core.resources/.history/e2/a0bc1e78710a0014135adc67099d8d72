package com.taobao.roadrantz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping(value = {"/", "index", "index.html"})
public class HomeController {	
	@RequestMapping
	public ModelAndView getHome(HttpServletRequest request, HttpServletResponse response) {
		List<String> ls = new ArrayList<String>();
		ls.add("Chang Lei");
		ls.add("Wei Jingjing");
		ls.add("Yi Peng");
		
		return new ModelAndView("index", "ls", ls);
	}
}