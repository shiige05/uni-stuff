---
data: 2024-04-08 13:29
tags:
  - UEPG
---
# Estrutura de Dados - Prova I
- - -
## Introdução e tipos abstratos de dados

O conceito **estrutura de dados** se refere às estruturas necessárias para que um programa seja montado e executado de forma eficiente, e inclui a otimização de algoritmos (ordenação, busca) e a organização de dados. A estrutura de dados também se preocupa com o desempenho do programa, e frequentemente implementa recursos como a recursividade, vetores e alocação dinâmica a seu favor.

**Tipos de dados** em linguagens de programação são conjuntos de valores e operações que podem ser feitas sobre esses dados. Alguns desses tipos de dados incluem: valores numéricos inteiros, reais (*floats*), caracteres e booleanos. Por exemplo, um inteiro de 16 bits pode assumir valores entre -32768 a 32767, e pode passar por operações matemáticas como adição e subtração, etc.

Já os **tipos abstratos de dados** são aqueles que não são definidos especificamente na linguagem de programação, mas podem ser implementadas num programa após planejamento. Por exemplo, pilhas e filas são tipos abstratos não definidos inicialmente nas linguagens de programação, porém possíveis através de funções e estruturas de dados simples.

- **Estruturas de dados simples:** entre os tipos de variáveis mais utilizados em estruturas de dados, estão as variáveis simples e as compostas. Enquanto as simples armazenam apenas um valor único de dado (número, caractere), as variáveis compostas são capazes de armazenar múltiplos valores simultaneamente, que podem ou não ser do mesmo tipo.
	- **Vetores:** conjunto finito de variáveis do mesmo tipo que podem ter uma ou mais dimensões.
		```cpp
		int vetor[5] = {1, 2, 3, 4, 5};
		```
	- **Registros:** conjunto finito de variáveis de tipos diferentes. Em C, é implementado com a palavra `struct`.
		```cpp
		struct registro {
			int numero;
			char[10] nome;
		};
		```

## Pilhas, aplicação e algoritmos

A **pilha** é uma estrutura de dado em que os valores são “empilhados” de baixo para cima. Seguindo essa lógica, quando é necessário tirar um elemento da pilha, o valor que está no topo será removido. Por esse motivo, a estrutura de pilhas também pode ser chamada de **LIFO** (*last in, first out*).

- **Exemplo:** Considere uma pilha em que são inseridos, respectivamente, os valores 1, 2, 3, 4 e 5. O primeiro valor a ser removido, nesse caso, seria o número 5, já que foi o último a ser “empilhado”. Após ele seria o 4, 3, 2 e 1, nessa ordem.

As duas funções básicas mais importantes a serem implementadas numa pilha são as funções `push()` e `pop()` que, respectivamente, insere e remove um valor da pilha. Também é recomendado um variável global inteira que acompanha o tamanho da pilha, para facilitar a sua manipulação.

- **Função `push()`:** essa função geralmente tem como parâmetro o valor a ser adicionado ao topo da pilha. Sempre que a função e chamada, é recomendado verificar se a pilha está cheia ou não (no caso de implementação em vetor). Após isso, caso a pilha não esteja cheia, a variável do tamanho (que indica a posição do topo da pilha no vetor) é incrementado e o valor é inserido no vetor.
	```cpp
	void push (int valor) {
		if (topo == TAM-1) {
			cout << "Pilha cheia" << endl;
			return;
		}
		topo++;
		pilha[topo] = valor;
		cout << "Valor inserido" << endl;
	}
	```

- **Função `pop()`:** essa função não apresenta um parâmetro justamente por ser uma pilha, em que o valor a ser removido é pré-determinado. A única verificação que é necessária nessa função é caso a pilha não possua nenhum valor armazenado. Para “remover” um valor da pilha, basta decrementar o valor que indica o topo da pilha.
	```cpp
	void pop () {
		if (topo == -1) {
			cout << "Pilha vazia" << endl;
			return;
		}
		topo--;
		cout << "Valor removido" << endl;
	}
	```

> [!info] Uma das implementações mais comuns da estrutura de pilhas é a verificação de expressões matemáticas.
> Por exemplo, para verificar se a expressão $[(3*4)/2]+[(5-3)/(4/2)]$ está escrita de forma correta, é aplicada a funcionalidade de pilha com os delimitadores matemáticos (chaves, colchetes e parênteses). Para todo delimitador que é aberto na expressão, ele é colocado na pilha, e para todo delimitador que é fechado, o valor é removido dela.
> Em uma expressão escrita corretamente, não deve sobrar nenhum valor na pilha e o valor removido deve corresponder ao mesmo delimitador que foi aberto previamente.

## Filas circulares e algoritmos

**Filas** são estruturas de dados que também permitem a inserção e remoção de valores. No entanto, diferentemente de pilhas, o valor a ser removido sempre é o primeiro valor que foi inserido. Por isso, as filas também são conhecidas pelo termo **FIFO** (*first in, first out*).

