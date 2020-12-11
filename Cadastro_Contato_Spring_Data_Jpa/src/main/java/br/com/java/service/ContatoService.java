package br.com.java.service;

import java.util.List;

import br.com.java.entity.Contato;

public interface ContatoService {
	
	Iterable<Contato> buscarTodos();
	
	List<Contato> buscar (String contato);
	
	Contato findOne(Integer id);
	
	void salvar(Contato contato);
	
	void delete (Integer id);
	

}
