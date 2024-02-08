package com.lopesdev.sistemaacademia.entities;

import com.lopesdev.sistemaacademia.enums.EnumTipoTreino;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_treino")
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private EnumTipoTreino tipoTreino;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnumTipoTreino getTipoTreino() {
        return tipoTreino;
    }

    public void setTipoTreino(EnumTipoTreino tipoTreino) {
        this.tipoTreino = tipoTreino;
    }


}

