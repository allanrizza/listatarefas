package com.listatarefas.subtarefa;

import com.listatarefas.tarefa.Tarefa;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubTarefa subTarefa = (SubTarefa) o;
        return id.equals(subTarefa.id) && tarefaPai.equals(subTarefa.tarefaPai) && titulo.equals(subTarefa.titulo) && Objects.equals(status, subTarefa.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, tarefaPai, titulo, status);
    }
}
