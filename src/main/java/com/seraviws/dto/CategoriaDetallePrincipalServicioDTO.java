package com.seraviws.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CategoriaDetallePrincipalServicioDTO {

	private Long codigo;
	private String nome;
	private List<DetalleServicioDTO> servicios;

}
