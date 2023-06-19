import java.util.Scanner;

public class Ficha02_04 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 4 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int lugarFinal;
        lugarFinal = input.nextInt();

        //ler valores do utilizador

        // 1 lugar
        if (lugarFinal == 1) {
            System.out.println("pontos ganhos: " + 10);
        }

        // 2 lugar
        if (lugarFinal == 2) {
        System.out.println("pontos ganhos: " + 8);
        }

        // 3 lugar
        if (lugarFinal == 3) {
            System.out.println("pontos ganhos: " + 6);
        }

        // 4 lugar
        if (lugarFinal == 4) {
            System.out.println("pontos ganhos: " + 5);
        }

        // 5 lugar
        if (lugarFinal == 5) {
            System.out.println("pontos ganhos: " + 4);
        }

        // 6 lugar
        if (lugarFinal == 6) {
            System.out.println("pontos ganhos: " + 3);
        }


        }
    }