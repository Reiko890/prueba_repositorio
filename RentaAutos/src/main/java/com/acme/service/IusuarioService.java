package com.acme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acme.entity.Usuario;

public interface IusuarioService{
	
	public abstract Usuario agregarUsuario(Usuario usuario);

	public abstract List<Usuario> listaTodosUsuarios();
	
	public abstract Usuario encontrarUsuarioById(int id);
	
	public abstract void eliminarUsuario(int id);
	

}
