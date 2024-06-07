---
disciplina: "[[Estrutura de Dados]]"
data: 2024-06-05T20:33:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 26: *Heapsort*
- - -
O ***heapsort*** é um algoritmo que usa a estrutura de *heaps* para organizar a ordem de um vetor. É um algoritmo recursivo com eficiência muito próxima a do *quicksort*.

```cpp
#include <iostream>
using namespace std;
const int TAM=10;
int tamHeap;
int A[10];
  
void gera() {
    int i;
    srand(time(NULL));
    for (i=0; i<TAM; i++) {
        A[i] = rand();
    }
}
  
void imprime() {
    int i;
    cout << "> Vetor: ";
    for (i=0; i<TAM; i++) cout << A[i] << " ";
    cout << endl;
}
  
void troca (int *a, int *b) {
    int aux;
    aux = *a;
    *a = *b;
    *b = aux;
}
  
void heapify (int i) {
    int l = (2*i)+1, r = (2*i)+2, max;
    if (l<tamHeap && A[l]>A[i]) max = l;
    else max = i;
    if (r<tamHeap && A[r]>A[max]) max = r;
    if (max!=i) {
        troca(&A[i], &A[max]);
        heapify(max);
    }
}
  
void buildHeap() {
    tamHeap = TAM;
    for (int j = (TAM/2)-1; j>=0; j--) heapify(j);
}
  
void heapSort() {
    buildHeap();
    for (int k=TAM-1; k>=1; k--) {
        troca(&A[0], &A[k]);
        tamHeap--;
        heapify(0);
    }
}
  
int main() {
    gera();
    imprime();
    heapSort();
    imprime();
}
```