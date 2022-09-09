package com.listatarefas.enums;

public enum StatusTarefaEnum {

    A_FAZER("A"),
    EM_ANDAMENTO("E"),
    COMPLETADA("C");

    private String value;

    StatusTarefaEnum(String value) {
        value = value;
    }

    public String getValue() {
        return value;
    }
}
