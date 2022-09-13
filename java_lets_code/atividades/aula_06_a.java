
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
        for (var i=0; i < numeros.length; i++)
            System.out.println(numeros[i]);
    }
}
