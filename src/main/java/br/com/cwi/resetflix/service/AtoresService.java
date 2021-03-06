package br.com.cwi.resetflix.service;

import static java.util.Collections.emptyList;
import static org.apache.logging.log4j.util.Strings.isEmpty;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.BadRequestException;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.AtorEntityMapper;
import br.com.cwi.resetflix.mapper.AtoresResponseMapper;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesAtorResponseMapper;
import br.com.cwi.resetflix.request.CriarAtorRequest;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;

@Service
public class AtoresService {

    //TODO Criar Repositories
//    @Autowired
//    private AtoresRepository atoresRepository;
//
//    @Autowired
//    private FilmeRepository filmeRepository;

    @Autowired
    private AtoresResponseMapper atoresResponseMapper;

    @Autowired
    private AtorEntityMapper atorEntityMapper;

    @Autowired
    private ConsultarDetalhesAtorResponseMapper consultarDetalhesAtorResponseMapper;

    public List<AtoresResponse> getAtores() {
//        final List<AtorEntity> atores = atoresRepository.metodoBuscar();
//        return atoresResponseMapper.mapear(atores);
        return emptyList();
    }

    @Transactional
    public Long criarAtor(final CriarAtorRequest request) {

        if (request == null || isEmpty(request.getNome())) {
            throw new BadRequestException("Dados inválidos para cadastro de ator");
        }

//        final List<FilmeEntity> filmes = filmeRepository.metodoBuscarPorId(request.getIdFilmes());
        final List<FilmeEntity> filmes = new ArrayList<>();

        final AtorEntity atorSalvar = atorEntityMapper.mapear(request, filmes);
//        atoresRepository.metodoSalvar(atorSalvar);

        filmes.forEach(filme -> filme.getAtores().add(atorSalvar));
//        filmeRepository.metodoSalvarTodos(filmes);

        return atorSalvar.getId();
    }

    public ConsultarDetalhesAtorResponse consultarDetalhesAtor(final Long id) {

        final AtorEntity atorSalvo = null;
        // atorSalvo = atoresRepository.metodoBuscarPorId(id);

        if (atorSalvo == null) {
            throw new NotFoundException("Ator não encontrado");
        }

        return consultarDetalhesAtorResponseMapper.mapear(atorSalvo);
    }
}
