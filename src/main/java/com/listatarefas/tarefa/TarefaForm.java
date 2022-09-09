package com.listatarefas.tarefa;

import com.listatarefas.subtarefa.SubTarefa;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TarefaForm {
    private String titulo;

    private String descricao;

    private List<SubTarefa> subtarefas;

    public Tarefa converterParaTarefa() {
        return new Tarefa.Builder().titulo(this.titulo).descricao(this.descricao).subtarefas(this.subtarefas).build();
    }
}
