
/*DESAFIO 01: Varoáveis -> int e double
Você está criando um programa de rastreamento climático. 
Inicialize várias variáveis para armazenar diferentes aspectos do clima: */

public class Desafio01 { //CLASSE
    public static void main(String[] args) { //MÉTODO
        //Criar variáveis inteiras
        int temperature = 28;
        int humidity = 65;
        int windSpeed = 15;   

        //Criar variáveis decimais
        double morningTemp = 22.5;
        double afternoonTemp = 28.8;
        double eveningTemp = 23.4;

        //SAÍDA
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Humidity Level: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Morning Temperature: " + morningTemp);
        System.out.println("Afternoon Temperature: " + afternoonTemp);
        System.out.println("Evening Temperature: " + eveningTemp);
        
    }
}