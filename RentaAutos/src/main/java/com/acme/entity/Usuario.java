package com.acme.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
//	uniqueConstraints = {@UniqueConstraint(columnNames = {"email"}),
//@UniqueConstraint(columnNames = {"apellidop"})}
@Entity
@Table(name="usuario"
	
		)
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="id_usuario" , unique = true, nullable = false)
	private int id;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="apellidop", nullable = false)
	private String apellidoP;
	
	@Column(name="email", unique = true, nullable = false)
	private String email;
	
	@Column(name="contrasenia", nullable = false)
	private String contrasenia;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private Persona persona;
	
	@JsonIgnore
	@OneToMany(mappedBy="usuario" ,cascade = CascadeType.ALL)
	List<Automovil> automoviles = new ArrayList<>();
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Usuario(String nombre, String apellidoP, String email, String contrasenia) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.email = email;
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


	public String getApellidoP() {
		return apellidoP;
	}


	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	public List<Automovil> getAutomoviles() {
		return automoviles;
	}


	public void setAutomoviles(List<Automovil> automoviles) {
		this.automoviles = automoviles;
	}
	
	public void setAutomovil(Automovil automovil) {
		automoviles.add(automovil);     
	}
	
	
	
	


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", email=" + email
				+ ", contrasenia=" + contrasenia + "]";
	}
	
	
	
	

}
