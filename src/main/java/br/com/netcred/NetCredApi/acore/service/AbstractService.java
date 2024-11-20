package br.com.netcred.NetCredApi.acore.service;


import br.com.netcred.NetCredApi.acore.model.AbstractDTO;
import br.com.netcred.NetCredApi.acore.model.AbstractEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AbstractService<T extends AbstractEntity, D extends AbstractDTO> {
    T salvar(T entidade);

    void deletar(Long codigo);

    T buscarId(Long codigo);

    List<T> listar();

    Page<T> filtering(D filter, Pageable page);
}
