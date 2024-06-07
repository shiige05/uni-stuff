---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-07T18:54
tags:
  - UEPG/ESD
  - aula
---
# Aula 19: Recursividade
- - -
Algumas aplicações podem ser resolvidas de duas maneiras:
- **Solução iterativa:** quando a solução não cita o problema original.
	- Por exemplo, `fat(n) = n * (n-1) * (n-2) * … * 1`.
- **Solução recursiva:** quando a solução de um problema depende da solução do mesmo problema para um caso *mais simples*.
	- Por exemplo, `fat(n) = n * fat(n-1)`.

## Propriedades da solução recursiva de um problema

- Solução do problema depende da solução de um **caso mais simples**.
- Existência de um critério de parada.
- Por exemplo, a aplicação do algoritmo de fatorial é realizada como:
	```cpp
	int fat (int n) {
		if (n == 0) return 1;
		else return n * fat(n-1);
	}
	```

- Algoritmos são usados para problemas com definição recursiva.
- Algoritmos recursivos gastam mais memória.
- Se houver solução iterativa, use-a.

