package com.example.projeto.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Materia> materias = new ArrayList<>();

    public Aluno(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public Aluno() {
    }
}
