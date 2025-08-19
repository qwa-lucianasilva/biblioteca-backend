package br.com.qwa.biblioteca.domain.repository;

import br.com.qwa.biblioteca.domain.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
    Livro findByTitulo(String titulo);
}
