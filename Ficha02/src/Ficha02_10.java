import java.util.Scanner;

public class Ficha02_10 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 10 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double num1, num2, resultado;
        String operacao;

        //ler variaveis
        System.out.println("inserir um valor: ");
        num1 = input.nextDouble();
        System.out.println("inserir outro valor: ");
        num2 = input.nextDouble();
        System.out.println("inserir operacao (+) (-) (/) (*): ");
        operacao=input.next();

        //a depender da operacao
        switch (operacao){
            case "+":
                resultado=num1+num2;
                System.out.println("soma: " + resultado);
                break;
            case "-":
                resultado=num1-num2;
                System.out.println("subtracao: " + resultado); //ou (("subtracao: " (num1-num2))
                break;
            case "/":
                resultado=num1/num2;
                System.out.println("divisao: " + resultado);
                break;
            case "*":
                resultado=num1*num2;
                System.out.println("multiplicacao: " + resultado);
                break;
            default:
                System.out.println("operacao invalida");
        }
    }
}
