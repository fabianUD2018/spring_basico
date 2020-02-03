package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.UsuarioDAO;
import com.example.demo.pojos.Usuario;

@RestController
public class UsuarioController {
	@Autowired
	UsuarioDAO dao;
	@CrossOrigin()
	@RequestMapping("/usuarios")
	public List <Usuario> getUsers () {
		return dao.findAll();
	}


	@PostMapping("/addUser") 
	public Usuario addUser (@RequestBody Usuario user) {
		dao.save(user);
		return user;
	}
}