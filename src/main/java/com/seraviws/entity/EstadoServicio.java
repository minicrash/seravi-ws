package com.seraviws.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "estado_servicio")
public class EstadoServicio implements Serializable {

	@Id
	@Column(name = "codigo")
	private Long codigo;
	@Column(name = "nome")
	private String nome;
	@Column(name = "borrado")
	private Boolean borrado;

}
