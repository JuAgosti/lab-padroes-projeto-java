# 🧩 Explorando Padrões de Projeto na Prática com Java (GoF)

> **Nota:** Este repositório foi desenvolvido como parte do desafio prático do bootcamp da [Digital Innovation One (DIO)](https://web.dio.me/). O objetivo principal é reproduzir e fixar os conceitos dos padrões de projeto clássicos (Gang of Four - GoF) apresentados durante as aulas do laboratório *"Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework"*.

---

## Sobre o Projeto

O projeto consiste na implementação prática de três padrões de projeto estruturais e comportamentais em **Java Puro** (sem frameworks), demonstrando como cada um resolve problemas específicos de arquitetura de software:

1. **Singleton:** Garante a existência de apenas uma única instância de uma classe em toda a aplicação.
2. **Strategy:** Permite alterar o comportamento ou algoritmo de um objeto dinamicamente em tempo de execução.
3. **Facade:** Prover uma interface unificada e simplificada para um conjunto de subsistemas mais complexos.

---

## Padrões Implementados

### 1. Singleton
Demonstração das variações de criação de instância única:
* **Lazy (Preguiçoso):** A instância só é criada quando solicitada pela primeira vez.
* **Eager (Apressado):** A instância é criada no momento do carregamento da classe pela JVM.
* **Lazy Holder:** Abordagem recomendada para ambientes multithread, garantindo *thread-safety* e carregamento sob demanda através de uma classe estática interna.

### 2. Strategy
Simulação de um sistema de comportamento de um Robô:
* **Interface `Comportamento`:** Define o contrato básico para as ações.
* **Implementações concretas:** `ComportamentoNormal`, `ComportamentoDefensivo` e `ComportamentoAgressivo`.
* **Classe `Robo`:** Funciona como o contexto, alterando sua forma de se mover dinamicamente via composição.

### 3. Facade
Integração simplificada de subsistemas simulados de CRM e CEP:
* **`CepApi`:** Serviço responsável por buscar dados de localização.
* **`CrmService`:** Serviço responsável por persistir informações do cliente.
* **`Facade`:** Classe que abstrai a complexidade de consultar o CEP e gravar o cliente em um único método simples (`migrarCliente`).

---
