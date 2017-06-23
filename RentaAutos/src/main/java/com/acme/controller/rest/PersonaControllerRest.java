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

import com.acme.entity.Persona;
import com.acme.service.IPersonaService;

@RestController
public class PersonaControllerRest {
	
	
	@Autowired
	@Qualifier("personaServiceImp")
	IPersonaService personaService;
	
	@GetMapping("/personas/{id}")
	public Persona getUsuraio(@PathVariable("id") int id){
		Persona persona = personaService.encontrarPersonaById(id);
		return persona;
	}
	
	/*
	@GetMapping(value="/usuarios")
	public List<Usuario> buscaTodosUsuarios(){
			return usuarioService.listaTodosUsuarios();
	}
	*/
	
	@DeleteMapping("/personas/{id}")
	public void eliminaPersona(@PathVariable("id") int id){
		personaService.eliminarPersona(id);
	}
	
	
	@PostMapping("/personas")
	public Persona agregaPersona(@RequestBody Persona persona){
		return personaService.agregarPersona(persona);
	}
	
	
	@PutMapping("/personas")
	public Persona modificaPersona(@RequestBody Persona persona){
		return personaService.agregarPersona(persona);
	}

}
