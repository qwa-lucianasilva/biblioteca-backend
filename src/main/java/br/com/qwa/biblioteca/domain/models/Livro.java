package br.com.qwa.biblioteca.domain.models;

import br.com.qwa.biblioteca.enums.EstadoDoLivroEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Table
@Entity
public class Livro {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private String descricao;
    private String edicao;
    private LocalDate anoPublicacao;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private EstadoDoLivroEnum estado;
}
