package br.com.qwa.biblioteca.domain.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.UUID;

public class SegestaoAquisicao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String tituloSugerido;
    private String autor;
    private String justificativa;
    private LocalDate dataSugestao;
    private String status; // Enum ?
}
