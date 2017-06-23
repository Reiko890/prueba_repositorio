package com.acme.service;

import java.util.List;

import com.acme.entity.Automovil;

public interface IAutomovilService {
	
	public abstract Automovil agregarAutomovil(Automovil automovil);

	public abstract List<Automovil> listaTodosAutomoviles();
	
	public abstract Automovil encontrarAutomovilById(int id);
	
	public abstract void eliminarAutomovil(int id);

}
