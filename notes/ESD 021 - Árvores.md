---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-14T18:54:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 21: Árvores
- - -
**Árvores** são utilizadas para representar estruturas de informações que são organizadas em hierarquias (ex.: hierarquia militar, administração de uma organização).

![[ESD 021 - Árvores 2024-05-14 19.03.34.excalidraw]]

- **Raiz da árvore:** origem da estrutura da árvore, ponto inicial.
- **Nó:** elemento mais simples de uma árvore (ex.: B, C, D).
- **Parentesco entre nós:**
	- A é pai de B, C e D.
	- B, C e D são irmãos.
	- E e F são filhos de B.
	- Outros termos corretos - avô, neto, tio, ancestral, descendente.
- **Sub-árvore:** porção parcial de uma estrutura maior (ex.: os nós B, E e F formam uma sub-árvore, bem como C e G).
- Quando um nó não apresenta filhos, ele é denominado **nó folha** ou **nó terminal** (ex.: E, F, G e D).
- **Nível:** camada da hierarquia em relação à raiz - nível 0 (A), nível 1 (B, C e D), nível 2 (E, F e G).
- **Altura da árvore:** maior nível que a árvore alcança - nesse caso, 2.

## Árvores binárias

- Todo nó tem, no máximo, dois filhos.
	![[ESD 021 - Árvores 2024-05-14 19.40.47.excalidraw]]
- Cada filho pode ser esquerdo ou direito.

## Árvore binária de busca

Considere, por exemplo, os valores: 50, 30, 40, 10, 80, 20, 90, 75, 5 e 20.

![[ESD 021 - Árvores 2024-05-14 19.48.23.excalidraw]]

A árvore é preenchida com os dados através de comparações com o primeiro valor, caso seja menor é colocado na esquerda, caso seja maior é colocado na direita.

> Dia 28.05 - aula online assíncrona.