package com.lopesdev.sistemaacademia.repositories;

import com.lopesdev.sistemaacademia.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {
}
