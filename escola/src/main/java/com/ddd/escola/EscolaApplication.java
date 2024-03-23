package com.ddd.escola;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ddd.escola.Aggregate.Atividade;
import com.ddd.escola.entity.Aluno;
import com.ddd.escola.entity.Professor;
import com.ddd.escola.object.value.Anexo;
import com.ddd.escola.object.value.Comentario;
import com.ddd.escola.object.value.Endereco;
import com.ddd.escola.object.value.Nota;

@SpringBootApplication
public class EscolaApplication {

	public static void main(String[] args) {		
		
	        // Criando um endereço para o aluno e professor
	        Endereco enderecoAluno = new Endereco("Rua A", 123, "Cidade X", "País Y");
	        Endereco enderecoProfessor = new Endereco("Rua B", 456, "Cidade Z", "País W");
	        
	        // Criando aluno e professor
	        Aluno aluno = new Aluno(1L, "João", "joao@example.com", enderecoAluno);
	        Professor professor = new Professor(1L, "Maria", "maria@example.com", enderecoProfessor);
	        
	        // Criando uma atividade
	        Atividade atividade = new Atividade();
	        atividade.setId(1L);
	        atividade.setNome("Atividade 1");
	        atividade.setProfessorResponsavel(professor);
	        atividade.setAluno(aluno);
	        
	        // Adicionando uma nota à atividade
	        Nota nota = new Nota(8.5, "Boa apresentação");
	        atividade.setNotas(nota);
	        
	        // Adicionando comentários à atividade
	        Comentario comentario1 = new Comentario("Bom trabalho!", null, professor);
	        Comentario comentario2 = new Comentario("Obrigado!", aluno, null);
	        List<Comentario> comentarios = new ArrayList<>();
	        comentarios.add(comentario1);
	        comentarios.add(comentario2);
	        atividade.setComentarios(comentarios);
	        
	        // Adicionando um anexo à atividade
	        Anexo anexo = new Anexo("Documento.pdf", new byte[]{1, 0, 1, 0, 1});
	        atividade.setAnexos(anexo);
	        
	        // Exibindo informações da atividade
	        System.out.println("Atividade: " + atividade.getNome());
	        System.out.println("Professor Responsável: " + atividade.getProfessorResponsavel().getNome());
	        System.out.println("Aluno: " + atividade.getAluno().getNome());
	        System.out.println("Nota: " + atividade.getNotas().getValor() + " - " + atividade.getNotas().getObservacao());
	        System.out.println("Comentários:");
	        for (Comentario comentario : atividade.getComentarios()) {
	            if (comentario.getAutorAluno() != null) {
	                System.out.println("- Aluno " + comentario.getAutorAluno().getNome() + ": " + comentario.getTexto());
	            } else {
	                System.out.println("- Professor " + comentario.getAutorProfessor().getNome() + ": " + comentario.getTexto());
	            }
	        }
	        System.out.println("Anexo: " + atividade.getAnexos().getNomeArquivo());
	    
	}

}
