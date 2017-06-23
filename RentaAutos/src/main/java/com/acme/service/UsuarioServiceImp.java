package com.acme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.entity.Usuario;
import com.acme.repository.IUsuarioRepository;

@Service("usuarioServiceImp")
public class UsuarioServiceImp implements IusuarioService{
	
	@Autowired
	IUsuarioRepository iUsuarioRepository;
	

	@Override
	public Usuario agregarUsuario(Usuario usuario) {
		Usuario usuario1= iUsuarioRepository.save(usuario);
		 return usuario1;
	}

	@Override
	public List<Usuario> listaTodosUsuarios() {
			List<Usuario> usuarios = iUsuarioRepository.findAll();
		return usuarios;
	}

	@Override
	public Usuario encontrarUsuarioById(int id) {
		Usuario usuario = iUsuarioRepository.findById(id);
		 return usuario;
	}

	@Override
	public void eliminarUsuario(int id) {
		Usuario usuario=encontrarUsuarioById(id);
		//si no ha encontrado el contacto en la bd
		if(usuario != null){
			iUsuarioRepository.delete(usuario);
		}
		
	}

}