As principais funções implementadas em algoritmos de filas são:
- **Inserir valor:** `insereFila(valor)`, que insere um valor ao fim da fila;
- **Remover valor:** `removeFila()`, que remove um valor do início da fila;
- **Início da fila:** `inicioFila()`, que retorna o valor que está no início da fila.

> [!info] Exemplos de fila
> - **Roteadores de internet** possuem filas para organizar a sequência de acessos quando são compartilhados por vários dispositivos ao mesmo tempo.
> - **Lojas, bancos e locais públicos** tipicamente organizam seus clientes em fila, que são atendidos de acordo com a ordem de chegada.

Há **2 tipos de implementação** da estrutura de filas: a **fixa** e a **circular**.

- Em **filas fixas**:
	- A estrutura da fila deve o início fixo na posição 0 do vetor enquanto varia o resto da fila.
	- Remoções do início da fila necessitam que os dados se movimentem.
	- Quando a fila não apresenta valores, a variável `fim` armazena -1. A partir do momento em que um valor é inserido, a variável `fim` também se altera para acompanhar a estrutura da fila.
- Em **filas circulares**:
	- O vetor é representado como um círculo, unindo as duas extremidades (início e fim).
	- Variando o valor das posições de início e fim, não há a necessidade da movimentação de dados.
	- A variável `inicio` representa o primeiro campo não vazio do vetor, e `fim` representa o primeiro valor vazio após o início. A variável `inicio` incrementa em 1 quando um valor é removido e a variável `fim` é incrementada em 1 quando um valor é inserido.

A implementação das funções de filas ocorre da seguinte forma (é recomendado inicializar as variáveis globais `inicio`, `fim` e `cont`):

- **Função `enqueue()`:** essa função adiciona o valor indicado ao fim da fila, aumenta o contador do tamanho da fila e altera a posição do fim da fila.
	```cpp
	void enqueue(int valor) {
		if (cont == TAM) {
			cout << "Fila cheia" << endl;
			return;
		}
		cont++;
		fila[fim] = valor;
		if (fim == TAM-1) fim=0;
		else fim++;
	}
	```
- **Função `dequeue()`:** essa função remove o valor que está no início da fila, decrementa o contador de tamanho e desloca o início da fila.
	```cpp
	void dequeue() {
		if (cont == 0) {
			cout << "Fila vazia" << endl;
			return;
		}
		cont--;
		if (inicio == TAM-1) inicio=0;
		else inicio++;
	}
	```
- **Função `inicio()`:** retorna o valor que está no início da fila.
	```cpp
	void inicio() {
		if (cont == 0) {
			cout << "Fila vazia" << endl;
			return;
		}
		cout << "Inicio da fila: " << fila[inicio] << endl;
	}
	```

## Alocação dinâmica e ponteiros

Geralmente, as **variáveis** que utilizamos em programas são declaradas explicitamente, isto é, especifica-se o tipo e nome da variável (junto com seu valor, opcionalmente). Ex.: `int num = 2`. Quando uma variável é declarada dessa maneira, diz-se que ela é uma **variável estática**. Quando uma variável é global, ela existe durante toda a execução do código, já se for uma variável local, ela existe apenas durante a execução da função.

Porém, existem também as variáveis que não são declaradas explicitamente e são criadas apenas quando são utilizadas, denominadas **variáveis dinâmicas**. Essas variáveis não apresentam identificadores (ou nomes), portanto são referenciadas apenas através de **ponteiros**. 
- Ponteiros apontam para algum lugar específico na memória, e quando são associados a uma variável, apontam para o local na memória em que a variável está. Por isso, ao criar um ponteiro para uma variável, é necessário indicar o tipo de variável que ele aponta. Ex.: `int *p`.
- Variáveis retornam valores, ponteiros retornam o conteúdo na memória.

Uma variável dinâmica pode ser criada de várias maneiras, como as seguintes:
- **Método `malloc()`:** pode ser usado em C e C++.
	```cpp
	p = (int *) malloc (sizeof(int)); // para um ponteiro p
	```
- **Método `new()`:** apenas pode ser usado em C++.
	```cpp
	p = new(int); // para um ponteiro p
	```

> Como uma variável dinâmica não tem um identificador, o valor passado para o ponteiro `*p` deve ser o endereço retornado pelos comandos `new()` e `malloc()`.

Da mesma maneira que variáveis simples, **variáveis compostas também podem ser criadas dinamicamente**. Caso seja criado um registro nomeado `cadastro`, por exemplo, o comando `cad1 = new(cadastro)` (com `cad1` sendo um ponteiro) criará uma variável dinâmica de tipo `cadastro`.

