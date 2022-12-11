package com.seraviws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UsuarioDTO implements Serializable {

	private Long codigo;
	private String nif;
	private String nombre;
	private String apellidos;
	private String sexo;
	private Date fechaNacimiento;
	private String direccion;
	private String gps;
	private String telefono;
	private String email;
	private Date dataAlta;
	private Date dataModificacion;
	private Boolean borrado;

}
