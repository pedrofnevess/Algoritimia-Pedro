import java.util.Scanner;

public class Ficha02_04_02 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 4 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int lugarFinal;
        lugarFinal = input.nextInt();

        //ler valores do utilizador

        switch (lugarFinal){
            case 1:
                System.out.println("ganhou 10 pontos");
                break;
            case 2:
                System.out.println("ganhou 8 pontos");
                break;
            case 3:
                System.out.println("ganhou 6 pontos");
                break;
            case 4:
                System.out.println("ganhou 5 pontos");
                break;
            case 5:
                System.out.println("ganhou 4 pontos");
                break;
            case 6:
                System.out.println("ganhou 3 pontos");
                break;
            case 7:
                System.out.println("ganhou 2 pontos");
                break;
            case 8:
                System.out.println("ganhou 1 pontos");
                break;
        }

    }
}