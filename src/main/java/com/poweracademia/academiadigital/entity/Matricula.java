package com.poweracademia.academiadigital.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    private final LocalDateTime dataMatricola = LocalDateTime.now();

    public Matricula(Long ID, Aluno aluno) {
        this.ID = ID;
        this.aluno = aluno;
    }

    public Matricula() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getDataMatricola() {
        return dataMatricola;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matricula matricula)) return false;
        return Objects.equals(getID(), matricula.getID()) && Objects.equals(getAluno(), matricula.getAluno()) && Objects.equals(getDataMatricola(), matricula.getDataMatricola());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getAluno(), getDataMatricola());
    }
}
