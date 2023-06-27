import java.util.Scanner;

public class Ficha03_10 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 10 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int num=1, i1=0, i2=0, i3=0, i4=0;

        while (num >= 0) {
            System.out.println("inserir numero: ");
            num = input.nextInt();

            if (num >= 0 && num <= 25) {
                i1++;
            } else if (num >= 26 && num <= 50){
                i2++;
            } else if (num >= 51 && num <= 75){
                i3++;
            } else if (num >= 76 && num <= 100){
                i4++;
            }
        }
        System.out.println("numero entre 0 e 25: " + i1);
        System.out.println("numero entre 26 e 50: " + i2);
        System.out.println("numero entre 51 e 75: " + i3);
        System.out.println("numero entre 76 e 100: " + i4);
    }
}
