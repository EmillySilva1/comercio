package com.itb.inf2hm.comercio.model;

public class Produto {
	
	private long id;
	public String nome;
	private String codigoBarras;
	private double preco;
	
	// public	: Acesso liberado para todas as classes
	// private	: Propriedade (atributo ou método) só pode ser acessado
	//			dentro da própria classe
	
	// Métodos Setter's e Getter's
	
	// Set : Atribui informação
	// Get : Recupera informação
	
	public void setId(Long id) {
		this.id = id;
	}
	public long getId() {
		return  id
	}
	
}