---
disciplina: "[[Estrutura de Dados]]"
data: 2024-03-19
tags:
  - UEPG/ESD
  - aula
---
# Aula 8 - Alocação dinâmica
- - -
- **Variável estática:** são variáveis declaradas explicitamente (ex.: `int a`) e que possuem um identificador ("nome"). Caso seja uma variável global, existirá durante toda a execução do programa.
- **Variável dinâmica:** variáveis não declaradas explicitamente, não possuem identificadores e existem apenas enquanto forem utilizadas.
	- São manipuladas através de ponteiros.

> [!info] **Alocação dinâmica**
> Os comandos a seguir alocam memória para um valor inteiro.
> - "Malloc": `(int *) malloc(sizeof(int))`
> - "New": `new(int)`

- Variáveis retornam valores, ponteiros retornam o conteúdo na memória.

```cpp
#include <iostream>
using namespace std;
  
int a;
int *p, *q;
  
int main() {
    a = 10;
    p = new(int);
    *p = 20;
    q = new(int);
    *q = 30;
  
    cout << a << " " << *p << " " << *q << endl;
    cout << p << " " << q << endl;
}
```
## Variáveis compostas dinâmicas

- **Uso de struct estático.**

```cpp
struct pessoa {
    string nome;
    int idade;
};
  
struct pessoa a;
  
int main() {
    a.nome = "Nome";
    a.idade = 25;
}
```

- **Uso de struct dinâmico.** 

```cpp
struct pessoa {
    string nome;
    int idade;
};
  
struct pessoa *p;
  
int main() {
    p->nome = "Nome";
    p->idade = 25;
}
```