import java.util.Scanner;

/*Escreva um programa que informa a tabuada de multiplicação de um número informado pelo usuário (ENTRE 1-10). Exemplo:
Entre com um número de 1 a 10:

A tabuada de 1 é:
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3

Utilizar laço for
*/
public class desafio_01 {

        public static void main(String[] args) {
        // Scanner + informar qual tipo de variável

        //System.in == ler a partir do teclado do computador
        
        // O que vamos ler? um int (número inteiro)
            Scanner usuario = new Scanner(System.in);
        
        //Mensagem que aparece antes do valor que o usuário vai incluir
            System.out.println("Escolha um número entre 01 e 10.");
           
        // usuário inclui o valor da variável número
            int numero = usuario.nextInt();
        
            System.out.println("A tabuada de " + numero + " é:");

        // Iniciando em 1 até =<10 
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + numero*i);
        }     
    }

}
      
          
        

