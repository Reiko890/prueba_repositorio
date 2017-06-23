package com.acme.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.acme.entity.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioServiceTest {
	
	@Autowired
	@Qualifier("usuarioServiceImp")
	IusuarioService usuarioService;
	
	@Test
	public void pruebaz(){
		Usuario usuario = new Usuario("Perdedor", "De ley", "ganon.deLaLey@test.com", "44561");
		Usuario usuarioAgregado = usuarioService.agregarUsuario(usuario);
		System.out.println("usuarioagregado: " + usuarioAgregado);
		
		
		List<Usuario> usuariosRegistrados = usuarioService.listaTodosUsuarios();
		
		for(Usuario usu : usuariosRegistrados){
			System.out.println("\nusuario: " + usu.toString() );
		}
		
		
		
		
		
	}
	
}
