package com.mycompany.oficinamecanica;

// Classe abstrata para representar um tipo genérico de item de manutenção

public abstract class ItemManutencaoBase implements ItemManutencao {
    public double getPreco() {
        return getPrecoUnitario();
    }
}
