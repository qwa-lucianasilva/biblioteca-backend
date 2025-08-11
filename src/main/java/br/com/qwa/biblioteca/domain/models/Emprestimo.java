package br.com.qwa.biblioteca.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
//    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate devolucaoPrevista;
    private LocalDate dataDevolucao;
    private boolean ativo;
}
