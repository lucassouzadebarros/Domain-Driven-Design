package com.ddd.escola.Aggregate;

import java.util.List;

import com.ddd.escola.entity.Aluno;
import com.ddd.escola.entity.Professor;
import com.ddd.escola.object.value.Anexo;
import com.ddd.escola.object.value.Comentario;
import com.ddd.escola.object.value.Nota;

import lombok.Data;

@Data
public class Atividade {
	
	 private Long id;
	 private String nome;
	 private Professor professorResponsavel;
	 private Nota notas;
	 private List<Comentario> comentarios;
	 private Anexo anexos;
	 private Aluno aluno;
	 
	 
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
	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}
	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}
	public Nota getNotas() {
		return notas;
	}
	public void setNotas(Nota notas) {
		this.notas = notas;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public Anexo getAnexos() {
		return anexos;
	}
	public void setAnexos(Anexo anexos) {
		this.anexos = anexos;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	 
	 

}
