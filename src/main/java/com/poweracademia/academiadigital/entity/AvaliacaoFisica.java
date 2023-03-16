package com.poweracademia.academiadigital.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_avaliacoesFisicas")
public class AvaliacaoFisica {

    @Id
    private Long ID;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    private final LocalDateTime dataMatricola = LocalDateTime.now();

    @Column(name = "peso_atual")
    private Double peso;
    @Column(name = "altura_atual")
    private Double altura;

    public AvaliacaoFisica(Long ID, Aluno aluno, Double peso, Double altura) {
        this.ID = ID;
        this.aluno = aluno;
        this.peso = peso;
        this.altura = altura;
    }

    public AvaliacaoFisica(){

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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvaliacaoFisica that)) return false;
        return Objects.equals(getID(), that.getID()) && Objects.equals(getAluno(), that.getAluno()) && Objects.equals(getDataMatricola(), that.getDataMatricola()) && Objects.equals(getPeso(), that.getPeso()) && Objects.equals(getAltura(), that.getAltura());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getAluno(), getDataMatricola(), getPeso(), getAltura());
    }
}
