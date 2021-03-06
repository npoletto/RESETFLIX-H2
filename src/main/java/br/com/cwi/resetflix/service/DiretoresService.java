package br.com.cwi.resetflix.service;

import static org.apache.logging.log4j.util.Strings.isEmpty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.exception.BadRequestException;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesDiretorResponseMapper;
import br.com.cwi.resetflix.mapper.DiretorEntityMapper;
import br.com.cwi.resetflix.mapper.DiretoresResponseMapper;
import br.com.cwi.resetflix.request.CriarDiretorRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;

@Service
public class DiretoresService {

//    @Autowired
//    private DiretoresRepository diretoresRepository;
//
//    @Autowired
//    private FilmeRepository filmeRepository;

    @Autowired
    private DiretoresResponseMapper diretoresResponseMapper;

    @Autowired
    private DiretorEntityMapper diretorEntityMapper;

    @Autowired
    private ConsultarDetalhesDiretorResponseMapper consultarDetalhesDiretorResponseMapper;

    public List<DiretoresResponse> getDiretores() {
//        final List<DiretorEntity> diretores = diretoresRepository.metodoBuscarTodos();
        final List<DiretorEntity> diretores = new ArrayList<>();
        return diretoresResponseMapper.mapear(diretores);
    }

    public Long criarDiretor(final CriarDiretorRequest request) {

        if (request == null || isEmpty(request.getNome())) {
            throw new BadRequestException("Dados inválidos para cadastro de diretor");
        }

        final DiretorEntity diretorSalvar = diretorEntityMapper.mapear(request);

//        return diretoresRepository.metodoSalvar(diretorSalvar).getId();
        return null;
    }

    public ConsultarDetalhesDiretorResponse consultarDetalhesDiretor(final Long id) {

        //final DiretorEntity diretorSalvo = diretoresRepository.metodoBuscarPorId(id);
        final DiretorEntity diretorSalvo = null;
        if (diretorSalvo == null) {
            throw new NotFoundException("Diretor não encontrado");
        }

        return consultarDetalhesDiretorResponseMapper.mapear(diretorSalvo);
    }
}
