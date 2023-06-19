import java.util.Scanner;

public class ficha01_01 {
    public static void main(String[] args) {
            // Instanciar Scanner (linha obrigatoria para ler dados da consola)
            System.out.println("***** Exercicio 1 *****");
            Scanner input = new Scanner(System.in);

            System.out.println("***** Exercicio 1 *****");

// Declarar variavel
            int num1, num2, resultado;

            //Ler num1
            System.out.println("introduza um numero inteiro: ");
            num1 = input.nextInt();

            //Ler num2
            System.out.println("introduza um numero inteiro: ");
            num2 = input.nextInt();

            //Somar num1 com num2
            resultado = num1 + num2;

            //Apresentar resultado
            System.out.println("Resultado da soma: " + resultado);

    }}



