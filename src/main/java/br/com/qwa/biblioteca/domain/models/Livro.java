package br.com.qwa.biblioteca.domain.models;

import br.com.qwa.biblioteca.enums.EstadoDoLivroEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Table
@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

//    private Emprestimo emprestimo;
    private String titulo;
    private String autor;
    private String descricao;
    private String edicao;
    private LocalDate anoPublicacao;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private EstadoDoLivroEnum estado;
}
