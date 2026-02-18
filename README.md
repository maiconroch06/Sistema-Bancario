# Sistema Bancário - Projeto de POO

Este projeto é um sistema bancário desenvolvido como parte da disciplina de **Programação Orientada a Objetos (POO)**. O foco principal foi aplicar conceitos fundamentais como polimorfismo, herança e abstração, além de realizar a manipulação de arquivos para persistência de dados.

## Objetivos do Projeto
- **Polimorfismo:** Implementação de diferentes comportamentos para contas correntes e poupanças através de uma classe base comum.
- **Manipulação de Arquivos:** Persistência de dados das contas em arquivos de texto (`.txt`), garantindo que as informações sejam mantidas entre execuções do programa.
- **Interface Gráfica (GUI):** Desenvolvimento de uma interface amigável utilizando Java Swing para interagir com o sistema.

## Demostração (imagem clicavel)
<div align="center">

  [![Assista ao vídeo](https://img.youtube.com/vi/_NXXNoYNPsU/0.jpg)](https://www.youtube.com/watch?v=_NXXNoYNPsU)
  
</div>
  Sistema Bancário - Projeto Acadêmico feito em java

## Estrutura do Projeto (`src/`)

Abaixo estão as principais pastas e suas responsabilidades:

- **`classes/`**: Contém a lógica de negócio e as entidades do sistema.
  - `ContaBancaria.java`: Classe abstrata base que define os atributos e métodos comuns.
  - `ContaCorrente.java` e `ContaPoupanca.java`: Subclasses que implementam regras específicas (ex: limites e rendimentos), demonstrando o uso de **polimorfismo**.
- **`dados/`**: Contém a camada de persistência de dados e o armazenamento físico.
  - `Gravador.java`: Gerencia a escrita dos dados no arquivo.
  - `Leitor.java`: Gerencia a leitura e recuperação dos dados salvos.
  - `contas.txt`: Arquivo onde os dados das contas são persistidos no formato CSV.
- **`interfaces/`**: Contém as telas e componentes da interface gráfica.
  - Inclui `Main.java`, `Cadastro.java`, `Sacar.java`, `Depositar.java` e `Transferencia.java`.
- **`service/`**: Camada de serviço que contém a lógica operacional.
  - `ContaBancariaService.java`: Gerencia a coleção de contas e operações de busca/cadastro.
  - `OperacoesBancarias.java`: Centraliza as operações financeiras chamadas pela interface.
- **`utils/`**: Métodos auxiliares.
  - `Utilidade.java`: Contém funções para carregar tabelas, configurar atalhos, ícones e validações de entrada.
- **`imagens/`**: Recursos visuais utilizados na interface (fundo, ícones).
