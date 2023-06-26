import java.util.Scanner;
public class Ficha02_16 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 16 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int valorTotal, notas;

        //ler variaveis
        System.out.println("inserir valor total: ");
        valorTotal = input.nextInt();

        if (valorTotal%5==0) { //valor multiplo 5

            //calcular numero de notas 200
            notas = valorTotal/200;
            System.out.println("notas de 200: " + notas);
            valorTotal = valorTotal%200;

            //calcular numero de notas 100
            notas = valorTotal/100;
            System.out.println("notas de 100: " + notas);
            valorTotal = valorTotal%100;

            //calcular numero de notas 50
            notas = valorTotal/50;
            System.out.println("notas de 50: " + notas);
            valorTotal = valorTotal%50;

            //calcular numero de notas 20
            notas = valorTotal/20;
            System.out.println("notas de 20: " + notas);
            valorTotal = valorTotal%20;

            //calcular numero de notas 10
            notas = valorTotal/10;
            System.out.println("notas de 10: " + notas);
            valorTotal = valorTotal%10;

            //calcular numero de notas 5
            notas = valorTotal/5;
            System.out.println("notas de 5: " + notas);
            valorTotal = valorTotal%5;

        }else {
            System.out.println("o valor invalido");
        }
    }
}