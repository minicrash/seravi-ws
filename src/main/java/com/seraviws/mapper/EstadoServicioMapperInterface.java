package com.seraviws.mapper;

import com.seraviws.dto.EstadoServicioDTO;
import com.seraviws.entity.EstadoServicio;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(uses = BaseMapper.class)
public interface EstadoServicioMapperInterface {

	EstadoServicioMapperInterface MAPPER = Mappers.getMapper(EstadoServicioMapperInterface.class);

	@Mappings({ })
	EstadoServicioDTO toEstadoServicioDTO(EstadoServicio estadoServicio);

	@Mappings({ })
	List<EstadoServicioDTO> toEstadoServicioDTO(List<EstadoServicio> estadosServicio);

}
