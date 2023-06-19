import java.util.Scanner;

public class Ficha01_02 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 02 ****");
        Scanner input = new Scanner(System.in);

// Declarar variavel
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        //ler num1
        System.out.println("introduzir numero inteiro: ");
        num1 = input.nextInt();

        //ler num2
        System.out.println("introduzir numero inteiro: ");
        num2 = input.nextInt();

        //somar num1 com num2
        soma=num1+num2;

        // Apresentar a soma
        System.out.println("A sua soma: "+ soma);

        //subtrair num1 com num2
        subtracao=num1-num2;

        // Apresentar a subtracao
        System.out.println("a sua subtracao: "+ subtracao);

        // mutiplicar num1 com num2
        multiplicacao=num1*num2;

        //Apresentar a mulplicacao
        System.out.println("a sua multiplicacao: "+ multiplicacao);

        // dividir num1 por num2
        divisao=num1/num2;

        //Apresentar a divisao
        System.out.println("a sua divisao: "+ divisao);

    }
}
