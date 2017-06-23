package com.acme.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acme.entity.Automovil;

@Transactional
@Repository
public interface IAutomovilRepository extends JpaRepository<Automovil, Serializable>{
	
	public abstract Automovil findById(int id);

}
