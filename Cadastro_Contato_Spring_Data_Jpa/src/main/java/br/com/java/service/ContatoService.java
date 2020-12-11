package br.com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.java.entity.Contato;

//@Service
public interface ContatoService {
	
	Iterable<Contato> findAll();
	
	List<Contato> search (String nome);
	
	Optional<Contato> findOne(Integer id);
	
	void save(Contato contato);
	
	void delete (Integer id);
	

}
