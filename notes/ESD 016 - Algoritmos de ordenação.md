---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-17T20:40:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 16: Algoritmos de ordenação
- - -
## *Bubble sort*

- O ***bubble sort*** é um algoritmo do tipo **0(n^2)**, em que o tempo de execução aumenta exponencialmente de acordo com o número de elementos no vetor. Portanto não é tão eficiente.
- Compara pares consecutivos e move os maiores valores para o fim do vetor.
- Encerra quando chega aos últimos 2 valores a serem ordenados.

```cpp
void bubble() {
    int pass=1, i, temp;
    bool sorted = false;
    while (!sorted && pass<TAM) {
        sorted = true;
        for (i=0; i<=TAM-pass-1; i++) {
            if (A[i] > A[i+1]) {
                troca(&A[i], &A[i+1]);
                sorted = false;
            }
        }
        pass++;
    }
}
```

## *Quick sort*

- O ***quick sort*** é um algoritmo do tipo **0(n log n)**, sendo assim mais eficiente.
- Primeiramente, divide o vetor em duas partes de acordo com um valor tomado como **pivô**, valores menores e maiores. Em seguida, aplica o mesmo método com os dois subvetores resultantes. Isso ocorre sucessivamente até o vetor estar ordenado.
- Para um *quick sort* efetivo, é ideal que o pivô divida o vetor em duas partes de tamanhos semelhantes.

```cpp
int partition(int p, int r) {
    int piv = A[p];
    int i = p-1;
    int j = r+1;
    while (true) {
        do {
            j--;
        } while (A[j]>piv);
        do {
            i++;
        } while (A[i]<piv);
        if (i<j) {
            troca(&A[i], &A[j]);
        } else {
            return j;
        }
    }
}
  
void quick(int p, int r) {
    if (p<r) {
        int q = partition(p,r);
        quick(p,q);
        quick(q+1,r);
    }
}
```