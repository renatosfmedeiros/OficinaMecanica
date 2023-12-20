package com.mycompany.oficinamecanica;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private int quilometragem;
    private double nivelCombustivel;

    public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, int quilometragem,
            double nivelCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.nivelCombustivel = nivelCombustivel;
    }

    // getters e setters
    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}

