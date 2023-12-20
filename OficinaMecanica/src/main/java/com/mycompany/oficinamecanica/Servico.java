package com.mycompany.oficinamecanica;

// Classe para representar um serviço, herda de ItemManutencaoBase

public class Servico extends ItemManutencaoBase {
    private String descricao;
    private String codigo;
    private double precoUnitario;
    private int horasPrevistas;

    public Servico(String descricao, String codigo, double precoUnitario, int horasPrevistas) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.precoUnitario = precoUnitario;
        this.horasPrevistas = horasPrevistas;
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

    public int getHorasPrevistas() {
        return this.horasPrevistas;
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

    public void setHorasPrevistas(int horasPrevistas) {
        this.horasPrevistas = horasPrevistas;
    }

    @Override
    public double getPrecoTotal() {
        return getPrecoUnitario() * getHorasPrevistas(); // Adicione esta linha
    }
}
