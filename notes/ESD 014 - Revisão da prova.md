---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-11T18:09:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 14 - Revisão pós-prova
- - -
## Exercícios da prova
**Pilha: `push_dupla(valor1, valor2)`**.
```cpp
void push_dupla (int valor1, int valor2) {
    if (topo >= TAM-2) {
        cout << "Erro" << endl;
        return;
    }
    topo++;
    pilha[topo] = valor1;
    topo++;
    pilha[topo] = valor2;
}
```

**Lista: `conta()`** maiores que 10.
```cpp
void conta() {
    struct no *atual;
    int conta=0;
    atual = lista;
    while (atual!=NULL) {
        if (atual->dado > 10) {
            conta++;
        }
        atual = atual->prox;
    }
    cout << conta;
}
```
## Algoritmos de fila dinâmica
Ao contrário de pilhas dinâmicas, as **filas** apresentam um ponteiro para o início e um para o fim. Ela apresenta as funções `enqueue()`e `dequeue()`.

**Função `enqueue()`**: adiciona um valor ao fim da fila.
```cpp
void enqueue (int val) {
    struct no *novo;
    novo = new (struct no);
    novo->dado = val;
    novo->prox = NULL;
    if (fim == NULL) {
        inicio = novo;
        fim = novo;
    } else {
        fim->prox = novo;
        fim = novo;
    }
}
```

**Função `dequeue()`:** remove o valor no início da fila.
```cpp
void dequeue () {
    struct no *atual;
    atual = inicio;
    if (atual == NULL) {
        cout << "--- FILA VAZIA ---" << endl;
        return;
    }
    inicio = atual->prox;
    cout << "(-) Valor " << atual->dado << " removido" << endl;
    delete(atual);
    if (inicio == NULL) fim=NULL;
}
```