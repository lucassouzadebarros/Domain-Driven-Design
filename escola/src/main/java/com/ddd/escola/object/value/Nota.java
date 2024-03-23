package com.ddd.escola.object.value;

import lombok.Data;

@Data
public class Nota {

	private double valor;
	private String observacao;
	 
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Nota(double valor, String observacao) {
		super();
		this.valor = valor;
		this.observacao = observacao;
	}
	
	
	 
	 
}
