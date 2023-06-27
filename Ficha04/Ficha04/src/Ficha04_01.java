import java.util.Scanner;

public class Ficha04_01 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 01 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int num1, num2, resultado;
        String operacao;

        System.out.println("inserir um numero: ");
        num1 = input.nextInt();
        System.out.println("inserir outro numero: ");
        num2 = input.nextInt();
        System.out.println("inserir operacao (+) (-) (*) (/): ");

        //depender da operacao
        do {
           switch (operacao){
               case "+":
                   resultado=num1+num2;
                   System.out.println("soma: " + resultado);
               case "-":
                   resultado=num1-num2;
                   System.out.println("subtracao: " + resultado);
               case "*":
                   resultado=num1*num2;
                   System.out.println("multiplicacao: " + resultado);
               case "/":
                   resultado=num1/num2;
                   System.out.println("divisao: " + resultado);

            }
        }







    }
}
