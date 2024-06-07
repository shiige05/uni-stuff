---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-23T18:52:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 17: Análise de desempenho II
- - -
Em geral, a avaliação de algoritmos é realizada em relação ao número de operações realizadas por ele - ou seja, quanto menor o número, melhor. Para padronizar as representações das expressões matemáticas, utiliza-se as **expressões assintóticas**.

- A expressão $f(n) = 7n+2$ se assemelha a $O(n)$ (ordem de n).
- A expressão $f(n) = \log_2n+10$ se assemelha a $O(\log_2n)$ (ordem de log).

## Principais tipos de algoritmos
| Nome                               | Expressão            |
| :------------------------------- | :------------------: |
| Constante (complexidade constante) | $O(1)$               |
| Logarítmica                        | $O(\log_2n)$         |
| Linear                             | $O(n)$               |
| n log n                            | $O(n \cdot \log_2n)$ |
| Quadrática                         | $O(n^2)$             |
| Exponencial                        | $O(2^n)$             |
- Algoritmos de busca - logarítmica, linear.
- Algoritmos de ordenação - n log n, quadrática.

# Ordenação

- **Classificação das técnicas de ordenação.**
	- Interna (apenas na memória principal) ou externa (memória secundária e principal).
	- **Estabilidade**: o que o algoritmo faz quando encontra dados de mesmo valor.
		- Estável (mantém a ordem inicial relativa) ou não estável (quebra a ordem original).
		- ![[ESD 017 - Análise de desempenho II 2024-04-24 13.00.07.excalidraw]]
	- *In-place* ou *in-loco* (local): não usam memória adicional.
	- **Tempo de execução:** $O(n\log n)$ ou $O(n^2)$.

## Algoritmos não baseados em comparação

### *Radix sort* (ordenação por raiz)

- Exemplo: \[25, 57, 48, 37, 92, 32, 85, 27].
- Criam-se 10 filas:
	- 0 →
	- 1 →
	- 2 →
	- 3 →
	- 4 →
	- 5 →
	- 6 →
	- 7 →
	- 8 →
	- 9 →
- O algoritmo observa os dígitos da mais a direita.
	- 0 →
	- 1 →
	- 2 → 92, 32
	- 3 →
	- 4 →
	- 5 → 25, 85
	- 6 →
	- 7 → 57, 37, 27
	- 8 → 48
	- 9 →
- Copia para o vetor: \[92, 32, 25, 85, 57, 37, 27, 48]
- Agora, o algoritmo observa o próximo dígito à esquerda.
	- 0 → 
	- 1 →
	- 2 → 25, 27
	- 3 → 32, 37
	- 4 → 48
	- 5 → 57
	- 6 →
	- 7 →
	- 8 → 85
	- 9 → 92
- Copia para o vetor novamente: \[25, 27, 32, 37, 48, 57, 85, 92].