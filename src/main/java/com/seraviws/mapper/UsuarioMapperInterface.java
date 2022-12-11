package com.seraviws.mapper;

import com.seraviws.dto.UsuarioDTO;
import com.seraviws.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = BaseMapper.class)
public interface UsuarioMapperInterface {

	UsuarioMapperInterface MAPPER = Mappers.getMapper(UsuarioMapperInterface.class);

	@Mappings({ })
	UsuarioDTO toUsuarioDTO(Usuario usuario);

}
