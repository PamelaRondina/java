
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
package atividades;

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
package atividades;

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
  package atividades;

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
package atividades;

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
System.out.println(nomeDaVariavel.toUpperCase());
    
**minúsculas**
System.out.println(nomeDaVariavel.toLowerCase());

**contagem caracteres**
 System.out.println(nomeDaVariavel.length());

**comparar Strings**
System.out.println(nomeDaPrimeiraVariavel.equals(nomeDaSegundaVariavel));

*Ignorando maiúsculas e minúsculas*
System.out.println(nomeDaPrimeiraVariavel.equalIgnoreCase(nomeDaSegundaVariavel));-

```java
package atividades;

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

System.out.printf("")


**Dia da semana**

```java
LocalDate hoje = LocalDate.now();
System.out.println(hoje.getDayOfWeek());
```

```java
package atividades;

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










