import java.util.Scanner;

public class Ficha02_07 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 7 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num1;

        //ler variaveis
        System.out.println("inserir um valor: ");
        num1 = input.nextInt();

        //par ou impar
        if (num1%2==0){
            System.out.println("o valor e par");
        }else{
            System.out.println("o valor e impar");
        }
    }
}
