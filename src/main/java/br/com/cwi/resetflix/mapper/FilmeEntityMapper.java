package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.request.CriarFilmeRequest;

@Component
public class FilmeEntityMapper {

    @Autowired
    private AtoresRepository atoresRepository;

    @Autowired
    private DiretorRepository diretoresRepository;

    public FilmeEntity mapear(final CriarFilmeRequest request) {
        return new FilmeEntity(request.getNome(), request.getGenero(), diretoresRepository.findById(request.getIdDiretor()).orElse(null),
            atoresRepository.findAllById(request.getIdsAtores()));
    }
}
