package com.taobao.roadrantz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class ListController {
	@RequestMapping("/list")
	public String getList(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response, Model model) {
		List<String> ls = new ArrayList<String>();
		ls.add("Chang Lei");
		ls.add("Wei Jingjing");
		ls.add("Yi Peng");
		model.addAttribute("name", name);
		model.addAttribute("ls", ls);
		
		return "jsp/list";
	}
}
