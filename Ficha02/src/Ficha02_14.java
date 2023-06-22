import java.util.Scanner;
public class Ficha02_14 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 14 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int a, b, c;

        //ler variaveis
        System.out.println("inserir primeiro numero: ");
        a = input.nextInt();
        System.out.println("inserir segundo numero: ");
        b = input.nextInt();
        System.out.println("inserir terceiro numero: ");
        c = input.nextInt();

        //a
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a+" "+b+" "+c);
            } else {
                System.out.println(a+" "+c+" "+b);
            }
        }
        //b
        if (b < a && b < c) {
            if (a < c) {
                System.out.println(b+" "+a+" "+c);
            } else {
                System.out.println(b+" "+c+" "+a);
            }
        }
        //c
        if (c < a && c < b) {
        if (a < b) {
            System.out.println(c+" "+a+" "+b);
        } else {
            System.out.println(c+" "+b+" "+a);
        }
        }
    }
}