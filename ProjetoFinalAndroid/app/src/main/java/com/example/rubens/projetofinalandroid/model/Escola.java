package com.example.rubens.projetofinalandroid.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

/**
 * Created by rubens on 13/02/2018.
 */
@Entity
public class Escola {
    @Id long id;
    public ToMany<Disciplinas> disciplinas;
    //public ToMany<Aluno> aluno;
    public String nome;
    public double mediaEscolar;

    public Escola(){}

    public Escola(String nome,double mediaEscolar){
        this.nome=nome;
        this.mediaEscolar=mediaEscolar;
    }
}
