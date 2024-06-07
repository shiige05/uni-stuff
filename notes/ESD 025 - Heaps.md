---
disciplina: "[[Estrutura de Dados]]"
data: 2024-06-04T18:53:00
tags:
  - UEPG/ESD
  - aula
cssclasses:
  - center-images
---
# Aula 25: Heaps
- - -
> **Revisão (exercícios):** 13.06
> **Prova:** 25.06

- ***Heaps*** são árvores binárias implementadas sobre um vetor.
- São usadas para implementar filas de prioridade e o algoritmo de ordenação *heap-sort*.
- O valor do pai é maior que o valor dos filhos.
- A árvore binária deve ser completa ou quase completa.

![[ESD 025 - Heaps 2024-06-04 19.08.07.excalidraw|300]]
- Note que a raiz da árvore contém o maior valor da *heap*. Esse sempre será o caso para a estrutura de *heaps*.
- Para representar essa árvore como um vetor, são atribuídos números aos nós de cima para baixo, da esquerda para a direita.
	- Portanto, o vetor seria 100, 60, 30, 50, 40, 20, 10 e 5.
	- Para uma posição $p$ de um nó qualquer:
		- A posição do pai é $(p-1)/2$.
		- Seu filho esquerdo está em $(2*p)+1$.
		- Seu filho direito está em $(2*p)+2$.

> **O vetor não deve ter lacunas para a representação da árvore.**

## Remoção em árvores binárias de busca

- Se o nó a ser removido não apresentar filhos, o nó é retirado.
- Caso o nó tenha apenas um filho, ele toma o lugar do nó removido.
- Caso o nó apresente dois filhos, é substituído pelo antecessor ou sucessor da sequência ordenada da árvore.

## Árvore genérica

![[ESD 025 - Heaps 2024-06-04 19.51.32.excalidraw]]

```cpp
struct no {
	int dado;
	struct no *filhos[10];
};

// ou

struct no {
	int dado;
	struct no *filho;
	struct no *irmao;
};
```

- As desvantagens de árvores genéricas em relação às binárias é que há filhos que podem não ser utilizados na árvore e que existe um limite máximo de filhos que um nó pode ter.