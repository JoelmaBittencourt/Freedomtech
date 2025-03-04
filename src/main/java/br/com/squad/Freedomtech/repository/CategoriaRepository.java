package br.com.squad.Freedomtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.squad.Freedomtech.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(String categoria);
	
}
