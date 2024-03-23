package com.ddd.escola.object.value;

import com.ddd.escola.entity.Aluno;
import com.ddd.escola.entity.Professor;

import lombok.Data;

@Data
public class Comentario {

	private String texto;
    private Aluno autorAluno;
    private Professor autorProfessor;    
    
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Aluno getAutorAluno() {
		return autorAluno;
	}

	public void setAutorAluno(Aluno autorAluno) {
		this.autorAluno = autorAluno;
	}

	public Professor getAutorProfessor() {
		return autorProfessor;
	}

	public void setAutorProfessor(Professor autorProfessor) {
		this.autorProfessor = autorProfessor;
	}

	public Comentario(String texto, Aluno autorAluno, Professor autorProfessor) {
		super();
		this.texto = texto;
		this.autorAluno = autorAluno;
		this.autorProfessor = autorProfessor;
	}
    
    
}
