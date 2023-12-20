
package com.mycompany.oficinamecanica;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma ordem de serviço

public class OrdemServico {
    private Cliente cliente;
    private Veiculo veiculo;
    private List<ItemManutencao> itensManutencao;
    private String dataManutencao;
    private Mecanico mecanico;

    public OrdemServico(Cliente cliente, Veiculo veiculo, String dataManutencao, Mecanico mecanico) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataManutencao = dataManutencao;
        this.mecanico = mecanico;
        this.itensManutencao = new ArrayList<>();
    }

    // Método para adicionar itens de manutenção
    public void adicionarItemManutencao(ItemManutencao itemManutencao) {
        itensManutencao.add(itemManutencao);
    }

    // Método para calcular o valor total da ordem de serviço
    public double calcularValorTotal() {
        double valorTotal = 0;

        for (ItemManutencao item : itensManutencao) {
            valorTotal += item.getPrecoTotal(); // Atualize esta linha
        }

        return valorTotal;
    }

    // Método para pesquisa de informações específicas
    public ItemManutencao encontrarItemPorCodigo(String codigo) {
        for (ItemManutencao item : itensManutencao) {
            if (item.getCodigo().equals(codigo)) {
                return item;
            }
        }
        return null;
    }

}
