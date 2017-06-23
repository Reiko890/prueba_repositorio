package com.acme.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue
	@Column(name="id_persona", unique = true, nullable = false)
	private int id;
	
	@Column(name="nombre", nullable = false)
	private String nombre;
	
	@Column(name="apellidop", nullable = false)
	private String apellidoP;
	
	@Column(name="sexo", nullable = false)
	private String sexo;
	
	@Column(name="fechanac", nullable = false)
	private Date fechanac;
	
	@Column(name="celular", nullable = false)
	private long celular;
	
	@Column(name="telfijo")
	private long telFijo;
	
	@JsonIgnore
	@OneToOne(mappedBy="persona",  fetch = FetchType.LAZY)
	private Usuario usuario;
	
	
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(String nombre, String apellidoP, String sexo, Date fechanac, long celular, long telFijo) {
		super();
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.sexo = sexo;
		this.fechanac = fechanac;
		this.celular = celular;
		this.telFijo = telFijo;
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




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public Date getFechanac() {
		return fechanac;
	}




	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}




	public long getCelular() {
		return celular;
	}




	public void setCelular(long celular) {
		this.celular = celular;
	}




	public long getTelFijo() {
		return telFijo;
	}




	public void setTelFijo(long telFijo) {
		this.telFijo = telFijo;
	}
	
	


	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", sexo=" + sexo
				+ ", fechanac=" + fechanac + ", celular=" + celular + ", telFijo=" + telFijo + "]";
	}
	
	
	
	
	

}
