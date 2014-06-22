package com.cawt.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AUTORES")
public class Autor implements Serializable{
 
	private static final long serialVersionUID = 7955947797334674206L;

	@Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;	
    
	private String nome;
	 
	private String email;
	 
	private String instituicao;

	public Autor() {
		// TODO Auto-generated constructor stub
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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	
	public Long getId() {
		return id;
	}

	
}
 
