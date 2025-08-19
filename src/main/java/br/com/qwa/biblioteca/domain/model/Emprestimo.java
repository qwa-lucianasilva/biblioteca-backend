package br.com.qwa.biblioteca.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

@Entity
@Table
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToMany(mappedBy="emprestimo")
    private Set<Livro> livros;
    private LocalDate dataEmprestimo;
    private LocalDate devolucaoPrevista;
    private LocalDate dataDevolucao;
    private boolean ativo;
}
