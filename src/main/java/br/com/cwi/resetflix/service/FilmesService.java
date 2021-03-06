package br.com.cwi.resetflix.service;

import static java.util.Objects.nonNull;
import static org.apache.logging.log4j.util.Strings.isEmpty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.BadRequestException;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;

@Service
public class FilmesService {

//    @Autowired
//    private FilmeRepository filmeRepository;
//
//    @Autowired
//    private AtoresRepository atoresRepository;
//
//    @Autowired
//    private DiretoresRepository diretoresRepository;

    @Autowired
    private FilmeResponseMapper filmeResponseMapper;

    @Autowired
    private FilmeEntityMapper filmeEntityMapper;

    @Autowired
    private ConsultarDetalhesFilmeResponseMapper consultarDetalhesFilmeResponseMapper;

    public List<FilmeResponse> getFilmes(final Genero genero) {

        final List<FilmeEntity> filmes = new ArrayList<>();

        if (nonNull(genero)) {
//            filmes = filmeRepository.metodoBuscarTodosPorGenero(genero);
        } else {
//            filmes = filmeRepository.metodoBuscarTodos();
        }

        return filmeResponseMapper.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request) {

        if (request == null || isEmpty(request.getNome())) {
            throw new BadRequestException("Dados inválidos para cadastro de filme");
        }

        final FilmeEntity filmeSalvar = filmeEntityMapper.mapear(request);
//        return filmeRepository.metodoSalvar(filmeSalvar).getId();
        return null;
    }

    public ConsultarDetalhesFilmeResponse consultarDetalhesFilme(final Long id) {
//        final FilmeEntity filmeSalvo = filmeRepository.metodoBuscarPorId(id).orElse(null);
        FilmeEntity filmeSalvo = null;
        if (filmeSalvo == null) {
            throw new NotFoundException("Filme não encontrado");
        }

        return consultarDetalhesFilmeResponseMapper.mapear(filmeSalvo);
    }
}
