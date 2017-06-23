package com.acme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.entity.Persona;
import com.acme.repository.IPersonaRepository;

@Service("personaServiceImp")
public class PersonaServiceImp implements IPersonaService {
	
	@Autowired
	IPersonaRepository iPersonaRepository;

	@Override
	public Persona agregarPersona(Persona persona) {
		Persona persona1= iPersonaRepository.save(persona);
		 return persona1;
	}

	@Override
	public List<Persona> listaTodasPersonas() {
		List<Persona> personas = iPersonaRepository.findAll();
		return personas;
	}

	@Override
	public Persona encontrarPersonaById(int id) {
		Persona personas = iPersonaRepository.findById(id);
		 return personas;
	}

	@Override
	public void eliminarPersona(int id) {
		Persona persona=encontrarPersonaById(id);
		//si no ha encontrado el contacto en la bd
		if(persona != null){
			iPersonaRepository.delete(persona);
		}
		
	}
	

	

}
