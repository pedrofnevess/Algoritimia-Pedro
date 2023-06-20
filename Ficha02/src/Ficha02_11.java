import java.util.Scanner;

public class Ficha02_11 {
    public static void main(String[] args) {

        // Instancia obrigatoria do Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 11 ****");
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        double saldo, montante;

        //ler variaveis
        System.out.println("inserir saldo da conta: ");
        saldo = input.nextDouble();
        System.out.println("inserir montante a creditar (+) ou debitar (-):");
        montante = input.nextDouble();

        if (saldo+montante<0){
            System.out.println("operacao invalida, saldo negativo.");
        }else{
            //atualiza o saldo
            saldo=saldo+montante;
            System.out.println("operacao realizada com sucesso");
            System.out.println("novo saldo: "+saldo);
        }
    }
}
