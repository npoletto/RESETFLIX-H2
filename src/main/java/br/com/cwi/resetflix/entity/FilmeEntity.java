package br.com.cwi.resetflix.entity;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class FilmeEntity {

    private Long id;

    private String nome;

    private Genero genero;

    private DiretorEntity diretor;

    private List<AtorEntity> atores;

    public FilmeEntity(final String nome, final Genero genero, final DiretorEntity diretores,
        final List<AtorEntity> atores) {
        this.nome = nome;
        this.genero = genero;
        this.diretor = diretores;
        this.atores = atores;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(final Genero genero) {
        this.genero = genero;
    }

    public DiretorEntity getDiretor() {
        return diretor;
    }

    public void setDiretor(final DiretorEntity diretor) {
        this.diretor = diretor;
    }

    public List<AtorEntity> getAtores() {
        return atores;
    }

    public void setAtores(final List<AtorEntity> atores) {
        this.atores = atores;
    }
}
