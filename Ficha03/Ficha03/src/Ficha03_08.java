import java.util.Scanner;

public class Ficha03_08 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 8 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int num, interador=2;

        //ler variaveis
        System.out.println("inserir um numero: ");
        num = input.nextInt();

        while (num >= interador){
            System.out.println(interador);
            interador+=2;
        }


    }
}
