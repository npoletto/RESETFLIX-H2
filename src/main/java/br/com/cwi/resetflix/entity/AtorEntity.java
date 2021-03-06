package br.com.cwi.resetflix.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

public class AtorEntity {

    private Long id;

    private final String nome;

    private final List<FilmeEntity> filmes;

    public AtorEntity(final String nome, final List<FilmeEntity> filmes) {
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

    public List<FilmeEntity> getFilmes() {
        return filmes;
    }
}
