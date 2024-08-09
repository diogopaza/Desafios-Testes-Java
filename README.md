# Desafios-Testes-Java

<h4>Exercicio 1</h4>
<p>Esse desafio envolve a API de Stream do Java para executar operações de filtragem, ordenação e mapeamento e também expressões lambda para a manipulação de coleções.</p>
<p>Ao final pede-se qual opção abaixo está correta:</p>
<ol>
  <li>red, blue, black</li>
  <li>yellow, orange</li>
 <li>kcalb, eulb, der</li>
  <li>der, eulb, kcalb</li>
</ol>

<p>Solucao: a primeira parte do codigo cria uma lista de <emph>string</emph> usando <emph>Arrays.asList</emph> ou seja uma lista parcialmente mutavel, que nao pode adicionar nem remover elementos.</p>
<p>O codigo cria uma <emph>Stream</emph> (fluxo - uma <emph>Stream</emph> é uma sequencia de elementos que oferece varias opcoes que podem ser aplicadas de maneira declarativa) da lista, e logo apos usa o metodo <emph>filter</emph>, este retorna apenas os valores da lista menores que 6 (no nosso exemplo red,black,blue)</p>

<hr>
