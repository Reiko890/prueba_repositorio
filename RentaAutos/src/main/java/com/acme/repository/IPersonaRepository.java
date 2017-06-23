package com.acme.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acme.entity.Persona;

@Transactional
@Repository
public interface IPersonaRepository  extends JpaRepository <Persona, Serializable>{
	
	public abstract Persona findById(int id);

}
