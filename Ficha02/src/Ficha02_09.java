import java.util.Scanner;

public class Ficha02_09 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 9 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1, num2, num3;
        //ler variaveis
        System.out.println("inserir primeiro numero:");
        num1 = input.nextInt();
        System.out.println("inserir segundo numero:");
        num2 = input.nextInt();
        System.out.println("inserir terceiro numero:");
        num3 = input.nextInt();

        //valores diferentes
        if (num1 <= num2 && num1 < num3){
            System.out.println("o menor valor e: " + num1);
        }
        if (num1 < num2 && num1 <= num3){
            System.out.println("o menor valor e: " + num1);
        }
        if (num2 <= num1 && num2 < num3){
            System.out.println("o menor valor e: " + num2);
        }
        if (num3 <= num2 && num3 < num1){
            System.out.println("o menor valor e: " + num3);
        }

        //valores iguais
        if (num1 == num2 && num1 == num3)
            System.out.println("valores iguais");

    }
}
