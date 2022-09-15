import java.util.Scanner;

public class desafio_02 {

    public static void main(String[] args) {

/*
Escreva um programa que converte temperaturas de Celsius para Fahrenheit. 
Fórmula (0 °C × 9/5) + 32 = 32 °F. 

Exemplo:
Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: 22
O equivalente a 22 C é 71,6 F.
 */

//usuário preenche informação no terminal
    Scanner usuario = new Scanner(System.in);
    System.out.println("Escolha o valor em C°");
    int celcius = usuario.nextInt();
    float fahrenheit= (celcius * 9/5) + 32;

    System.out.println("O equivalente a " + celcius + "Cº é " + fahrenheit + "F°.");

    }
}
