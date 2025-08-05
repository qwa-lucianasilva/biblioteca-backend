package br.com.qwa.biblioteca.domain.models;

import java.time.LocalDate;

public class SegestaoAquisicao {
    private String tituloSugerido;
    private String autor;
    private String justificativa;
    private LocalDate dataSugestao;
    private String status; // Enum ?
}
