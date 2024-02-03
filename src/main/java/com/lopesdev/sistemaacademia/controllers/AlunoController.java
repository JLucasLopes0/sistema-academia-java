package com.lopesdev.sistemaacademia.controllers;

import com.lopesdev.sistemaacademia.entities.Aluno;
import com.lopesdev.sistemaacademia.repositories.AlunoRepository;
import com.lopesdev.sistemaacademia.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> findAll(){
        return alunoService.findAll();
    }

    @GetMapping(value="/{id}")
    public Optional<Aluno> findById(@PathVariable Long id){
        return alunoService.findById(id);
    }

    @PostMapping
    public Aluno insert(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @PutMapping(value="/{id}")
    public Aluno update(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
        alunoService.deleteById(id);
    }

}


