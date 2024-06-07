---
disciplina: "[[Estrutura de Dados]]"
data: 2024-03-26
tags:
  - UEPG/ESD
  - aula
---
# Aula 10 - Listas encadeadas
- - -
## Listas encadeadas

- Dentro da memória de um computador, os elementos de uma lista encadeada indicam a posição da memória que o próximo elemento ocupa.
	- Por exemplo, com uma lista composta por 7, 20 e 28:
		- 7 + posição do 20;
		- 20 + posição do 28;
		- 28 + aponta para `NULL` (ou aterramento).
- Porém, não há elemento que aponte para a posição do primeiro elemento. Então é necessário um elemento singular, ao contrário dos pares anteriores, que indique o início da lista.
- Esse elemento singular é declarado explicitamente, alocado estaticamente, enquanto os outros pares valor-posição são alocados dinamicamente. A esses pares se dá o nome de **"nó"**, de tipo `struct`.
- O nó apresenta a seguinte estrutura:
```cpp
struct no {
	int dado;
	struct no *prox; // isso nao indica que *prox é um struct, mas sim que o ponteiro aponta para um struct
};
```
- O ponteiro que indica o início da lista é denominado **"lista"**:
```cpp
struct no *lista=NULL;
```
- Ambas essas estruturas são declaradas no cabeçalho do programa, e os nós são criados dinamicamente, apenas quando necessários.

> [!tip] Avaliação de Estrutura de Dados - 9 de abril

### Pilha
```cpp
#include <iostream>
using namespace std;
struct no {
    int dado;
    struct no *prox;
};
struct no *pilha = NULL; // indica o topo da pilha

void push (int val) {
    struct no *novo;
    novo = new (struct no);
    novo->dado = val;
    novo->prox = pilha; // atribuicao entre dois ponteiros = ambos apontam ao mesmo endereco
    pilha = novo;
}
```