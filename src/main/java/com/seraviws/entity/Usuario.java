package com.seraviws.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "usuario_tienda")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	@Column(name = "nif")
	private String nif;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "sexo")
	private String sexo;
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "gps")
	private String gps;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "email")
	private String email;
	@Column(name = "data_alta")
	@CreationTimestamp
	private Date dataAlta;
	@Column(name = "data_modificacion")
	@UpdateTimestamp
	private Date dataModificacion;
	@Column(name = "borrado")
	private Boolean borrado;

}
