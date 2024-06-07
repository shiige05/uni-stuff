---
disciplina: "[[Estrutura de Dados]]"
data: 2024-02-21
tags:
  - UEPG/ESD
  - aula
---
# Aula 2 - Utilizando vetores
- - -
1. Imprima em ordem direta (do elemento na posição 0 até o elemento na última posição).
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    for (int i=0; i<TAM; i++) {
        cout << vetor[i] << " ";
    }
}
```

```c
#include <stdio.h>
#define TAM 5
int vetor[TAM];

int main() {
    int i;
    printf("Digite os valores: ");
    for (i=0; i<TAM; i++) {
        scanf("%d", &vetor[i]);
    }
    for (i=0; i<TAM; i++) {
        printf("%d ", vetor[i]);
    }
}
```

2. Imprima em ordem inversa (do elemento na última posição até o elemento na posição 0).
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    for (int i=TAM-1; i>=0; i--) {
        cout << vetor[i] << " ";
    }
}
```

3. Procure o maior elemento do vetor.
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    int maior = vetor[0];
    for (int i=1; i<TAM; i++) {
        if (vetor[i]>maior) {
            maior = vetor[i];
        }
    }
    
    cout << "Maior valor: " << maior;
}
```

4. Procure o menor elemento do vetor.
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    int menor = vetor[0];
    for (int i=1; i<TAM; i++) {
        if (vetor[i]<menor) {
            menor = vetor[i];
        }
    }
    
    cout << "Menor valor: " << menor;
}
```

5. Some todos os elementos do vetor.
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    int soma=0;
    for (int i=0; i<TAM; i++) {
        soma += vetor[i];
    }
    
    cout << "Soma: " << soma;
}
```

6. Calcule a média entre todos os valores do vetor.
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetor[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetor[i];
    }
    int soma = 0;
    for (int i=0; i<TAM; i++) {
        soma += vetor[i];
    }
    cout << "Media: " << (float) soma/TAM;
}
```

BÔNUS
```cpp
#include <iostream>
using namespace std;
const int TAM=5;
int vetorA[TAM];
int vetorB[TAM];

int main() {
    cout << "Digite os valores: ";
    for (int i=0; i<TAM; i++) {
        cin >> vetorA[i];
    }
    for (int i=0; i<TAM; i++) {
        vetorB[TAM-1-i] = vetorA[i];
    }
    
    cout << "Vetor A: ";
    for (int i=0; i<TAM; i++) {
        cout << vetorA[i] << " ";
    }
    cout << endl;
    
    cout << "Vetor B: ";
    for (int i=0; i<TAM; i++) {
        cout << vetorB[i] << " ";
    }
}
```