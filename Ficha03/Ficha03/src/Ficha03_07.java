import java.util.Scanner;

public class Ficha03_07 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 7 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        double num=0, media=0, somatorio=0, contador=0;

        while (num != -1){

            //ler input do utilizador
            System.out.println("Inserir numero: ");
            num=input.nextDouble();

            if(num != -1){
                somatorio=somatorio+num;
                //conter numeros
                contador++;

            }else{
                System.out.println("A sair...");
            }

        }
            //calcular media
        media=somatorio/contador;
        System.out.println("A media e: " + media);

    }
}
