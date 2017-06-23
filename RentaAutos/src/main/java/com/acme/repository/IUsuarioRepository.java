package com.acme.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acme.entity.Usuario;

@Transactional
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Serializable>{
	
	public abstract Usuario findById(int id);

}
