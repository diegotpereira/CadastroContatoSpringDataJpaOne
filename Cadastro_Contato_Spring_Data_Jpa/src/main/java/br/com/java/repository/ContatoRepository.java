package br.com.java.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.java.entity.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Integer>{
	
	List<Contato> buscarPorNome(String contato);

}
