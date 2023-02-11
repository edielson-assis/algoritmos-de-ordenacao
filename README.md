<h1 align="center"> Algoritmos de Ordenação </h1>

Os algoritmos de ordenação são técnicas usadas para organizar dados em uma determinada ordem. 
Essas técnicas são amplamente usadas em diversos campos da computação, incluindo banco de dados, inteligência artificial e ciência de dados.

Os seguintes algoritmos de ordenação serão discutidos neste arquivo:

<p>
✅ Bubble Sort <br>
✅ Insertion Sort <br>
✅ Selection Sort <br> 
✅ Merge Sort <br>
✅ Quick Sort <br>
✅ Heap Sort <br>
</p>

----

<h2>🔹 Bubble Sort </h2>

O Bubble Sort é um algoritmo de ordenação simples que funciona comparando cada par de elementos adjacentes e trocando-os de posição se eles estiverem na ordem errada. 
Este processo é repetido até que todos os elementos estejam organizados na ordem correta. 
O Bubble Sort é considerado um dos algoritmos mais lentos, pois precisa realizar uma comparação para cada elemento na lista.
É um algoritmo ineficiente, pois sua complexidade é O(n^2).

<h2>🔹 Insertion Sort </h2>

O Insertion Sort é outro algoritmo de ordenação simples. 
Ele funciona mantendo uma lista parcialmente ordenada, inserindo cada novo elemento na posição correta dentro dessa lista. 
Esse algoritmo é mais eficiente que o Bubble Sort, mas ainda não é considerado muito eficiente quando se trata de grandes conjuntos de dados.
Possui complexidade de O(n^2) no pior caso, mas pode ser O(n) no melhor caso.

<h2>🔹 Selection Sort </h2>

O Selection Sort é um algoritmo de ordenação que funciona selecionando o elemento menor (ou maior, dependendo da ordem desejada) da lista não ordenada e colocando-o na primeira posição da lista ordenada. 
Esse processo é repetido para cada elemento da lista, resultando em uma lista completamente ordenada.
O nível de complexidade do Selection Sort é O(n^2), tanto para o caso médio quanto para o pior caso.

<h2>🔹 Merge Sort </h2>

O Merge Sort é um algoritmo de ordenação baseado em divisão e conquista. 
Ele divide a lista em sublistas menores, as ordena recursivamente e, em seguida, as mescla para formar a lista ordenada final. 
O Merge Sort é considerado um dos algoritmos mais eficientes, com tempo de execução O(n log n).

<h2>🔹 Quick Sort </h2> 

O Quick Sort é um algoritmo de ordenação baseado no paradigma "divide e conquista". 
Ele funciona selecionando um elemento da lista, chamado de "pivô", e reorganizando a lista de forma que todos os elementos menores que o pivô fiquem antes dele e todos os elementos maiores fiquem depois. 
Em seguida, a lista é dividida em duas sublistas e o processo é repetido recursivamente para cada uma delas, até que a lista fique completamente ordenada.

O Quick Sort tem uma complexidade temporal média de O(n log n) e pode ser mais rápido do que outros algoritmos de ordenação, como o Bubble Sort e o Insertion Sort, em grandes conjuntos de dados. 
No entanto, em casos em que o pivô escolhido é o menor ou maior elemento da lista, o tempo de execução pode ser muito pior, chegando a O(n²).

<h2>🔹 Heap Sort </h2> 

O Heap Sort é um algoritmo de ordenação baseado em uma estrutura de dados chamada Heap. 
Uma heap é uma árvore binária completa, onde cada nó é maior ou igual aos seus filhos. Em uma heap máxima, o nó raiz é o maior elemento da árvore.

O Heap Sort funciona construindo uma heap máxima a partir da lista de elementos a ser ordenada, e depois removendo o nó raiz (que é o maior elemento) e colocando-o no final da lista. 
Esse processo é repetido até que a heap fique vazia e a lista fique completamente ordenada.

O Heap Sort tem uma complexidade temporal de O(n log n), o que o torna mais rápido do que algoritmos como o Bubble Sort e o Insertion Sort, mas mais lento do que o Quick Sort. 
Além disso, ele tem um uso limitado devido à sua necessidade de usar uma estrutura adicional para representar a heap.

------------

## :memo: Licença

Esse projeto está sob a licença [MIT](https://github.com/edielson-assis/algoritmos-de-ordenacao/blob/main/LICENSE).

---

<h2> 🤝 Contribuindo </h2>

<p>
Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identifique com o conteúdo, não deixe de compartilhar.<br>
<br>
Se possível:<br>
⭐️  Star o projeto<br>
🐛 Encontrar e relatar issues<br>
</p>

------------

Disponibilizado com ♥ por [Edielson Assis](https://www.linkedin.com/in/edielson-assis/ "Edielson Assis").
