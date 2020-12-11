package br.com.java.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.java.entity.Contato;

@Repository
public interface ContatoRepository extends CrudRepository<Contato, Integer>{

	List<Contato> findByNome(String nome);

//	List<Contato> findAll(String contato);
	
//	List<Contato> buscarPorNome(String nome);
//	List<Contato> findByNameContaining(String term);
//	public ArrayList<Contato> findByName(String name);
//	@Query("SELECT p FROM tb_contatos p WHERE p.nome LIKE %?1%")
//    public List<Contato> findByName (String nome);
//    public List<Contato> search(
//			@Param("nome") String nome);

}
