package com.example.demo.daos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.Concesionario;

//@Repository
public interface ConcesionarioDao extends JpaRepository< Concesionario , Integer> {

}
