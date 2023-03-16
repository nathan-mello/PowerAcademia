package com.poweracademia.academiadigital.service;

import com.poweracademia.academiadigital.entity.AvaliacaoFisica;
import com.poweracademia.academiadigital.entity.form.AvaliacaoFisicaForm;

import java.util.List;

public interface IAvaliacaoFisica {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaForm form);
    void delete(Long id);
}
