---
disciplina: "[[Estrutura de Dados]]"
data: 2024-04-02T18:50:00
tags:
  - UEPG/ESD
  - aula
---
# Aula 12 - Listas encadeadas
- - -
> [!info] Prova na sala 21

Na maioria das linguagens de programação, existem diversas maneiras de criar e manipular listas de valores. Uma das suas funcionalidades mais importantes para a estrutura de dados é o conceito de **posição**. Entre as múltiplas formas de implementar listas, estão:
- as listas **sobre vetores** - utilizando vetores;
- e as listas **encadeadas** - utilizando vários endereços na memória.

> **Listas sobre vetores**.
> - Possuem tamanho máximo.
> - O acesso a qualquer posição da lista é direto.
> - Pode desperdiçar memória.
> - Cada elemento da lista ocupa menos espaço.

> **Listas encadeadas.**
> - Não apresentam tamanho máximo.
> - Para acessar uma determinada posição, deve-se percorrer todas as anteriores.
> - Não desperdiça memória - utiliza apenas o necessário.
> - Cada elemento da lista ocupa mais espaço (*struct*).

## Variações de listas encadeadas

- **Lista duplamente encadeada:** nesse caso, cada elemento da lista apresenta 3 campos - o endereço anterior, o próprio valor e o próximo endereço.
	- ![[Pasted image 20240403151127.png]]
- **Lista circular**: a diferença nessa implementação é que o último elemento da lista, em vez de apontar para o valor `NULL`, aponta para o primeiro valor. (Obs.: listas circulares não são o mesmo que filas circulares).
	- ![[Pasted image 20240403151221.png]]
- **Lista com cabeçalho:** semelhante a listas encadeadas comuns, porém antes do primeiro elemento há um cabeçalho que fornece algum tipo de informação (ex.: número total de elementos).
	- ![[Pasted image 20240403151244.png]]

> Link: https://excalidraw.com/#json=pXrloggv63x4Glavilciz,nfaqb0vHrcdeWiqKfX-fWg

## Conteúdo para avaliação

- Introdução e tipos abstratos de dados.
- Pilhas, aplicação e algoritmos (vetor e alocação dinâmica).
- Filas circulares e algoritmos (vetor e alocação dinâmica).
- Alocação dinâmica.
- Listas lineares, algoritmos e diferenças.
- Variações de listas encadeadas.