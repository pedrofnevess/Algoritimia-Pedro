import java.util.Scanner;
public class Ficha02_13 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 13 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int hora, minuto;

        //ler variavel
        System.out.println("inserir hora: ");
        hora = input.nextInt();
        System.out.println("inserir minutos: ");
        minuto = input.nextInt();

        if (hora > 12 && hora < 24){
            System.out.println("horario " + (hora - 12) + ":" + minuto + " PM");
        }
        if (hora < 12){
            System.out.println("horario " + hora + ":" + minuto + " AM");
        }
        if (hora == 24){
            System.out.println("horario " + (hora - 24) + ":" + minuto + " AM");
        }
        if (hora == 12){
            System.out.println("horario " + (hora) + ":" + minuto + " PM");
        }
    }
}