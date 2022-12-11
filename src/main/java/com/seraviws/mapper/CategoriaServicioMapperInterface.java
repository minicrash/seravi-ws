package com.seraviws.mapper;


import com.seraviws.dto.CategoriaServicioDTO;
import com.seraviws.entity.CategoriaServicio;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(uses = BaseMapper.class)
public interface CategoriaServicioMapperInterface {

	CategoriaServicioMapperInterface MAPPER = Mappers.getMapper(CategoriaServicioMapperInterface.class);

	@Mappings({ })
	CategoriaServicio fromCategoriaServicioDTO(CategoriaServicioDTO categoriaServicioDTO);

	@Mappings({ })
	CategoriaServicioDTO toCategoriaServicioDTO(CategoriaServicio categoriaServicio);

	@Mappings({ })
	List<CategoriaServicioDTO> toCategoriaServicioDTO(List<CategoriaServicio> categoriasServicio);

}
