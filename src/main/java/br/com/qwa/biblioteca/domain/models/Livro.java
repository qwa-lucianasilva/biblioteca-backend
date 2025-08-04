package br.com.qwa.biblioteca.domain.models;

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    private String descricao;
    private String edicao;
    private LocalDate anoPublicacao;
    private boolean disponivel;
    private LocalDate dataCadastro;
}
