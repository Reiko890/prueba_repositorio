package com.acme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioAdmin")
public class UsuarioAdmin {

	@Id
	@GeneratedValue
	@Column(name = "id_usuarioAdmin")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "contrasnia")
	private String contrasenia;

	
	
	public UsuarioAdmin() {
		// TODO Auto-generated constructor stub
	}



	public UsuarioAdmin(String nombre, String contrasenia) {
		super();
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getContrasenia() {
		return contrasenia;
	}



	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}



	@Override
	public String toString() {
		return "UsuarioAdmin [id=" + id + ", nombre=" + nombre + ", contrasenia=" + contrasenia + "]";
	}
	
	
	
	

}
