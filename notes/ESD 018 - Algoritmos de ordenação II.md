---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-24T20:38:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 18: Algoritmos de ordenação II
- - -
- **Seleção direta (*selection sort*):** O(n^2).
	- Procura o menor elemento, posiciona ele na primeira posição.
	- Algoritmo simples de ser implementado.
- **Merge sort**: O(n log n).
	- Algoritmo recursivo.
	- Não é *in-place*.
	- Divide o vetor no meio, sucessivamente, até chegar a um segmento de 2 valores. Intercala os valores em um vetor auxiliar, ordenando-os.
	- Vetor auxiliar deve ser GLOBAL.

## *Selection sort*
```cpp
void selectionsort() {
    int i, k;
    for (i=0; i<=TAM-2; i++) {
        int atual = i;
        for (k=i+1; k<=TAM-1; k++) {
            if (A[atual] > A[k]) {
                atual = k;
            }
        }
        troca(&A[i], &A[atual]);
    }
}
```

## *Merge sort*

```cpp
void mergesort (int lo, int hi) {
    int k, mid, L, H;
    if (lo < hi) {
        mid = (lo+hi)/2;
        mergesort(lo, mid);
        mergesort(mid+1, hi);
        L = lo, H = mid+1;
        for (k=lo; k<=hi; k++) {
            if (L<=mid && (H > hi || A[L] < A[H])) {
                scratch[k] = A[L];
                L++;
            } else {
                scratch[k] = A[H];
                H++;
            }
        }
        for (k=lo; k<=hi; k++){
            A[k] = scratch[k];
        }
    }
}
```