package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

//@Controller
@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home.jsp";
//	}
	
	@PostMapping(path="/alien", consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
//	@GetMapping(path="/aliens", produces= {"application/xml"})
	@GetMapping(path="/aliens")
//	@ResponseBody
	public List<Alien> getAliens() {
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		System.out.println(repo.findByTech("Java"));
//		System.out.println(repo.findByAidGreaterThan(102));
//		System.out.println(repo.findByTechSorted("Java"));
//		mv.addObject(alien);
//		return mv;
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
//	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
}
