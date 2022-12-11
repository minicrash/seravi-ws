package com.seraviws.mapper;

import com.seraviws.dto.EstadoServicioDTO;
import com.seraviws.entity.EstadoServicio;

import java.util.List;

public class EstadoServicioMapper {

	public static EstadoServicioDTO mapToEstadoServicioDTO(EstadoServicio estadoServicio) {
		return EstadoServicioMapperInterface.MAPPER.toEstadoServicioDTO(estadoServicio);
	}

	public static List<EstadoServicioDTO> mapToEstadoServicioListaxeDTO(List<EstadoServicio> estadosServicio) {
		if (!estadosServicio.isEmpty()) {
			return EstadoServicioMapperInterface.MAPPER.toEstadoServicioDTO(estadosServicio);
		} else {
			return List.of();
		}
	}
}