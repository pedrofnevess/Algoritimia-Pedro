import java.util.Scanner;
public class Ficha01_07 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 7 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int valor1, valor2;

        //ler valores do utilizador
        System.out.println("insira um valor: ");
        valor1 = input.nextInt();

        System.out.println("insira um valor: ");
        valor2 = input.nextInt();

        //imprimir os valores inseridos
        System.out.println("valor1: "+valor1);
        System.out.println("valor2: "+valor2);

        //logica de troca
        valor1=valor1+valor2;
        valor2=valor1-valor2;
        valor1=valor1-valor2;

        //apresentar os valor trocados
        System.out.println("valor1 trocado: "+valor1);
        System.out.println("valor2 trocado: "+valor2);

    }
}
