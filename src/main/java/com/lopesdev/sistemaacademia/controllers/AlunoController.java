package com.lopesdev.sistemaacademia.controllers;

import com.lopesdev.sistemaacademia.entities.Aluno;
import com.lopesdev.sistemaacademia.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

@Autowired
private AlunoRepository repository;

@GetMapping
public List<Aluno> findAll(){
    return repository.findAll();
}

@PostMapping
public Aluno insert(@RequestBody Aluno aluno) {
    return repository.save(aluno);
}


}


