# Sistema Bancário - Projeto de POO

Este projeto é um sistema bancário desenvolvido como parte da disciplina de **Programação Orientada a Objetos (POO)**. O foco principal foi aplicar conceitos fundamentais como polimorfismo, herança e abstração, além de realizar a manipulação de arquivos para persistência de dados.

## Objetivos do Projeto
- **Polimorfismo:** Implementação de diferentes comportamentos para contas correntes e poupanças através de uma classe base comum.
- **Manipulação de Arquivos:** Persistência de dados das contas em arquivos de texto (`.txt`), garantindo que as informações sejam mantidas entre execuções do programa.
- **Interface Gráfica (GUI):** Desenvolvimento de uma interface amigável utilizando Java Swing para interagir com o sistema.

## Estrutura do Projeto (`src/`)

Abaixo estão as principais pastas e suas responsabilidades:

- **`classes/`**: Contém a lógica de negócio e as entidades do sistema.
  - `ContaBancaria.java`: Classe abstrata base que define os atributos e métodos comuns.
  - `ContaCorrente.java` e `ContaPoupanca.java`: Subclasses que implementam regras específicas (ex: limites e rendimentos), demonstrando o uso de **polimorfismo**.
- **`Dados/`**: Contém a camada de persistência de dados.
  - `Gravador.java`: Gerencia a escrita dos dados no arquivo.
  - `Leitor.java`: Gerencia a leitura e recuperação dos dados salvos.
- **`dados/`**: Local de armazenamento dos dados físicos.
  - `contas.txt`: Arquivo onde os dados das contas são persistidos no formato CSV.
- **`interfaces/`**: Contém as telas e componentes da interface gráfica.
  - Inclui `Main.java`, `Cadastro.java`, `Sacar.java`, `Depositar.java` e `Transferencia.java`.
- **`Service/`**: Camada de serviço que contém a lógica operacional.
  - `ContaBancariaService.java`: Gerencia a coleção de contas e operações de busca/cadastro.
  - `OperacoesBancarias.java`: Centraliza as operações financeiras chamadas pela interface.
- **`utils/`**: Métodos auxiliares.
  - `Utilidade.java`: Contém funções para carregar tabelas, configurar atalhos e ícones.
- **`imagens/`**: Recursos visuais utilizados na interface (fundo, ícones).

## Melhorias Sugeridas

Durante a análise do projeto, identifiquei alguns pontos que podem ser aprimorados:

1.  **Padronização de Nomes de Pacotes:** Em Java, por convenção, nomes de pacotes devem ser totalmente em letras minúsculas. Atualmente, há uma mistura (ex: `Dados` e `dados`). Isso também evita problemas em sistemas operacionais que diferenciam maiúsculas de minúsculas (Linux).
2.  **Tratamento de Caminhos (Paths):** No código de gravação/leitura, o caminho está fixo com `\\` (formato Windows). Recomenda-se o uso de `File.separator` ou a API `java.nio.file.Path` para garantir que o projeto funcione tanto em Windows quanto em Linux/macOS.
3.  **Encapsulamento:** Algumas variáveis poderiam ter modificadores de acesso mais restritos, garantindo que o estado do objeto só seja alterado através de métodos validados.
4.  **Validação de Entradas:** Adicionar validações na interface gráfica para impedir que o usuário insira caracteres inválidos em campos numéricos (como saldo ou valor de saque).
