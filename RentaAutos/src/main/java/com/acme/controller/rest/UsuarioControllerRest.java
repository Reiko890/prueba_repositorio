package com.acme.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.acme.entity.Usuario;
import com.acme.service.IusuarioService;

@RestController
public class UsuarioControllerRest {
	
	@Autowired
	@Qualifier("usuarioServiceImp")
	IusuarioService usuarioService;
	
		//un consumidor no deberia poder ver 
	@GetMapping("/usuarios/{id}")
	public Usuario getUsuraio(@PathVariable("id") int id){
		Usuario usuario = usuarioService.encontrarUsuarioById(id);
		return usuario;
	}
	
	/*
	@GetMapping(value="/usuarios")
	public List<Usuario> buscaTodosUsuarios(){
			return usuarioService.listaTodosUsuarios();
	}
	*/
	
	@DeleteMapping("/usuarios/{id}")
	public void eliminaUsuario(@PathVariable("id") int id){
			 usuarioService.eliminarUsuario(id);
	}
	
	
	@PostMapping("/usuarios")
	public Usuario agregaUsuario(@RequestBody Usuario usuario){
		return usuarioService.agregarUsuario(usuario);
	}
	
	
	@PutMapping("/usuarios")
	public Usuario modificaUsuario(@RequestBody Usuario usuario){
		return usuarioService.agregarUsuario(usuario);
	}
	
	
}
