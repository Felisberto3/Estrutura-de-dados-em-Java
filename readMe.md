# Lista Ligada

# Lista Simplesmente Ligada

## A lista com ponteiro: 
  é uma sequência de nós (células) ligados
## Nó: 
### .É o elemento básico da estrutura de dados. 

### .Cada nó consistindo em um elemento da lista e um ponteiro para o próximo nó da lista.


# Vantagens

  Vetores (listas implementadas com array) são uma excelente alternativa ao uso direto de arrays em Java,
porém para algumas tarefas eles podem não ser ecientes, justamente por esse fato.
Adicionar um elemento na primeira posição de um Vetor, por exemplo, consome muito tempo, pois temos
de deslocar todos os outros elementos uma posição para a frente. A performance dessa operação degrada
a medida que a quantidade de elementos do nosso vetor cresce: ela consome tempo linear em relação ao
número de elementos.
  Analogamente, remover um elemento da primeira posição implica em deslocar todos os outros elementos
que estão na sua frente para trás.
  Em alguns casos, queremos uma implementação de Lista na qual a operação de adicionar ou a de remover
um aluno na primeira posição seja computacionalmente efciente


# Lista Duplamente Ligada
  Para o método que remove o elemento do m da Lista ter consumo de tempo constante, a última célula
deve se referir a penúltima. Isso é possível se utilizarmos o esquema de Lista Duplamente Ligada, no qual as
células possuem referências tanto para a próxima e quanto para a célula anterior.