package com.poweracademia.academiadigital.service;

import com.poweracademia.academiadigital.entity.Matricula;
import com.poweracademia.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatricolaService {

    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(Long id);
}
