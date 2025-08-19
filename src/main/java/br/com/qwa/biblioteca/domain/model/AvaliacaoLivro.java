package br.com.qwa.biblioteca.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class AvaliacaoLivro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String comentario;
    private int classificacao;
    private String dificuldade;
    private boolean desistiu;
    private LocalDate dataAvaliacao;
}
