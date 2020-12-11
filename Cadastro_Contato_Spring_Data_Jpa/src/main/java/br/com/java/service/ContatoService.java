package br.com.java.service;

import java.util.List;

import br.com.java.entity.Contato;

public interface ContatoService {
	
	Iterable<Contato> findAll();
	
	List<Contato> search (String contato);
	
	Contato findOne(Integer id);
	
	void save(Contato contato);
	
	void delete (Integer id);
	

}
