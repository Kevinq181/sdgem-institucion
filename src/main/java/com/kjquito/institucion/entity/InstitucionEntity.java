package com.kjquito.institucion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institucion")
public class InstitucionEntity implements Serializable {


	private static final long serialVersionUID = 2060556991765120486L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_institucion")
	private String nombreInstitucion;
	@Column(name = "rif")
	private String rif;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "contacto_organizacion")
	private String contactoOrganizacion;
	@Column(name = "telefono_contacto")
	private String telefonoContacto;
	@Column(name = "cargo_contacto")
	private String cargoContacto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContactoOrganizacion() {
		return contactoOrganizacion;
	}

	public void setContactoOrganizacion(String contactoOrganizacion) {
		this.contactoOrganizacion = contactoOrganizacion;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getCargoContacto() {
		return cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}
}
