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

