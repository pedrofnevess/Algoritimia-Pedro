import java.util.Scanner;

public class Ficha02_02 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 2 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double salario;
        final double a=15000;

        //ler valores do utilizador
        System.out.println("insira valor do salario: ");
        salario = input.nextDouble();

        //salario menor que 15000
        if (salario <= a) {
            System.out.println("o salario anual com impostos e: " + salario * 0.20);

            //salario maior que 15000
        }else {
                System.out.println("salario anual mais impostos e: " + salario * 0.30);
        }
    }
}