O acesso aos campos dos *structs* também é realizado de forma semelhante. No caso de variáveis estáticas, para passar um valor para um dos campos do registro utiliza-se a sintaxe `nome_var.campo`. Já para variáveis compostas dinâmicas, esse mesmo processo é feito através de `nome_var->campo`, com o sinal gráfico `->`.
- Por exemplo, a representação `p->idade` representa o campo `idade` da *struct* apontada pelo ponteiro `p`.

## Listas lineares, algoritmos e diferenças

**Listas lineares** são estruturas de dados que representam uma sequência de elementos de mesmo tipo, em que a ordem entre esses elementos é preservada. As listas podem permitir diversas operações como inserção, remoção e acesso linear aos seus elementos. Podem também ser de diversos tipos - listas ordenadas, listas encadeadas, etc.

As **listas lineares ordenadas** são listas que, ao inserir valores nela, automaticamente realiza o processo de ordenação (crescente ou decrescente) entre os seus elementos. Entre as diversas funções que podem ser aplicadas a esse tipo de lista, as mais comuns são:
- **Inserção `insereLista()`:** insere um elemento na posição adequada dentro da lista. Geralmente também verifica se a lista está cheia (no caso de um vetor).
	- Percorre a lista do começo ao fim até encontrar um elemento maior que o que deve ser inserido. Desloca todos os valores seguintes para a frente e insere o valor na posição correta.
- **Remoção `removeValor(int val)`:** busca e remove (caso exista) um elemento especificado da lista.
	- Percorre toda a lista do início ao fim e para quando encontrar o valor indicado. Nesse caso, desloca todos os elementos seguintes para trás, sobrescrevendo o valor removido. Caso encontre um valor maior mas não o valor exato, retorna “valor não encontrado”.
- **Recuperar posição `recuperaLista(int pos)`:** retorna o valor do elemento situado na posição especificada.
	- Encontra a posição indicada da lista e imprime o valor correspondente.
- **Buscar elemento `buscaLista(int val)`:** busca e retorna a posição de um elemento da lista.
	- Realiza a mesma busca do processo de remoção, porém apenas retorna o valor da posição do elemento ou “valor não encontrado”.
- **Imprimir lista `imprime()`:** exibe todos os elementos da lista.
	- Percorre toda a lista imprimindo cada um dos valores em ordem.

Entre as múltiplas formas de implementar lista, estão as:
- **listas sobre vetores**: que utilizam vetores.
- e as **listas encadeadas**: que utilizam vários endereços na memória.

As principais características e diferenças entre elas são as seguintes:

| **Listas sobre vetores**                       | **Listas encadeadas**                                                           |
| ---------------------------------------------- | ------------------------------------------------------------------------------- |
| Possuem um tamanho máximo.                     | Não apresentam um tamanho máximo.                                               |
| O acesso a qualquer posição da lista é direto. | Para acessar uma determinada posição,<br>deve-se percorrer todas as anteriores. |
| Pode desperdiçar memória.                      | Não desperdiça memória - utiliza apenas<br>o necessário.                        |
| Cada elemento da lista ocupa menos espaço.     | Cada elemento da lista ocupa mais espaço.                                       |

A implementação de **listas encadeadas** geralmente é realizada da seguinte maneira:
1. É criado um ponteiro `*inicio` que aponta (inicialmente) para `NULL`.
2. Cada elemento da lista encadeada é um registro com dois campos: um campo que contém o próprio valor armazenado na lista e um campo que contém uma referência para o próximo elemento (`prox`). A referência `prox` em cada nó pode ser implementada através de um ponteiro ao próximo elemento.
	```cpp
	struct no {
		int dado;
		struct no *prox;
	};
	struct no *lista = NULL;
	```
3. O primeiro elemento é apontado por um ponteiro externo à lista, que indica em que endereço de memória a lista começa. Isso só é necessário para o próximo elemento, já que os seguintes são localizados através dos campos `prox`.

![[ESD - P1 Resumo 2024-04-09 14.23.31.excalidraw|800]]
## Variações de listas encadeadas

Entre as diversas implementações de **listas encadeadas**, existem algumas que apresentam modificações dedicadas para a aplicação em casos específicas.

- **Lista duplamente encadeada:** nesse caso, cada elemento da lista apresenta 3 campos - o endereço do elemento anterior, o valor armazenado e o endereço do próximo.
	- ![[ESD - P1 Resumo 2024-04-09 14.28.55.excalidraw|700]]
- **Lista circular:** a diferença nessa implementação é que o último elemento da lista, em vez de apontar para o valor `NULL`, aponta para o primeiro valor. (Obs.: listas circulares não são o mesmo que filas circulares).
	- ![[ESD - P1 Resumo 2024-04-09 14.35.54.excalidraw|700]]
- **Lista com cabeçalho:** semelhante a listas encadeadas comuns, porém antes do primeiro elemento há um cabeçalho que fornece algum tipo de informação (ex.: número total de elementos).
	- ![[ESD - P1 Resumo 2024-04-09 14.38.38.excalidraw|700]]