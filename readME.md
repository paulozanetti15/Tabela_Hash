# Tabela Hash em Java

Este projeto apresenta uma implementação de uma Tabela Hash em Java, que foi projetada para atender a diversos requisitos, incluindo a implementação de uma função de hash eficiente, tratamento de colisões, manipulação de inserção, busca e remoção de objetos, bem como um teste de eficiência na busca.

## Introdução

Uma tabela hash é uma estrutura de dados amplamente utilizada em ciência da computação para armazenar e recuperar dados de forma eficiente. Ela oferece operações de inserção, busca e remoção em tempo médio constante, tornando-a uma escolha popular em uma variedade de aplicativos.

Neste projeto, implementamos uma Tabela Hash em Java que incorpora várias características fundamentais e melhores práticas para garantir o desempenho ideal e a integridade dos dados. A implementação considera aspectos importantes, como a minimização de colisões, tratamento de colisões eficaz e fator de carga para otimização do espaço de armazenamento.

## Funcionalidades do Sistema

- **Implementação de Função Hash Eficiente:** A função de hash implementada é projetada para minimizar colisões, garantindo uma distribuição uniforme dos elementos na tabela hash.
- **Suporte para Chaves de Diferentes Tipos:** A função de hash é capaz de lidar com chaves de tipo inteiro e de tipo String.
- **Objeto com Atributos Chave Int e String:** O código inclui um objeto que contém pelo menos um atributo do tipo int e um do tipo String, ambos podem ser usados como chave na tabela hash (ex: int id / String matricula).
- **Tratamento de Colisão em Duas Formas Distintas:** O sistema utiliza duas estratégias diferentes para lidar com colisões, garantindo a integridade dos dados na tabela hash.
- **Inserção de Objetos Utilizando Função de Hash:** Permite a inserção de objetos na tabela hash, seja por meio de código ou entrada do usuário, utilizando a função de hash para garantir a localização correta na tabela.
- **Busca de Objetos por Chave:** Permite a busca de objetos na tabela hash com base na chave fornecida, tanto por meio de código quanto por entrada do usuário, e retorna o objeto encontrado, se existir.
- **Remoção de Objetos por Chave:** Permite a remoção de objetos da tabela hash com base na chave fornecida, seja por meio de código ou entrada do usuário, e retorna o objeto removido, se existir.
- **Teste de Eficiência na Busca:** Implementa um teste de eficiência que compara os dois métodos de tratamento de colisão, medindo o tempo (em segundos) necessário para realizar a busca.
- **Consideração do Fator de Carga:** O sistema leva em consideração o fator de carga (capacidade máxima / tamanho) e duplica automaticamente o tamanho do array de armazenamento utilizado na tabela hash, conforme necessário para otimizar o desempenho.

## Metodo de Busca

                System.out.print("Número da camisa a ser buscado: ");
                int numero = scanner.nextInt();

                ArrayList<Dado> resultados = tabela.buscar(numero);
                if (resultados != null && !resultados.isEmpty()) {
                    for (Dado resultado : resultados) {
                        System.out.println("Jogador encontrado: " + resultado.getNome());
                    }
                } else {
                    System.out.println("Jogador não encontrado.");
                }
## Metodo de Inserir

                System.out.print("Número da camisa: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do jogador: ");
                String nome = scanner.nextLine();

                Dado jogador = new Dado(numero, nome);
                tabela.inserir(jogador);
## Metodo de Remocao

                System.out.print("Número da camisa a ser removido: ");
                int numero = scanner.nextInt();

                Dado resultado = tabela.remover(numero);
                if (resultado != null) {
                    System.out.println("Jogador removido: " + resultado.getNome());
                } else {
                    System.out.println("Jogador não encontrado.");
                }