package com.acme.service;

import java.util.List;

import com.acme.entity.Persona;

public interface IPersonaService {
	
	public abstract Persona agregarPersona(Persona persona);

	public abstract List<Persona> listaTodasPersonas();
	
	public abstract Persona encontrarPersonaById(int id);
	
	public abstract void eliminarPersona(int id);

}
