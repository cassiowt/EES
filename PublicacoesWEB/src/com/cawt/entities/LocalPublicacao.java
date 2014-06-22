package com.cawt.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOCAL_PUBLICACOES")
public class LocalPublicacao implements Serializable{

	private static final long serialVersionUID = 4583422486714693928L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeLocal;
	 
	private String cidade;
	 
	private String ufRegiao;
	 
	private String pais;
	 
	@Enumerated(EnumType.STRING)
	private TipoLocalPublicacao tipoLocalPublicacao;

	public LocalPublicacao() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUfRegiao() {
		return ufRegiao;
	}

	public void setUfRegiao(String ufRegiao) {
		this.ufRegiao = ufRegiao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public TipoLocalPublicacao getTipoLocalPublicacao() {
		return tipoLocalPublicacao;
	}

	public void setTipoLocalPublicacao(TipoLocalPublicacao tipoLocalPublicacao) {
		this.tipoLocalPublicacao = tipoLocalPublicacao;
	}

	public Long getId() {
		return id;
	}
	 
	
}
 
