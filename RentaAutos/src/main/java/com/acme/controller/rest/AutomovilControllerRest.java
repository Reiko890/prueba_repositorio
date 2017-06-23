package com.acme.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.entity.Automovil;
import com.acme.service.IAutomovilService;

@RestController
public class AutomovilControllerRest {
	
	@Autowired
	@Qualifier("automovilServiceImp")
	IAutomovilService automovilService;
	
	//un consumidor no deberia poder ver 
	@GetMapping("/automoviles/{id}")
	public Automovil getAutomovil(@PathVariable("id") int id){
		Automovil automovil = automovilService.encontrarAutomovilById(id);
		return automovil;
	}
	
	/*
	@GetMapping(value="/usuarios")
	public List<Usuario> buscaTodosUsuarios(){
			return usuarioService.listaTodosUsuarios();
	}
	*/
	
	@DeleteMapping("/automoviles/{id}")
	public void eliminaAutomovil(@PathVariable("id") int id){
		automovilService.eliminarAutomovil(id);
	}
	
	
	@PostMapping("/automoviles")
	public Automovil agregaAutomovil(@RequestBody Automovil automovil){
		return automovilService.agregarAutomovil(automovil);
	}
	
	
	@PutMapping("/automoviles")
	public Automovil modificaAutomovil(@RequestBody Automovil automovil){
		return automovilService.agregarAutomovil(automovil);
	}

}
