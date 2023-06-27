import java.util.Scanner;

public class Ficha03_12 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 12 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int num, sucessor, quantidade, contador = 1;
        boolean crescente = true;

        //ler variaveis
        System.out.println("quantos numeros quer inserir? ");
        quantidade = input.nextInt();
        System.out.println("inserir numero ");
        num = input.nextInt();

        while (contador < quantidade) {
            System.out.println("inserir um numero: ");
            sucessor = input.nextInt();

            if (sucessor <= num) {
                crescente = false;
            }
            num = sucessor;
            contador++;
        }
        if (crescente == true) {
            System.out.println("crescente");
        } else {
            System.out.println("nao crescente");
        }
    }
}