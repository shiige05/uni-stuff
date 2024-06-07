---
disciplina: "[[Estrutura de Dados]]"
data: 2024-03-05
tags:
  - UEPG/ESD
  - aula
---
# Aula 4 - Filas
- - -
- **Filas** são estruturas de dados que seguem o padrão FIFO (*first in, first out*), em que valores são inseridos no fim e removidos do início.
- As principais operações realizadas nesse formato são:
	- `insereFila(valor)` - insere um valor ao fim da fila;
	- `removeFila()` - remove um valor do início da fila;
	- `inicioFila()` - retorna o valor do início da fila.

> [!info] Exemplo de fila
> - **Roteadores de internet** têm vários dispositivos conectados ao mesmo tempo, ou seja, várias entradas e apenas uma saída.

## Implementação de filas

### Fila fixa
- A estrutura da fila deve manter o início fixo na posição 0 do vetor enquanto varia o resto da fila.
- Remoções do início da fila necessitam de movimentação de dados.
- Quando a fila não apresenta valores, a variável `fim` armazena -1. A partir do momento em que um valor é inserido, a variável `fim` também se altera para acompanhar a estrutura da fila.

### Fila circular
- O vetor é representado como um círculo, unindo as duas extremidades.
- Variando o valor das posições de início e fim, não há a necessidade de movimentar dados.
- A variável `inicio` representa o primeiro campo não vazio do vetor, e `fim` representa o primeiro valor vazio após o início.
	- Quando um valor é removido, a variável `inicio` aumenta em 1.
	- Quando um valor é inserido, a variável `fim` aumenta em 1.