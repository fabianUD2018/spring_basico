package com.example.demo.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.Alien;

public interface AlienDAO extends JpaRepository<Alien, Integer>{

}
