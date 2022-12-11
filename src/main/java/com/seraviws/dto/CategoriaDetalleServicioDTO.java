package com.seraviws.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class CategoriaDetalleServicioDTO {

	private Long codigo;
	private String nome;
	private Page<DetalleServicioDTO> servicios;

}
