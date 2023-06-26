import java.util.Scanner;

public class Ficha03_03 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 3 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis
        int limite, iterador = 0;

        //ler variaveis
        System.out.println("inserir um numero: ");
        limite = input.nextInt();

        while (iterador <= limite){
        System.out.println(iterador);
        iterador++; //iterador= iterador + 1

    }
    }
}
