package com.acme.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.acme.repository.IAutomovilRepository;
import com.acme.repository.IPersonaRepository;
import com.acme.repository.IUsuarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {

	@Autowired
	IUsuarioRepository iUsuarioRepository;

	@Autowired
	IPersonaRepository iPersonaRepository;
	
	@Autowired
	IAutomovilRepository iAutomovilRepository;

	@Test
	public void prueba() {
		
		//se agrega usuario
		Usuario usuario = new Usuario("Yo", "Probandi", "yo.probando@test.com", "1234");
		iUsuarioRepository.save(usuario);

		try {
			//se agrega persona
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse("27/12/1991");
			// Long cel = new Long("55345689890");
			// Long tel = new Long("0559834567501");
			Persona persona = new Persona("Yonni", "Perez Perez", "Masculino", date, 55345689890L, 559834567501L);
			iPersonaRepository.save(persona);
			System.out.println("hooola: " + persona.toString());

			usuario.setPersona(persona);
			iUsuarioRepository.save(usuario);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("shit");
			e.printStackTrace();
		}
		
		//se agrega automovil
		Automovil automovil = new Automovil("Camaro", "Chevrolet", 1970, 370500.00, 
				"Auto clasico en perfectas condiciones", true);
		automovil.setUsuario(usuario);
		
		//List<Automovil> automoviles = new ArrayList<>();
		//automoviles.add(automovil);
		//usuario.setAutomoviles(automoviles);
		
		iAutomovilRepository.save(automovil);
		
		
		Automovil automovil2 = new Automovil("Mustang", "Ford", 1972, 470500.00, 
				"Auto clasico en perfectas condiciones", true);
		automovil2.setUsuario(usuario);
		iAutomovilRepository.save(automovil2);
		
		
		//iUsuarioRepository.save(usuario);

	}

}
