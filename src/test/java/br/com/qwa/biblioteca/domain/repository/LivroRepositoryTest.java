package br.com.qwa.biblioteca.domain.repository;

import br.com.qwa.biblioteca.domain.model.Emprestimo;
import br.com.qwa.biblioteca.domain.model.Livro;
import br.com.qwa.biblioteca.enums.EstadoDoLivroEnum;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class LivroRepositoryTest {

    @Inject
    private LivroRepository repository;

    @Inject
    private TestEntityManager testEntityManager;

    private Livro criarLivroExemplo() {
        return new Livro(
                "O Hobbit",
                "J.R.R. Tolkien",
                "Uma aventura inesperada...",
                "1ª Edição",
                LocalDate.of(1937, 9, 21),
                true,
                LocalDate.now(),
                EstadoDoLivroEnum.DISPONIVEL
        );
    }
    @Test
    @DisplayName("Deve salvar um livro sem emprestimo associado")
    void deveSalvarUmLivroSemEmprestimo() {
        // Arrange
        Livro novoLivro = criarLivroExemplo();

        // Act
        Livro livroSalvo = repository.save(novoLivro);

        // Assert
        assertThat(livroSalvo).isNotNull();
        assertThat(livroSalvo.getId()).isNotNull();
        assertThat(livroSalvo.getTitulo()).isEqualTo("O Hobbit");
        assertThat(livroSalvo.getEmprestimo()).isNull(); // Verificamos que o empréstimo é nulo
    }
}
