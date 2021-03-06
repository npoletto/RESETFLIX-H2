package br.com.cwi.resetflix.mapper;

import org.springframework.stereotype.Component;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.request.CriarFilmeRequest;

@Component
public class FilmeEntityMapper {

//    @Autowired
//    private AtoresRepository atoresRepository;
//
//    @Autowired
//    private DiretoresRepository diretoresRepository;

    public FilmeEntity mapear(final CriarFilmeRequest request) {
        return new FilmeEntity(request.getNome(), request.getGenero(),
//            diretoresRepository.metodoBuscarPorId(request.getIdDiretor()).get(),
            // atoresRepository.metodoBuscarTodosPorId(request.getIdsAtores()));
            null, null);
    }
}
