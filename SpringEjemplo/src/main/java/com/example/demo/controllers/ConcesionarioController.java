package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.ConcesionarioDao;
import com.example.demo.pojos.Concesionario;

@RestController
public class ConcesionarioController {
	
	@Autowired
	ConcesionarioDao dao;
	
	//@ResponseBody no se coloca porque se coloco restcontroller
	@PostMapping ("/addConc")	
	public Concesionario addConcesionario (@RequestParam Concesionario c) {
		dao.save(c);
		return c;
		
	}
	
	@GetMapping ("/lista")
	public List<Concesionario> getConcecionario() {
		
		return dao.findAll();
	}
}
