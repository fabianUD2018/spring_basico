package com.example.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.Modelo;

public interface ModeloDAO  extends JpaRepository<Modelo, Integer>{

}
