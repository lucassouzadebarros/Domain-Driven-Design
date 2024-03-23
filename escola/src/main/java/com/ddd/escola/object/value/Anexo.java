package com.ddd.escola.object.value;

import lombok.Data;

@Data
public class Anexo {

	private String nomeArquivo;
    private byte[] dados;    
    
	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public byte[] getDados() {
		return dados;
	}

	public void setDados(byte[] dados) {
		this.dados = dados;
	}

	public Anexo(String nomeArquivo, byte[] dados) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.dados = dados;
	}
    
    
}
