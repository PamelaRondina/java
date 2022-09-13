
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
