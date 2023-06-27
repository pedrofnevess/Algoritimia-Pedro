import java.util.Scanner;

public class Ficha03_09 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 9 ****");
        Scanner input = new Scanner(System.in);


        //declarar variaveis
        int iterador=0, limite, salto;

        //ler variaveis
        System.out.println("inserir um limite: ");
        limite = input.nextInt();
        System.out.println("inserir intervalo de salto: ");
        salto = input.nextInt();


        while (iterador<limite){
            System.out.println(iterador);
            iterador+=salto;
        }
    }
}
