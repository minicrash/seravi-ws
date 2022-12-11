package com.seraviws.mapper;

import com.seraviws.dto.DetalleServicioDTO;
import com.seraviws.entity.DetalleServicio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

import java.util.List;


@Mapper(uses = BaseMapper.class)
public interface DetalleServicioMapperInterface {

	DetalleServicioMapperInterface MAPPER = Mappers.getMapper(DetalleServicioMapperInterface.class);

	@Mappings({ @Mapping(target = "dataAlta", dateFormat = "dd/MM/yyyy"),
			@Mapping(target = "dataModificacion", dateFormat = "dd/MM/yyyy") })
	DetalleServicioDTO toDetalleServicioDTO(DetalleServicio detalleServicioVO);

	@Mappings({ @Mapping(target = "dataAlta", dateFormat = "dd/MM/yyyy"),
			@Mapping(target = "dataModificacion", dateFormat = "dd/MM/yyyy") })
	List<DetalleServicioDTO> toListDetalleServicioDTO(List<DetalleServicio> detallesServicioVO);
/*
	@Mappings({ @Mapping(target = "dataAlta", dateFormat = "dd/MM/yyyy"),
			@Mapping(target = "dataModificacion", dateFormat = "dd/MM/yyyy") })
	Page<DetalleServicioDTO> toPageDetalleServicioDTO(Page<DetalleServicio> detallesServicioVO);
*/
}
