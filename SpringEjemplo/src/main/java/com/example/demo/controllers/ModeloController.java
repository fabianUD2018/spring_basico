package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.ModeloDAO;
import com.example.demo.pojos.Modelo;

@RestController()

public class ModeloController {
	@Autowired
	ModeloDAO dao;
	@PostMapping("/addModelo")
	
	public Modelo addModelo(@RequestBody Modelo m) {
		dao.save(m);
		return m;
	}
	
	@GetMapping("/modelos")
	public List<Modelo> getModelos (){
		return dao.findAll();
	}
	
	@GetMapping ("/modelo/{id}")
	public Optional<Modelo> getModelo(@PathVariable int id){
		return dao.findById(id);
	}
}
