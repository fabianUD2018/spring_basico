package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.daos.AlienDAO;
import com.example.demo.pojos.Alien;




@Controller
public class IndexController {

	@Autowired
	AlienDAO alien;
	
	@RequestMapping("index")
	public String index(String name, HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println("funciono");
		session.setAttribute("alist", alien.findAll());
		return "Index.jsp";
	}
	
	@RequestMapping("index2")
	public ModelAndView index2(String name) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("Index.jsp");
		return mv;
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien a) {
		alien.save(a);
		return "Index.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam ("id") String id) {
		
		ModelAndView mv = new ModelAndView("Alien.jsp");
		mv.addObject("alien", alien.findById(Integer.parseInt(id)).orElse(null));
		return mv;
	}
	
}
