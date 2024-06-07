---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-22T18:29
tags:
  - UEPG/ESD
  - aula
---
# Aula 23: Percurso em árvores binárias
- - -

Forma sistemática de visitar (acessar) todos os nós de uma árvore binária.  
- Percurso pré-ordem: acessa a raiz-pai no início.  
- Percurso "em ordem" (in order): acessa a raiz-pai no meio  
- Percurso pós-ordem: acessa a raiz-pai por último.

## **Percurso pré-ordem**

1. Visita a raiz.
2. Percorre a sub-árvore esquerda em pré-ordem.
3. Percorre a sub-árvore direita em pré-ordem.

## **Percurso "em ordem" (*in order*)**

1. Percorre a sub-árvore esquerda "em ordem".
2. Visita a raiz.
3. Percorre a sub-árvore direita "em ordem".

## **Percurso pós-ordem**

1. Percorre a sub-árvore esquerda em pós-ordem.
2. Percorre a sub-árvore direita em pós-ordem.
3. Visita a raiz.

> **Exercício**  
> - Pré-ordem: A, B, C, D, E, F, G, H, I, J, K, L, M‌
> - Em ordem: C, B, E, D, F, G, A, H, J, I, L, K, M‌
> - Pós-ordem: C, E, G, F, D, B, J, L, M, K, I, H