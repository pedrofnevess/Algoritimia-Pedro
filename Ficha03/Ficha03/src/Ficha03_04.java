import java.util.Scanner;

public class Ficha03_04 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 4 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis
        int inicio, limite;

        //variavel

        System.out.println("inserir o inicio do intervalo: ");
        inicio = input.nextInt();

        System.out.println("inserir o fim do intervalo: ");
        limite = input.nextInt();

        while (inicio<=limite){
            System.out.println(inicio);
            inicio++;

        }
    }
}
