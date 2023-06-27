import java.util.Scanner;

public class Ficha03_11 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 11 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int inicio, limite;

        //ler variaveis

        System.out.println("inserir o inicio do intervalo: ");
        inicio = input.nextInt();

        System.out.println("inserir o fim do intervalo: ");
        limite = input.nextInt();

        while (inicio<=limite){
            if (inicio%5==0)
                System.out.println(inicio);
            inicio++;
        }
    }
}