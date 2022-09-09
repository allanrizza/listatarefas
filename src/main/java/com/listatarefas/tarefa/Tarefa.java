package com.listatarefas.tarefa;

import com.listatarefas.subtarefa.SubTarefa;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TAREFAS")
@Getter
@Setter
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DESCRICAO")
    private String descricao;

    @OneToMany
    private List<SubTarefa> subtarefas;

    public Tarefa() {

    }

    public static class Builder {
        private String titulo;

        private String descricao;

        private List<SubTarefa> subtarefas;


        public Builder titulo(String valor) {
            titulo = valor;
            return this;
        }

        public Builder descricao(String valor) {
            descricao = valor;
            return this;
        }

        public Builder subtarefas(List<SubTarefa> valor) {
            subtarefas = valor;
            return this;
        }

        public Tarefa build() {
            return new Tarefa(this);
        }
    }

    private Tarefa(Builder builder) {
        titulo = builder.titulo;
        descricao = builder.descricao;
        subtarefas = builder.subtarefas;
    }
}
