package com.seraviws.mapper;


import com.seraviws.dto.DetalleServicioDTO;
import com.seraviws.entity.DetalleServicio;
import org.springframework.data.domain.Page;

import java.util.List;

public class DetalleServicioMapper {

	public static DetalleServicioDTO mapToDetalleServicioDTO(DetalleServicio detalleServicio) {
		return DetalleServicioMapperInterface.MAPPER.toDetalleServicioDTO(detalleServicio);
	}

	public static List<DetalleServicioDTO> mapToDetalleServicioListaxeDTO(List<DetalleServicio> detallesServicio) {
		if (!detallesServicio.isEmpty()) {
			return DetalleServicioMapperInterface.MAPPER.toListDetalleServicioDTO(detallesServicio);
		} else {
			return List.of();
		}
	}
/*
	public static Page<DetalleServicioDTO> mapToDetalleServicioPageDTO(Page<DetalleServicio> detallesServicio) {
		if (!detallesServicio.isEmpty()) {
			return DetalleServicioMapperInterface.MAPPER.toPageDetalleServicioDTO(detallesServicio);
		} else {
			return Page.empty();
		}
	}
*/
}