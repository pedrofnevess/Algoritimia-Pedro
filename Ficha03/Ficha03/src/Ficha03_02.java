import java.util.Scanner;

public class Ficha03_02 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 2 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis

        int num = 531;

        while (num <= 750) {
            System.out.println(num);
            num = num + 2;

        }
    }
}
