package com.lopesdev.sistemaacademia.services;

import com.lopesdev.sistemaacademia.dtos.AlunoDTO;
import com.lopesdev.sistemaacademia.entities.Aluno;
import com.lopesdev.sistemaacademia.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public AlunoDTO findById(Long id) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        if (optionalAluno.isPresent()) {
            Aluno aluno = optionalAluno.get();
            return new AlunoDTO(aluno);
        }
        else {
            return null;
        }
    }

    public Aluno save(@RequestBody Aluno aluno) {
        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new IllegalArgumentException("Student name is required");
        }
        if (aluno.getEmail() == null || aluno.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Student email is required");
        }
        if (aluno.getDataInscricao() == null) {
            throw new IllegalArgumentException("Student email is required");
        }
        return alunoRepository.save(aluno);
    }

    public void deleteById(Long id) {

        alunoRepository.deleteById(id);
    }

}