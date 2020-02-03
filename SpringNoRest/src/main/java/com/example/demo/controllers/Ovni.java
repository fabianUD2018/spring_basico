package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.AlienDAO;
import com.example.demo.pojos.Alien;

@RestController
public class Ovni {
	@Autowired
	AlienDAO alienDAO;
	
	@RequestMapping("/alienes")
	@ResponseBody
	public List<Alien> getAliens() {
		return alienDAO.findAll();
	}
	
	@RequestMapping("/alien/{id}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("id") int id) {
		return alienDAO.findById(id);
	}
	
	@PostMapping("/alien")
	public Alien getAlien(@RequestBody Alien a) {
		alienDAO.save(a);
		return a;
	}
	
	@DeleteMapping("/alien/{id}")
	@ResponseBody
	public Alien delAlien(@PathVariable("id") int id) {
		Alien x = alienDAO.getOne(id);
		alienDAO.delete(x);
		return x;
	}
}
