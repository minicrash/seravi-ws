package com.seraviws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CategoriaServicioDTO implements Serializable {

	private Long codigo;
	private String nome;
	private Boolean borrado;

}
