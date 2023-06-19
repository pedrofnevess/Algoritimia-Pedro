import java.util.Scanner;

public class Ficha02_01 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 1 ****");
        Scanner input = new Scanner(System.in);

        //declara variaveis
        double a, b;

        //ler valores do utilizaor
        System.out.println("inserir um numero: ");
        a = input.nextDouble();

        System.out.println("inserir um numero: ");
        b = input.nextDouble();

        if (a == b) { // A e B sao iguais
            System.out.println("os numeros sao iguais!");
        } else { //A e B sao diferentes

            if (a > b) {
                System.out.println("o maior e: " + a);
            } else {
                System.out.println("o maior e: " + b);
            }

        }
    }
}