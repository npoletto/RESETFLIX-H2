package br.com.cwi.resetflix.domain;

public enum Genero {
    ACAO("Ação"),
    AVENTURA ("Aventura"),
    COMEDIA ("Comédia"),
    DOCUMENTARIO( "Documentário"),
    DRAMA("Drama"),
    FAROESTE("Faroeste"),
    FANTASIA("Fantasia"),
    FICCAO_CIENTIFICA("Ficção científica"),
    GUERRA("Guerra"),
    MUSICAL("Musical"),
    POLICIAL("Policial"),
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    TERROR("Terror"),
    THRILLER("Thriller "),
    RUIM("Ruim");

    private String descricao;

    Genero(final String descricao) {
        this.descricao = descricao;
    }
}
