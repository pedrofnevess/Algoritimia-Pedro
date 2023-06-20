import java.util.Scanner;
public class Ficha02_12 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 12 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int operacao;


        //imprimir opcoes
        System.out.println("1.criar");
        System.out.println("2.atualizar");
        System.out.println("3.eliminar");
        System.out.println("4.sair");

        //ler variaveis
        System.out.println("insira a operacao: ");
        operacao = input.nextInt();

        switch (operacao){
            case 1:
                System.out.println("escolheu criar: ");
                break;
            case 2:
                System.out.println("escolheu atualizar: ");
                break;
            case 3:
                System.out.println("escolheu eliminar: ");
                break;
            case 4:
                break;

            default:
                System.out.println("escolha invalida");
        }
    }
}
