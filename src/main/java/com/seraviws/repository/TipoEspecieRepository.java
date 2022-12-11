package com.seraviws.repository;

import com.seraviws.entity.TipoEspecie;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoEspecieRepository extends JpaRepository<TipoEspecie,Long> {

	List<TipoEspecie> findByBorradoFalse(Sort sort);

}
