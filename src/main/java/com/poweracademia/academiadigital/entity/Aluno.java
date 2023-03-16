package com.poweracademia.academiadigital.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_alunos")
@JsonIgnoreProperties({"hibernateLazeInitializer", "handler"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    @Column(unique = true)
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    @JsonIgnore
    private final List<AvaliacaoFisica>  avaliacaoFisicas = new ArrayList<>();

    public Aluno() {

    }

    public Aluno(String name, String cpf, String bairro, LocalDate dataNascimento) {
        this.name = name;
        this.cpf = cpf;
        this.bairro = bairro;
        this.dataNascimento = dataNascimento;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<AvaliacaoFisica> getAvaliacaoFisicas() {
        return avaliacaoFisicas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getID(), aluno.getID()) && Objects.equals(getName(), aluno.getName()) && Objects.equals(getCpf(), aluno.getCpf()) && Objects.equals(getBairro(), aluno.getBairro()) && Objects.equals(getDataNascimento(), aluno.getDataNascimento()) && Objects.equals(getAvaliacaoFisicas(), aluno.getAvaliacaoFisicas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getName(), getCpf(), getBairro(), getDataNascimento(), getAvaliacaoFisicas());
    }
}
