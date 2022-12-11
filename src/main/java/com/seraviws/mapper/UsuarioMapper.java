package com.seraviws.mapper;

import com.seraviws.dto.UsuarioDTO;
import com.seraviws.entity.Usuario;

public class UsuarioMapper {

	public static UsuarioDTO mapToUsuarioDTO(Usuario usuario) {
		return UsuarioMapperInterface.MAPPER.toUsuarioDTO(usuario);
	}

}