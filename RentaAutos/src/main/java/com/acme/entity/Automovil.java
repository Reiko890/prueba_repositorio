package com.acme.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="automovil")
public class Automovil {
	
	@Id
	@GeneratedValue
	@Column(name="id_automovil")
	private int id;
	
	@Column(name="nombre",  nullable = false)
	private String nombre;
	
	@Column(name="marca",  nullable = false)
	private String marca;
	
	@Column(name="anio",  nullable = false)
	private int anio;
	
	@Column(name="precio", nullable = false)
	private double precio;
	
	@Column(name="descripcion",  nullable = false)
	private String descripcion;
	
	@Column(name="estatus",  nullable = false)
	private boolean estatus;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	Usuario usuario;
	
	public Automovil() {
		// TODO Auto-generated constructor stub
	}



	public Automovil(String nombre, String marca, int anio, double precio, String descripcion,
			boolean estatus) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.anio = anio;
		this.precio = precio;
		this.descripcion = descripcion;
		this.estatus = estatus;
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



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getAnio() {
		return anio;
	}



	public void setAnio(int anio) {
		this.anio = anio;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public boolean isEstatus() {
		return estatus;
	}



	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Automovil [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", anio=" + anio + ", precio="
				+ precio + ", descripcion=" + descripcion + ", disponibilidad=" + estatus + "]";
	}
	
	
	
	

}
