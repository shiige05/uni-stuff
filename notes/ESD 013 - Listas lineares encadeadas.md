---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-03T20:29:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 13 - Listas lineares encadeadas
- - -
## Função `insereLista()`
```cpp
void insereLista (int valor) {
    struct no *atual, *anterior, *novo;
    novo = new (struct no);
  
    novo->dado = valor;
    atual = lista;
  
    while (atual != NULL && valor > atual->dado) {
        anterior = atual;
        atual = atual->prox;
    }
  
    if (atual == lista) {
        lista = novo;
        novo->prox = atual;
    } else {
        anterior->prox = novo;
        novo->prox = atual;
    }
}
```

## Função `imprimeLista()`
```cpp
void imprimeLista () {
    struct no *atual;
    if (lista == NULL) {
        cout << ": LISTA NAO INICIALIZADA :" << endl;
        return;
    }
    atual = lista;
  
    while (atual != NULL) {
        cout << atual->dado << " ";
        atual = atual->prox;
    }
    cout << endl;
}
```

## Função `removeLista()`
```cpp
void removeValor (int valor) {
    struct no *atual, *anterior;
    atual = lista;
  
    while (atual!=NULL && valor>=atual->dado) {
        if (valor == atual->dado) {
            if (atual == lista) {
                lista = atual->prox;
            } else {
                anterior->prox = atual->prox;
            }
            delete(atual);
            cout << ": VALOR " << valor << " REMOVIDO :" << endl;
            return;
        }
        anterior = atual;
        atual = atual->prox;
    }
}
```