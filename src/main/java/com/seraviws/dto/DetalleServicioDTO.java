package com.seraviws.dto;

import com.seraviws.entity.DetalleServicio;
import com.seraviws.mapper.CategoriaServicioMapper;
import com.seraviws.mapper.EstadoServicioMapper;
import com.seraviws.mapper.UsuarioMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DetalleServicioDTO implements Serializable {

	private Long codigo;
	private String titulo;
	private String descricion;
	private List<String> imagenes;
	private String precio;
	private EstadoServicioDTO estadoServicio;
	private UsuarioDTO usuario;
	private CategoriaServicioDTO categoriaServicio;
	private String dataAlta;
	private String dataModificacion;

//TODO buscar alternativa para a paginacion
	public static DetalleServicioDTO entityToDTO (DetalleServicio detalleServicio) {
		final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return DetalleServicioDTO.builder()
		.codigo(detalleServicio.getCodigo())
		.titulo(detalleServicio.getTitulo())
		.descricion(detalleServicio.getDescricion())
		.imagenes(Arrays.stream(detalleServicio.getImagenes().split(";")).toList())
		.precio(detalleServicio.getPrecio().toString())
		.estadoServicio(EstadoServicioMapper.mapToEstadoServicioDTO(detalleServicio.getEstadoServicio()))
		.usuario(UsuarioMapper.mapToUsuarioDTO(detalleServicio.getUsuario()))
		.categoriaServicio(CategoriaServicioMapper.mapToCategoriaServicioDTO(detalleServicio.getCategoriaServicio()))
		.dataAlta(format.format(detalleServicio.getDataAlta()))
		.dataModificacion(format.format(detalleServicio.getDataModificacion())).build();
	}

}
