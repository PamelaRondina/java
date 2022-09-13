

public class aula_03_b {
    public static void main (String[] args){

        int resultado = 50;
        String nota;
        //A 80 B 70 C 60 D <50
        
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