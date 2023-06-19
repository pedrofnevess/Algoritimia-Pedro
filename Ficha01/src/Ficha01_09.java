import java.util.Scanner;

public class Ficha01_09 {
    public static void main(String[] args) {

        // Instanciar Scanner (linha obrigatoria para ler dados da consola)

        System.out.println("**** Exercicio 9 ****");
        Scanner input = new Scanner(System.in);


        //declara variaveis
        int segundosTotais=0, tempoMusica=0, horas=0, minutos=0, segundos=0;

        //ler minutos da musica 1
        System.out.println("insira minutos musica 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        //ler segundos da musica 1
        System.out.println("insira segundos musica 1: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        //ler minutos da musica 2
        System.out.println("insira minutos musica 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        //ler segundos da musica 2
        System.out.println("insira segundos musica 2: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        //ler minutos da musica 3
        System.out.println("insira minutos musica 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        //ler segundos da musica 3
        System.out.println("insira segundos musica 3: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        //ler minutos da musica 4
        System.out.println("insira minutos musica 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        //ler segundos da musica 4
        System.out.println("insira segundos musica 4: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        //ler minutos da musica 5
        System.out.println("insira minutos musica 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+(tempoMusica*60);

        //ler segundos da musica 5
        System.out.println("insira segundos musica 5: ");
        tempoMusica= input.nextInt();
        segundosTotais=segundosTotais+tempoMusica;

        System.out.println("total do album em segundos: "+segundosTotais);

        //converter horas minutos e segundos
        horas=segundosTotais/3600;
        minutos=(segundosTotais/60)-(horas*60);
        segundos=(segundosTotais)-(horas*3600)-(minutos*60);

        //imprimir duracao do album
        System.out.println("duracoa do album: ");
        System.out.println(horas+"h "+minutos+"m "+segundos+"s ");

    }
}