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
public class Alerta {
    // tipo alerta    @Id
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private boolean ativo;
    private LocalDate criadoEm;
}
