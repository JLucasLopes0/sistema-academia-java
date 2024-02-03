package com.lopesdev.sistemaacademia.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String email;

    private int idade;

    private LocalDate dataInscricao;

    @ManyToOne
    @JoinColumn(name = "personal_id")
    private Personal personal;

    @OneToOne
    @JoinColumn(name = "treino_id")
    private Treino treino;

    @OneToMany(mappedBy = "aluno")
    private List<Pagamento> pagamentos;

    public Aluno() {
    }

    public Aluno(long id, String nome, String email, int idade, LocalDate dataInscricao, Personal personal, Treino treino) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.dataInscricao = dataInscricao;
        this.personal = personal;
        this.treino = treino;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }


}
