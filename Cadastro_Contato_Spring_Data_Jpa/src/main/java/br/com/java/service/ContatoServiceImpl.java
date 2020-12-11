package br.com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.java.entity.Contato;
import br.com.java.repository.ContatoRepository;

@Service
@Transactional
public class ContatoServiceImpl implements ContatoService{
	
	
	private ContatoRepository contatoRepository;
	
	
	@Autowired
	public void setContatoRepository(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}

	@Override
	
	public Iterable<Contato> findAll() {
		// TODO Auto-generated method stub
		return contatoRepository.findAll();
	}

//	@Transactional
	public List<Contato> search(String nome) {
		// TODO Auto-generated method stub
		return contatoRepository.findByNome(nome);
	    }

	 @Override
//	 @Transactional
	    public Optional<Contato> findOne(Integer id) {
	        return contatoRepository.findById(id);
	    }

	@Override
//	@Transactional
	public void save(Contato contato) {
		// TODO Auto-generated method stub
		contatoRepository.save(contato);
		
	}

	@Override
//	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		contatoRepository.deleteById(id);
		
	}

}
