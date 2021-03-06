package br.com.cwi.resetflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cwi.resetflix.entity.FilmeEntity;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {

}
