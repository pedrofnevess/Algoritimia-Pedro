import java.util.Scanner;

public class Ficha03_03 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 3 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int limite, interador=0;

        //ler variaveis
        System.out.println("inserir um numero: ");
        limite = input.nextInt();

        while (interador <= limite){
        System.out.println(interador);
        interador++; //interador = interador + 1

        }
    }
}
