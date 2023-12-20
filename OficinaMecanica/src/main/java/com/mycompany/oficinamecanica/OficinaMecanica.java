package com.mycompany.oficinamecanica;
public class OficinaMecanica {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João", "Rua das Flores, 123");

        // Criando um veículo
        Veiculo veiculo = new Veiculo("Ford", "Fiesta", 2010, 2011, 100000, 0.5);

        // Criando um mecânico
        Mecanico mecanico = new Mecanico("Carlos", "Rua das Pedras, 456");

        // Criando uma ordem de serviço
        OrdemServico ordemServico = new OrdemServico(cliente, veiculo, "2022-01-01", mecanico);

        // Criando uma peça e um serviço
        Peca peca = new Peca("Filtro de óleo", "123", 50.0, "Bosch", "Unidade");
        Servico servico = new Servico("Troca de óleo", "456", 100.0, 2);

        // Adicionando a peça e o serviço na ordem de serviço
        ordemServico.adicionarItemManutencao(peca);
        ordemServico.adicionarItemManutencao(servico);

        // Calculando o valor total da ordem de serviço
        double valorTotal = ordemServico.calcularValorTotal();
        System.out.println("Valor total da ordem de serviço: " + valorTotal);

        // Pesquisando um item de manutenção por código
        ItemManutencao itemEncontrado = ordemServico.encontrarItemPorCodigo("123");
        if (itemEncontrado != null) {
            System.out.println("Item encontrado: " + itemEncontrado.getDescricao());
        } else {
            System.out.println("Item não encontrado");
        }
    }
}


/*
Saída para este exemplo hipotético:

Valor total da ordem de serviço: 250.0
Item encontrado: Filtro de óleo

*/


