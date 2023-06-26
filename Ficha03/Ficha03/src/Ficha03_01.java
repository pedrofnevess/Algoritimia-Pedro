import java.util.Scanner;

public class Ficha03_01 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 1 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis
        int num = 2;

        while (num <= 300) {
            System.out.println(num);
            num = num + 2;

        }
    }
}
