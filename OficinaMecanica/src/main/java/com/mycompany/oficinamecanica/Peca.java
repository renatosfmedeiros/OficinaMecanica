
package com.mycompany.oficinamecanica;

// Classe para representar uma peça, herda de ItemManutencaoBase

public class Peca extends ItemManutencaoBase {
    private String descricao;
    private String codigo;
    private double precoUnitario;
    private String marca;
    private String unidade;

    public Peca(String descricao, String codigo, double precoUnitario, String marca, String unidade) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.marca = marca;
        this.unidade = unidade;
    }

    // getters
    public String getDescricao() {
        return this.descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getUnidade() {
        return this.unidade;
    }

    // setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public double getPrecoTotal() {
        return getPrecoUnitario(); // Adicione esta linha
    }

}
