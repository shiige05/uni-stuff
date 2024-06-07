---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-16T18:48:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 15: Análise de desempenho de algoritmos
- - -
Essa área de estudo leva em consideração **três fatores principais**:
- Tempo de execução;
- Espaço gasto em memória;
- Tempo gasto no desenvolvimento (incluindo testes).

## Tempo de execução

- **Medição empírica de tempo:** implementação, execução e marcação do tempo de execução.
	- Depende do poder computacional do dispositivo que executa o programa.
	- É obrigatório que o algoritmo seja implementado.
- **Medição analítica de tempo:** estimativa do tempo de execução usando equações matemáticas.

### Medição analítica

A medição analítica não é feita usando unidades de tempo, mas sim em termos de **quantidade de operações feitas**.

> Exemplo: comparação entre busca sequencial e busca binária.
> **Busca sequencial** - busca todos os elementos a partir do início até encontrar o valor.
> **Busca binária** - divide o conjunto em duas metades consecutivamente, até encontrar o valor.

- O número de operações é calculado através de uma equação.
- A equação recebe como entrada o tamanho do conjunto de dados manipulados.

> [!tip] **Exemplo**
> - ALGORITMO A -> $f(n) = 7n+2$ operações.
> - ALGORITMO B -> $f(n) = log_{2}(n) + 10$ operações.
> 
> Para um conjunto de dados de tamanho 1024: A = 7170 operações, B = 20 operações. Nesse caso, o algoritmo B é **mais rápido** por realizar menos operações.

