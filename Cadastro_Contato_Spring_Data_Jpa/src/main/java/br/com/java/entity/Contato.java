package br.com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tb_contatos")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private Integer id;
	
	@SuppressWarnings("deprecation")
	@NotEmpty
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@SuppressWarnings("deprecation")
	@Email
	@Column(name="email")
	private String email;
	
	@Column(name= "telefone")
	private String telefone;
	
	public Contato() {}

	public Contato(Integer id, @NotEmpty String nome, @Email String email, String telefone) {
//		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
