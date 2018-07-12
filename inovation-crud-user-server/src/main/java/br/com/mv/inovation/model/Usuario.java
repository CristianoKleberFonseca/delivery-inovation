package br.com.mv.inovation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(updatable = false, nullable = false)
	private String login;

	@Size(min = 0, max = 50)
	private String senha;

	@Size(min = 0, max = 100)
	private String nome;

	@Email
	@Size(min = 0, max = 50)
	private String email;

	public Usuario() {
		
	}
	
	public Usuario(String login, @Size(min = 0, max = 50) String senha, @Size(min = 0, max = 100) String nome,
			@Email @Size(min = 0, max = 50) String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
}
