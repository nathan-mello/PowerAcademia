package com.poweracademia.academiadigital.service.impl;

import com.poweracademia.academiadigital.Repository.AlunoRepository;
import com.poweracademia.academiadigital.entity.Aluno;
import com.poweracademia.academiadigital.entity.AvaliacaoFisica;
import com.poweracademia.academiadigital.entity.form.AlunoForm;
import com.poweracademia.academiadigital.entity.form.AlunoUpdateForm;
import com.poweracademia.academiadigital.service.IAlunoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoServiceImpl(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno(form.getNome(), form.getCpf(), form.getBairro(), form.getDataDeNascimento());
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
