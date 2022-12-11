package com.seraviws.mapper;

import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.entity.CategoriaServicio;

import java.util.List;

public class CategoriaServicioMapper {

	public static CategoriaServicio mapFromCategoriaServicioDTO(CategoriaServicioDTO categoriaServicioDTO) {
		return CategoriaServicioMapperInterface.MAPPER.fromCategoriaServicioDTO(categoriaServicioDTO);
	}

	public static CategoriaServicioDTO mapToCategoriaServicioDTO(CategoriaServicio categoriaServicio) {
		return CategoriaServicioMapperInterface.MAPPER.toCategoriaServicioDTO(categoriaServicio);
	}

	public static List<CategoriaServicioDTO> mapToCategoriaServicioListaxeDTO(List<CategoriaServicio> categoriasServicio) {
		if (!categoriasServicio.isEmpty()) {
			return CategoriaServicioMapperInterface.MAPPER.toCategoriaServicioDTO(categoriasServicio);
		} else {
			return List.of();
		}
	}
}