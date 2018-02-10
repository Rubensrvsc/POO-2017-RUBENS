package com.example.rubens.projetoolx.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by rubens on 09/02/2018.
 */
@Entity
public class Anuncio {
    public double preco;
    public String nome;
    @Id long id;

    public Anuncio(){}

    public Anuncio(double preco,String nome){
        this.preco=preco;
        this.nome=nome;
    }

    public double getPreco(){
        return preco;
    }

    public String getNome(){
        return nome;
    }

    public long getId(){
        return id;
    }



}
