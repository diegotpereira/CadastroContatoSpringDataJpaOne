package br.com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.entity.Contato;
import br.com.java.repository.ContatoRepository;

@Service
public class ContatoServiceImpl implements ContatoService{
	
	@Autowired
	private ContatoRepository repo;

	@Override
	public Iterable<Contato> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Contato> search(String contato) {
		// TODO Auto-generated method stub
		return repo.buscarPorNome(contato);
	}

	@Override
	public Contato findOne(Integer id) {
		// TODO Auto-generated method stub
		Optional<Contato> contato = repo.findById(id);
		
		Contato cont = new Contato();
		return cont;
	}

	@Override
	public void save(Contato contato) {
		// TODO Auto-generated method stub
		repo.save(contato);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
