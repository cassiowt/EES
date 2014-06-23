package com.cawt.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Monografia extends Publicacao implements Serializable {
 
	private static final long serialVersionUID = -4860299879411454715L;

	private String editora;
	 
	private String descricaoFisica;
	 
	private String ilustracao;
	 
	private String dimensao;
	 
	private String edicao;
	 
	private String serie;
	 
	private String notasEspeciais;
	 
	private String isbn;

	@Enumerated(EnumType.STRING)
	private TiposMonografias tiposMonografias;

	public Monografia() {
		// TODO Auto-generated constructor stub
	}
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDescricaoFisica() {
		return descricaoFisica;
	}

	public void setDescricaoFisica(String descricaoFisica) {
		this.descricaoFisica = descricaoFisica;
	}

	public String getIlustracao() {
		return ilustracao;
	}

	public void setIlustracao(String ilustracao) {
		this.ilustracao = ilustracao;
	}

	public String getDimensao() {
		return dimensao;
	}

	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNotasEspeciais() {
		return notasEspeciais;
	}

	public void setNotasEspeciais(String notasEspeciais) {
		this.notasEspeciais = notasEspeciais;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public TiposMonografias getTiposMonografias() {
		return tiposMonografias;
	}

	public void setTiposMonografias(TiposMonografias tiposMonografias) {
		this.tiposMonografias = tiposMonografias;
	}
	
	
}
 
