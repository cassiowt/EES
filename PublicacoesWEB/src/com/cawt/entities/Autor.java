package com.cawt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTORES")
public class Autor {
	@Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Long id;	
   	private String nome;
	private String email;
	private String instituicao;

	public Long getId() {
		return id;
	}
	
    public void setId(Long id) {
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

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}	
}
 
