package br.com.qwa.biblioteca.domain.models;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate devolucaoPrevista;
    private LocalDate dataDevolucao;
    private boolean ativo;
}
