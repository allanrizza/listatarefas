package com.listatarefas.tarefa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TarefaServiceImpl implements TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    @Override
    public void salvarTarefa(TarefaForm tarefaForm) {
        log.info("Salvando tarefa \"" + tarefaForm.getTitulo() + "\"");
        tarefaRepository.save(tarefaForm.converterParaTarefa());
    }
}
