package com.ddd.escola.object.value;

import lombok.Data;

@Data
public class Endereco {

	private String rua;
    private int numero;
    private String cidade;
    private String pais;
    
	public Endereco(String rua, int numero, String cidade, String pais) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.pais = pais;
	}
    
    
}
