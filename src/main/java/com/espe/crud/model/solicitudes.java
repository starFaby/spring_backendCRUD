package com.espe.crud.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "solicitudes")
public class solicitudes {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_solicitudes;
	
	@JsonProperty("nombre_solicitud")
    @NotBlank
    private String nombre;
	
	@JsonProperty("apellido_solicitud")
    @NotBlank
    private String apellido;
	
	@JsonProperty("destino_solicitud")
    @NotBlank
    private String destino;
	
	
	@JsonProperty("fecha_solicitud")

    private Date fecha_solicitud;


	public solicitudes() {
		
	}


	/**
	 * @return the id_solicitudes
	 */
	public Long getId_solicitudes() {
		return id_solicitudes;
	}


	/**
	 * @param id_solicitudes the id_solicitudes to set
	 */
	public void setId_solicitudes(Long id_solicitudes) {
		this.id_solicitudes = id_solicitudes;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}


	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}


	/**
	 * @return the fecha_solicitud
	 */
	public Date getFecha_solicitud() {
		return fecha_solicitud;
	}


	/**
	 * @param fecha_solicitud the fecha_solicitud to set
	 */
	public void setFecha_solicitud(Date fecha_solicitud) {
		this.fecha_solicitud = fecha_solicitud;
	}


	
	
	
	
	
	
	
	

}
