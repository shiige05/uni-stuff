---
disciplina: "[[Estrutura de Dados]]"
data: 2024-03-20
tags:
  - UEPG/ESD
  - aula
---
# Aula 9 - Listas lineares ordenadas
- - -
- **Função `insereLista()`**: adiciona um valor na posição adequada do vetor.
```cpp
void insereLista(int val) {
    int i;
    if (tamanho == TAM) {
        cout << "> Lista cheia" << endl;
        return;
    }
    for (i=tamanho; i>0 && lista[i-1]>val; i--) {
        lista[i] = lista[i-1];
    }
    lista[i] = val; tamanho++;
    cout << "> Valor " << val << " inserido" << endl;
}
```