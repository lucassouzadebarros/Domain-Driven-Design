package com.ddd.escola.entity;

import com.ddd.escola.object.value.Endereco;

import lombok.Data;

@Data
public class Professor {

	private Long id;
    private String nome;
    private String email;
    private Endereco endereco;    
    
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Professor(Long id, String nome, String email, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}    
    
}
