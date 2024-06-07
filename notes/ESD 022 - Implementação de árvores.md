---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-15T20:35:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 22: Implementação de árvores
- - -
**Árvores binárias de busca** são sempre implementadas com alocação dinâmica.

- **`void insereArvore (int val)`**: insere valor em uma árvore binária de busca.

```cpp
void insereArvore (int val) {
    struct no *atual, *anterior, *novo;
  
    novo = new (struct no); // todo elemento adicionado sera um elemento folha
    novo->dado = val;
    novo->esq = NULL;
    novo->dir = NULL;
  
    if (raiz == NULL) {
        raiz = novo;
        return;
    }
    atual = raiz;
    while (atual != NULL) { // NULL representa uma posicao que nao apresenta elemento
        anterior = atual;
        if (val < atual->dado) atual = atual->esq;
        else atual = atual->dir;
    }
    if (val < anterior->dado) anterior->esq = novo;
    else anterior->dir = novo;
}
```

- **`void insereArvoreSemRepetidos (int val)`**: insere um valor na árvore binária de busca. Em caso de repetição, alerta e não é inserido.

```cpp
void insereArvoreSemRepetidos (int val) {
    struct no *atual, *anterior, *novo;
  
    novo = new (struct no); // todo elemento adicionado sera um elemento folha
    novo->dado = val;
    novo->esq = NULL;
    novo->dir = NULL;
  
    if (raiz == NULL) {
        raiz = novo;
        return;
    }
    atual = raiz;
    while (atual != NULL) { // NULL representa uma posicao que nao apresenta elemento
        anterior = atual;
        if (val < atual->dado) atual = atual->esq;
        else if (val > atual->dado) atual = atual->dir;
        else {
            cout << "Valor " << val << " nao inserido (repetido)" << endl;
            delete(novo);
            return;
        }
    }
    if (val < anterior->dado) anterior->esq = novo;
    else anterior->dir = novo;
}
```

- **`void buscaArvore (int val)`**: busca um valor na árvore binária de busca, imprime algo se encontrar o valor.

```cpp
void buscaArvore (int val) {
    struct no *atual, *anterior;
  
    atual = raiz;
    while (atual != NULL) {
        anterior = atual;
        if (val == atual->dado) {
            cout << "Valor " << val << " encontrado" << endl;
            return;
        } else if (val < atual->dado) atual = atual->esq;
        else atual = atual->dir;
    }
```

- **`void emOrdem ()`**: imprime o conteúdo da árvore binária de busca em ordem.

```cpp
void emOrdem (struct no *atual) {
    if (atual != NULL) {
        emOrdem(atual->esq);
        cout << atual->dado << " ";
        emOrdem(atual->dir);
    }
}
```