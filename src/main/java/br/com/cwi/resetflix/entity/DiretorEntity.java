package br.com.cwi.resetflix.entity;

import java.util.List;

public class DiretorEntity {

    private Long id;

    private String nome;

    private List<FilmeEntity> filmes;

    public DiretorEntity(final String nome, final List<FilmeEntity> filmes) {
        this.nome = nome;
        this.filmes = filmes;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public List<FilmeEntity> getFilmes() {
        return filmes;
    }

    public void setFilmes(final List<FilmeEntity> filmes) {
        this.filmes = filmes;
    }
}
