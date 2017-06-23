package com.acme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.entity.Automovil;
import com.acme.repository.IAutomovilRepository;

@Service("automovilServiceImp")
public class AutomovilServiceImp implements IAutomovilService{
	
	@Autowired
	IAutomovilRepository iAutomovilRepository;

	@Override
	public Automovil agregarAutomovil(Automovil automovil) {
		Automovil automovil1= iAutomovilRepository.save(automovil);
		 return automovil1;
	}

	@Override
	public List<Automovil> listaTodosAutomoviles() {
		List<Automovil> automoviles = iAutomovilRepository.findAll();
		return automoviles;
	}

	@Override
	public Automovil encontrarAutomovilById(int id) {
		Automovil automovil = iAutomovilRepository.findById(id);
		 return automovil;
	}

	@Override
	public void eliminarAutomovil(int id) {
		Automovil automovil=encontrarAutomovilById(id);
		//si no ha encontrado el contacto en la bd
		if(automovil != null){
			iAutomovilRepository.delete(automovil);
		}
		
	}

	
	

}
