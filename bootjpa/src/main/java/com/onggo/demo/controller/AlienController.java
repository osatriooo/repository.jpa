package com.onggo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.onggo.demo.dao.AlienRepo;
import com.onggo.demo.model.Alien;

@Controller
public class AlienController 
{
	@Autowired
	AlienRepo repo; 
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) 
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String  getAlien() 
	{
		
		
		
		
		return repo.findAll().toString();
		
	}
}
