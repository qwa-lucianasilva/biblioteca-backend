package br.com.qwa.biblioteca.domain.model;

import br.com.qwa.biblioteca.enums.EstadoDoLivroEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Table
@Entity
@Getter
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name="emprestimo_id")
    private Emprestimo emprestimo;
    private String titulo;
    private String autor;
    private String descricao;
    private String edicao;
    private LocalDate anoPublicacao;
    private boolean disponivel;
    private LocalDate dataCadastro;
    @Enumerated(EnumType.STRING)
    private EstadoDoLivroEnum estado;

    public Livro(String titulo, String autor, String descricao, String edicao, LocalDate anoPublicacao, boolean disponivel, LocalDate dataCadastro, EstadoDoLivroEnum estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.descricao = descricao;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
        this.estado = estado;
    }
}
