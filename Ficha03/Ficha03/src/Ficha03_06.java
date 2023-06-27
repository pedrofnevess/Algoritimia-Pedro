import java.util.Scanner;

public class Ficha03_06 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 6 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int num, limiteMaior, limiteMenor;

        //ler variavel
        System.out.println("inserir um numero: ");
        num = input.nextInt();
        //inicializar anterior e sucessor
        limiteMaior = num + 5;
        limiteMenor = num - 5;

        //ciclo anterior
        while (num > limiteMenor) {
            System.out.println(limiteMenor);
            limiteMenor++;
        }
        //incrementar numero
        num++;
        //ciclo sucessores
        while (num <= limiteMaior) {
            System.out.println(num);
            num++;
        }

    }
}
