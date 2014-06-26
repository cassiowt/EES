package com.cawt.managetbeans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class AcessoUsuario {

	private String nomeUsuario;
	private String senha;
	private boolean cadastroAtivo;
	private boolean apresentaLogin;
	private boolean ativaLogin;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isApresentaLogin() {
		return apresentaLogin;
	}

	public void setAtivaLogin() {
		this.apresentaLogin = true;
		System.out.println("ATIVOU" + this.apresentaLogin);
		addMessage("Apresenta login " + this.apresentaLogin + " !");
	}

	public boolean isCadastroAtivo() {
		return cadastroAtivo;
	}

	public void setCadastroAtivo(boolean cadastroAtivo) {
		this.cadastroAtivo = cadastroAtivo;
	}

	public boolean isAtivaLogin() {
		return ativaLogin;
	}

	public void mostraLogin() {
		this.apresentaLogin = true;
		System.out.println("Apresenta login " + this.apresentaLogin);
	}

	public void mostraCadastro() {
		if (this.getNomeUsuario().equals("admin") && this.getSenha().equals("123456")) {
			this.cadastroAtivo = true;
			System.out.println("Sucesso " + cadastroAtivo);
		} else {
			this.cadastroAtivo = false;
			System.out.println("ERRO " + cadastroAtivo);
		}
	}

	private void addMessage(String message) {
		FacesMessage msg = new FacesMessage(message);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
