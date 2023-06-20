import java.util.Scanner;

public class Ficha02_06 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 6 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2;
        //ler valores do utilizador
        System.out.println("inserir um valor: ");
        num1 = input.nextDouble();
        System.out.println("inserir outro valor:");
        num2 = input.nextDouble();

        //valores iguais
        if (num1 == num2) {
            System.out.println("os valores sao iguais.");
        }
        //valores diferentes
        if (num1 > num2) {
            System.out.println("o maior valor e: " + num1);
            System.out.println("o menor valor e: " + num2);
        } else {
            if (num1 < num2) {
                System.out.println("o maior valor e: " + num2);
                System.out.println("o menor valor e: " + num1);

            }
        }
    }
}
