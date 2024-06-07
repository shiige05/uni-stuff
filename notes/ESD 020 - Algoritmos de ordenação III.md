---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-08T20:38:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 20: Algoritmos de ordenação III
- - -
## *Insertion sort*

- O **algoritmo de inserção simples** é de ordem O(n²), mas pode ser semelhante a um de O(n) quando o vetor está ordenado ou quase ordenado.
- Esse algoritmo ordena os valores progressivamente, primeiramente com 1 valor, 2, 3, etc.

```cpp
void insertionSort() {
    int k, x, i;
    bool found;
  
    for (k=1; k<=TAM-1; k++) {
        x = A[k];
        i = k-1;
        found = false;
        while (!found && i>=0) {
            if (A[i] > x) {
                troca(&A[i+1], &A[i]);
                i--;
            } else {
                found = true;
            }
        }
    }
}
```

## *Shell sort*

- Esse algoritmo é de ordem O(n log n).
- Opera com subvetores de valores separados por $2\cdot n + 1$ posições.
- Utiliza do *insertion sort* quando o vetor está próximo de ser ordenado.

```cpp
void shellSort() {
    int i, j, k = 1;
    bool found;
  
    do {
        k = k*2+1;
    } while (k<TAM);
  
    do {
        k = k/2;
        for (i=k; i<=TAM-1; i++) {
            j = i-k;
            found = false;
            while (j>=0 && !found) {
                if (A[j] > A[j+k]) {
                    troca(&A[j], &A[j+k]);
                    j = j-k;
                } else {
                    found = true;
                }
            }
        }
    } while (k!=1);
}
```