package com.example.rubens.projetofinalandroid.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToOne;

/**
 * Created by rubens on 13/02/2018.
 */
//quando atribuir o aluno a determinada escola ja fazer a associação das disciplinas com as notas e juntar no Map
@Entity
public class Aluno {
    @Id long id;
    public ToOne<Escola> escola;
    public String nome;
    public String sexo;
    public int serie;
    //public double mediaPessoal;

    public Aluno(){}

    public Aluno(String nome,String sexo,int serie){
        this.nome=nome;
        this.sexo=sexo;
        this.serie=serie;
    }
}
