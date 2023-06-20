import java.util.Scanner;

public class Ficha02_03 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 3 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double salario;

        //ler valores do utilizador
        System.out.println("insira o valor do salario: ");
        salario = input.nextDouble();

        //salario menor a 15000
        if (salario <= 15000) {
        System.out.println("o imposto pago e: " + salario * 0.2);

        //salario 15000 a 20000
        }else if (salario > 15000 && salario <= 20000) {
        System.out.println("o imposto pago e: " + salario * 0.3);

        //salario 20000 a 25000
        }else if (salario > 20000 && salario <= 25000) {
        System.out.println("o imposto pago e: " + salario * 0.35);

        //salario superior a 25000
        }else if (salario > 25000){
        System.out.println("o imposto pago e: " + salario * 0.4);
        }
    }
}