# Programa Santander Coders 2022 – Java

## Aula 01

- [x] Declaração e atribuição de valores em variáveis
- [x] Visualizar resultado no terminal
- [x] Tipos primitivos de java
- [x] Operadores aritméticos [+ - * /]
- [x] Operador cast: `(float)`

[Documentação Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

**Ordem de prioridade em java**

- 1º tipo da variável;
- 2º seu nome;
- 3º atribuir um valor à variável.

```java
String nome = "Pamela";
```
**Run e Terminal**

Incluir no código para iniciarmos o Run:
```java
public static void main (String[] args){}
```

Para visualizarmos o resultado no terminal:
```java
System.out.println(soma);
```

**Tipos de dados primitivos**

São 8 tipos e suas diferenças são quantos dados são possíveis armazenar em cada um deles:

Númericos:
- byte
- short
- int (números inteiros = 1,2,3);
- long 
- float (números decmais = 0.1, 2.5);
- double

Outros:
- boolean (valores lógicos = true or false)
- char

### Atividade: aula_01.java

```java
public class Main {

    public static void main(String[] args) {
      
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
    }

}
```
Resultado:
5
1
6
1.5
> Podemos usar a operação cast: `(float)` para representar um resultado int (número inteiro), como float (número decimal)
_____

## Aula 02
- [x] Nomes de variáveis
- [x] Algoritmos
- [x] Tipo de dados: boolean (true or false)
- [x] Operadores lógicos && (and) e || (or)
- [x] Operador ternário


**nomesDeVariaveis**

Para uma melhor visualização dos nomes das variáveis `saoFeitasDessaForma`. E não é recomendado iniciar com números ou caracteres especiais.

**Algoritmos**

Uma sequência de passos a ser seguida.

### Atividade: aula_02_a.java
```java
public class aula02 {

  public static void main (String[] args){
    //variável boolean (true or false)  
    boolean fimDeSemana = true;
    boolean fazendoSol = true;
    boolean vamosAPraia = fimDeSemana && fazendoSol;
    System.out.println(vamosAPraia);  
  }
 
}
```

Resultado:
True

Código | Descrição
-|-
&& | e (and)
![image](https://user-images.githubusercontent.com/108991648/189492789-dabe6dd0-849e-49be-b001-c824b3fb6697.png) | ou (or)

### Atividade: aula_02_b.java

```java
public class aula_02_b {

    public static void main (String[] args){
         //variável boolean (true or false)  
        boolean fimDeSemana = false;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "È fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
```
Resultado:
false
Não é fim de semana


**Operador ternário**
1º termo: item lógico `fimDeSemana ?`
- Seguido ? (if/se) + texto + : (else/se não) + texto

2º termo: valor item lógico "true" `"È fim de semana"` 
3º termo: valor item lógico "false" `"Não é fim de semana"`

```java
String mensagem = fimDeSemana ? "È fim de semana" : "Não é fim de semana";
```

Código | Descrição
-|-
? | if/se
: | else/se não
_______

## Aula 03

- [x] Estruturas condicionais: 
  - bloco if/else
  - mais de uma condição if/else/if/else
  - estrutura `switch()`
  - `case`, `break;` and `default`

### Atividade: aula_03_a.java

Utilizando if e else

  ```java
public class aula_03_a {
    public static void main (String[] args){
        
        int nota = 70;
        
        if (nota >= 70){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Não aprovado!");
        }
}
}
```
Resultado:
Aprovado!

### Atividade: aula_03_b.java

- Utilizando if e else para mais sequências
- Switch, gerar aprovado ou reprovado
- break, travar a análise onde encontrar o resultado.
-  default, caso não encontre o resultado.


```java
public class aula_03_b {
    public static void main (String[] args){

        int resultado = 50;
        String nota;
        //A 80 B 70 C 60 D <59
        
        if (resultado >= 80){
            nota = "A";
        } else if (resultado < 80 && resultado >=70){
            nota = "B";
        } else if (resultado < 70 && resultado >=60){
            nota = "C";;
        } else if (resultado < 60 && resultado >= 0){
            nota = "D";
        } else {
            nota = "";
        }

        switch (nota) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Nota inválida!");
        }
}
}
```

Resultado:
Reprovado
_________

## Aula 04

- [x] Manipulação de String:
  - letras maiúscula;
  - letras minúsculas;
  - quantos caracteres a string possui

- [x] Manipulação de Datas:
  - Horário, dia, hora e mês

### Atividade: aula_04_a.java

**maiúsculas**

`System.out.println(nomeDaVariavel.toUpperCase());`
    
**minúsculas**

`System.out.println(nomeDaVariavel.toLowerCase());`

**contagem caracteres**

 `System.out.println(nomeDaVariavel.length());`

**comparar Strings**

`System.out.println(nomeDaPrimeiraVariavel.equals(nomeDaSegundaVariavel));`

*Ignorando maiúsculas e minúsculas*
`System.out.println(nomeDaPrimeiraVariavel.equalIgnoreCase(nomeDaSegundaVariavel));`

```java
public class aula_04_a {
    public static void main (String[] args){

        String name = "Pamela";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

}
}
```

Resultado:
PAMELA
pamela
6

### Atividade: aula_04_b.java

**Importar dados de Datas**

import java.time.LocalDate;

**Printf**

Define o formato e depois define os valores

`System.out.printf("")`


**Dia da semana**

```java
LocalDate hoje = LocalDate.now();
System.out.println(hoje.getDayOfWeek());
```

```java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class aula_04_b {
    public static void main (String[] args){
        //Olá, [nome]. Hoje é [dia-da-semana], Bom Dia/Boa Tarde/Boa Noite!

        String name = "Pamela";

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); 
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";
        } else if (agora.getHour() >=18 && agora.getHour() < 24){
            saudacao = "boa noite!";
        } else {
            saudacao = "Olá";
        }

        // %s = argumento de string 
        // %n = quebra de linha 
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", name, diaSemana, saudacao);
    }
}
```

Resultado:
Olá, Pamela. Hoje é domingo, boa tarde!.

_________

## Aula 05

- [x] Laços númericos
    - Repetir trechos de um código`
    - laço `for`
    - Variar de 01 em 01, de 02 em 02 etc.;
    - Laço aninhado

### Atividade: aula_05_a.java

- Variar de 1 em 1

```java
       for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
```
- Variar de 2 em 2, em números ímpares pois iniciei em 1

```java
       for (int i = 1; i <= 10; i+=2){
            System.out.println(i);
        }
```
```java
public class aula_05_a {
    
    public static void main (String[] args){
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variável que inicia em 1, e vai até 10, mudando de 1-por-1, faça:

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
```

Resultado:
 1 2 3 4 5 6 7 8 9 10

### Atividade: aula_05_b.java

- Aninhar mais de um laço utilizar as letras i, j, k e l

```java
    public class aula_05_b {
    
    public static void main (String[] args){
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variável que inicia em 1, e vai até 10, mudando de 1-por-1, faça:

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
            System.out.println(j + " x " + i + " = " + j * i);
            }
        }
    }
}
```
Resultado:
1 x 1 = 1
2 x 1 = 2
3 x 1 = 3
4 x 1 = 4
5 x 1 = 5
6 x 1 = 6
7 x 1 = 7
8 x 1 = 8
9 x 1 = 9
10 x 1 = 10

1 x 2 = 2
2 x 2 = 4
3 x 2 = 6
4 x 2 = 8
5 x 2 = 10
6 x 2 = 12
7 x 2 = 14
8 x 2 = 16
9 x 2 = 18
10 x 2 = 20

...

__________

## Aula 06
- [x] Vetores ou Arrays [listas]
- [x] Menor, Maior e Média

Java é uma linguagem fortemente tipada, ao declararmos uma array seu tipo não deve ser mesclado, por exemplo, não podemos juntar `int` com `String`.


### Tipos de Arrays - Atividade: aula_06**
- Informar no início:
    - Tipo de array: int, String, float;
    - O tamanho 

#### aula_06_a.java

```java
public class aula_06_a {
    
    public static void main(String[] args) {

        //mencionar o tipo da array {int, Sting, float...}
        // [5] tamanho da array
        int[] numeros = new int [5];

        //índices == posição da array [0] [1] [2] [3] [4] índice n-1
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;
        numeros [4] = 5;

        //acessar os elementos dentro da array: laço for
        // numeros.lenght == tamanho da array (indicado no início [5])
        for (int i=0; i < numeros.length; i++)
            System.out.println(numeros[i]);
    }
}
```

Resultado:
1 2 3 4 5

#### aula_06_b.java

```java
public class aula_06_b {
    
     public static void main(String[] args) {

        //mencionar o tipo da array {int, Sting, float...}
        // [5] tamanho da array
        String[] letras = new String [5];

        //índices == posição da array [0] [1] [2] [3] [4] índice n-1
        // por ser String "assim"
        letras [0] = "A";
        letras [1] = "B";
        letras [2] = "3";
        letras [3] = "H";
        letras [4] = "5";

        //acessar os elementos dentro da array: laço for
        // numeros.lenght == tamanho da array (indicado no início [5])
        // int e var funcionam
        for (var i=0; i < letras.length; i++)
            System.out.println(letras[i]);
    }
}
```

Resultado:

A, B, 3, H, 5

#### aula_06_c.java

- Sem informar o tamanho da array
    - Código menor
    - Informar o tipo no início

```java
public class aula_06_c {
    
     public static void main(String[] args) {

        // Sem informar o tamanho da array
        
        String[] letras = { "A", "B", "C", "D", "E"};
        for (var i=0; i < letras.length; i++)
            System.out.println(letras[i]);
    }
}
```

Resultado:
A, B, C, D, E

#### aula_06_d.java

- Array chamando `arrays.toString`

```java
public class aula_06_d {
    
     public static void main(String[] args) {

        // Sem informar o tamanho da array
        String[] letras = { "A", "B", "C", "D", "E"};
        
        System.out.println(Arrays.toString(letras));
    }
}
```

Resultado:
O formato da saída é diferente
[A, B, C, D, E]

### Maior, Menor e Média - Atividade: aula_06

#### aula_06_e.java

```java
public class aula_06_e {
    
     public static void main(String[] args) {
        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        //laço numérico
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            //somando e atribuindo == media + numeros[i]
            media += numeros[i];
        }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media/numeros.length);
            
        }  
    }
```

## Aula 07

- [x] Funções
- [x] Definir funções
- [x] Definir parâmetros
- [x] Definir retorno de resultados


> Em java, o ponto de partida é a partir do método main

- As funções são feitas dentro do método `main` e o código feito fora das {} do main.
- Para chamar uma função é fundamental a inclusão dos () após a sua chamada: `exemplo();`

### Método main sem retorno

#### aula_07_a.java

```java
public class aula_07_a {
    
    public static void main(String[] args) {
        String nomeOriginal = "Let's Code";
        // passar o parâmetro nomeOriginal para as () da função.
        saudacao(nomeOriginal);
    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }
}
```

Resultado:

Hello, Let's Code

### Método main com retorno

#### aula_07_b.java

```java
public class aula_07_b {
    
    public static void main(String[] args) {
     int resultado = soma (2, 3);
     System.out.println(resultado);
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
```


 
