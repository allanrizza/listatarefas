package com.listatarefas.subtarefa;

import com.listatarefas.tarefa.Tarefa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subtarefas")
@Getter
@Setter
public class SubTarefa extends Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "TAREFA_PAI")
    private Long tarefaPai;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "STATUS")
    private String status;
}
