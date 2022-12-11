package com.seraviws.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Entity(name = "detalle_servicio")
public class DetalleServicio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "descricion")
	private String descricion;
	@Column(name = "imagenes")
	private String imagenes;
	@Column(name = "precio")
	private Integer precio;
	@JoinColumn(name = "codigo_estado_servicio")
	@OneToOne(fetch = FetchType.EAGER)
	private EstadoServicio estadoServicio;
	@JoinColumn(name = "codigo_usuario")
	@OneToOne(fetch = FetchType.EAGER)
	private Usuario usuario;
	@JoinColumn(name = "codigo_categoria_servicio")
	@OneToOne(fetch = FetchType.EAGER)
	private CategoriaServicio categoriaServicio;
	@Column(name = "data_alta")
	@CreationTimestamp
	private Date dataAlta;
	@Column(name = "data_modificacion")
	@UpdateTimestamp
	private Date dataModificacion;

}
