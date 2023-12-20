package com.mycompany.oficinamecanica;

// Classe para representar uma pessoa

public class Pessoa {
    private String nome;
    private String detalhesPessoais;

    public Pessoa(String nome, String detalhesPessoais) {
        this.nome = nome;
        this.detalhesPessoais = detalhesPessoais;
    }

    public String getNome() {
        return nome;
    }

    public String getDetalhesPessoais() {
        return detalhesPessoais;
    }
}
