package br.com.qwa.biblioteca.enums;

public enum EstadoDoLivroEnum {
    DISPONIVEL("Disponível"), EMPRESTADO("Emprestado"), DANIFICADO("Danificado"), PERDIDO("Perdido");

    private String descricao;

    EstadoDoLivroEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
