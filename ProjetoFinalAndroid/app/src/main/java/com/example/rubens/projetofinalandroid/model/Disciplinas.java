package com.example.rubens.projetofinalandroid.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by rubens on 13/02/2018.
 */
@Entity
public class Disciplinas {
    @Id long id;
    public String nome;
    public double notaMensal;
    //public double notaBimestral;
    //public String mes;
    public String nomeProfessor;

    public Disciplinas(){}

    public Disciplinas(String nome,double notaMensal,String nomeProfessor){
        this.nome=nome;
        this.notaMensal=notaMensal;
        this.nomeProfessor=nomeProfessor;
    }
}
