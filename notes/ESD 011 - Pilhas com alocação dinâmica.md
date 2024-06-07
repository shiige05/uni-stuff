---
disciplina: "[[Estrutura de Dados]]"
data: 2024-03-27T20:35:00
tags:
  - UEPG/ESD
  - aula
---
# ESD 011 - Pilhas com alocação dinâmica
- - -
## Função `pop()`
```cpp
void pop() {
    struct no *apaga;
    if (topo == NULL) {
        cout << "> PILHA VAZIA <" << endl;
        return;
    }
    apaga = topo;
    topo = topo->prox;
    delete(apaga);
}
```

## Função `imprime()`
```cpp
void imprime() {
    struct no *atual;
    if (topo == NULL) {}
        cout << "> PILHA VAZIA <" << endl;
        return;
    }
    atual = topo;
    while (atual != NULL) {
        cout << atual->dado << " ";
        atual = atual->prox;
    }
    cout << endl;
}
```

> [!tip] Para a implementação da fila através de alocação dinâmica, serão necessários dois *structs* globais, o ***inicio*** e o ***fim***.