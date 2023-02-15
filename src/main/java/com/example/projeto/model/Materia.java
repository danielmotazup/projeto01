package com.example.projeto.model;

public class Materia {

    private String nome;
    private String id;
    private String dias;

    public Materia(String nome, String id, String dias) {
        this.nome = nome;
        this.id = id;
        this.dias = dias;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getDias() {
        return dias;
    }
}
