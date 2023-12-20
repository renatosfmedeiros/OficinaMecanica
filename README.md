# Sistema de Gerenciamento para Oficina Mecânica

Integrantes:
Renato Medeiros,
Guilherme Nascimento,
Thales Germano,
Matheus Alves,
Guilherme Oliveira


Este código é um exemplo de um sistema de gerenciamento para uma oficina mecânica. Ele contém várias classes e interfaces para representar diferentes conceitos dentro desse sistema. 

## Classes e Interfaces

ItemManutencao: Interface que define os métodos que qualquer item de manutenção deve ter.

ItemManutencaoBase: Classe abstrata que implementa a interface ItemManutencao.

Peca e Servico: Subclasses de ItemManutencaoBase que representam uma peça e um serviço, respectivamente.

Veiculo: Classe que representa um veículo.

Pessoa, Cliente e Mecanico: Classes que representam uma pessoa, um cliente e um mecânico, respectivamente.

OrdemServico: Classe que representa uma ordem de serviço.

OficinaMecanica: Classe principal do programa.


Conceitos chave:

Polimorfismo: A interface ItemManutencao é implementada pelas classes Peca e Servico.

Herança: As classes Cliente e Mecanico herdam da classe Pessoa. As classes Peca e Servico herdam de ItemManutencaoBase.

Encapsulamento: Todos os atributos nas classes são privados.
