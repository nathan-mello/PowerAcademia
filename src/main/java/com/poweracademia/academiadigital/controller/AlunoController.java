package com.poweracademia.academiadigital.controller;

import com.poweracademia.academiadigital.entity.Aluno;
import com.poweracademia.academiadigital.entity.form.AlunoForm;
import com.poweracademia.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoServiceImpl alunoService;

    public AlunoController(AlunoServiceImpl alunoService) {
        this.alunoService = alunoService;
    }
    @GetMapping
    public List<Aluno> findAll(){
        return alunoService.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return alunoService.create(form);
    }
}
