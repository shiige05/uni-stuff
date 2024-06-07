---
disciplina: "[[Estrutura de Dados]]"
data: 2024-05-22T20:41:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 24: Árvores binárias com manipulação de arquivos
- - -
- Árvores binárias podem ser utilizadas para ler arquivos de texto. Nesse caso, a árvore será utilizada para ler palavras e contar qual delas se repete mais frequentemente.
	- ![[ESD 024 - Árvores binárias com manipulação de arquivos 2024-05-23 14.31.06.excalidraw|500]]

```cpp
#include <string.h>
#include <iostream>
using namespace std;
  
struct no {
    char dado[50];
    int contador;
    struct no *esq, *dir;
};
struct no *raiz = NULL;
int maior = 0;
char palavraFreq[50];
  
void emOrdem (struct no *atual) {
    if (atual != NULL) {
	    emOrdem(atual->esq);
	    cout << atual->dado << ": " << atual->contador << endl;
    if (atual->contador > maior) {
	    maior=atual->contador;
	    strcpy(palavraFreq, atual->dado);
    }
    emOrdem(atual->dir);
    }
}
  
void insere (char val[]) {
    struct no *atual, *anterior, *novo;
    novo = new (struct no);
    strcpy(novo->dado, val);
    novo->esq = NULL;
    novo->dir = NULL;
    novo->contador = 1;
    if (raiz == NULL) {
	    raiz = novo;
	    return;
    }
    atual = raiz;
    while (atual != NULL) {
	    if (strcmp(val, atual->dado)==0) {
		    atual->contador++;
		    delete(novo);
		    return;
	    }
	    anterior = atual;
	    if (strcmp(val, atual->dado)<0) {
		    atual=atual->esq;
	    } else atual = atual->dir;
    }
    if (strcmp(val, anterior->dado)<0) {
	    anterior->esq = novo;
    } else anterior->dir = novo;
}
  
int main() {
    char palavra[50];
    FILE *fp;
    fp = fopen("texto.txt", "r");
    if (fp == NULL) {
	    cout << "Erro fds" << endl;
	    return 0;
    }
    while (!feof(fp)) {
	    fscanf(fp, "%s", palavra);
	    insere(palavra);
    }
    fclose(fp);
    emOrdem(raiz);
    cout << "\nPalavra mais frequente: " << palavraFreq << endl;
}
```