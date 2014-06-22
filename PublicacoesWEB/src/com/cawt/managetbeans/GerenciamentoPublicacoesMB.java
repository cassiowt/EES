package com.cawt.managetbeans;

import java.io.Serializable;
import java.util.List;
 

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
 

import org.primefaces.event.RowEditEvent;
 

import com.cawt.ejbs.PublicacaoLocal;
import com.cawt.entities.Publicacao;
 
@Named
@SessionScoped
public class GerenciamentoPublicacoesMB implements Serializable {
    private static final long serialVersionUID = 1880935315548336037L;
 
    @Inject
    private PublicacaoLocal bean;
 
    private Publicacao publicacao;
 
    private List<Publicacao> publicacoes;
 
    @PostConstruct
    private void init() {
        publicacoes = (List<Publicacao>) bean.findAll();
        publicacao = new Publicacao();
    }
 
    public String cadastrar() {
        try {
            bean.persist(publicacao);
            publicacoes = (List<Publicacao>) bean.findAll();
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public String atualizar() {
        try {
            bean.merge(publicacao);
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
 
        return "";
    }
 
    public void excluir() {
        try {
            bean.remove(publicacao);
            publicacoes = (List<Publicacao>) bean.findAll();
        } catch (Exception e) {
            addMessage(e.getMessage());
        }
    }
 
    public void onEdit(RowEditEvent event) {
        publicacao = (Publicacao) event.getObject();
        atualizar();
        addMessage("Publicação " + publicacao.getTitulo()+ " atualizado!");
    }
 
    private void addMessage(String message) {
        FacesMessage msg = new FacesMessage(message);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public Publicacao getPublicacao() {
        return publicacao;
    }
 
    public void setPublicacao(Publicacao publiacao) {
        this.publicacao = publiacao;
    }
 
    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }
 
    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
