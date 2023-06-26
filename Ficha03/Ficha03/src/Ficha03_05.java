import java.util.Scanner;

public class Ficha03_05 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 5 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis
        int num, soma=0;

        //ler variavel
        num = input.nextInt();

        while (num<=100){
            System.out.println(num);
            soma=soma+num;
            num++;
        }
            System.out.println("soma: " + soma);

    }
}
