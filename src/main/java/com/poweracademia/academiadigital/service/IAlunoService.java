package com.poweracademia.academiadigital.service;

import com.poweracademia.academiadigital.entity.Aluno;
import com.poweracademia.academiadigital.entity.AvaliacaoFisica;
import com.poweracademia.academiadigital.entity.form.AlunoForm;
import com.poweracademia.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();


    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);


}
