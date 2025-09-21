import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Musica> musicas = new ArrayList<>();

         Scanner scanner = new Scanner(System.in);
        try{

        String nome1, artista1, albumPop, subgeneroRock, opcao;
        do {
        int genero = 0;
        do {
        System.out.println("Adicione músicas à sua Playlist! Será uma música 1-Pop ou 2-Rock?");
        genero = scanner.nextInt();
        scanner.nextLine();
        if (genero == 1) {

        System.out.println("Digite o nome da música:");  
        nome1 = scanner.nextLine(); 
        System.out.println("Digite o artista da música:");  
        artista1 = scanner.nextLine(); 
        System.out.println("Digite o álbum da música:");  
        albumPop = scanner.nextLine(); 
        musicas.add(new PopMusica(nome1,artista1,albumPop));

        } else if (genero == 2) {

        System.out.println("Digite o nome da música:");  
        nome1 = scanner.nextLine(); 
        System.out.println("Digite o artista da música:");  
        artista1 = scanner.nextLine(); 
        System.out.println("Digite o subgenero da música:");  
        subgeneroRock = scanner.nextLine(); 
        musicas.add(new RockMusica(nome1,artista1,subgeneroRock));

        } else {System.out.println("Opção incorreta! Tente novamente.");}}
        while (genero < 1 || genero > 2);

        System.out.println("Deseja adicionar outra música à Playlist? S/N");
        opcao = scanner.next();}
            while (opcao.equalsIgnoreCase("S"));} catch (Exception e) {System.out.println("Entrada inválida, tente novamente.");}

        
        
        for (Musica musica : musicas) {
            musica.tocar();
            musica.estiloMusical();
            if (musica instanceof PopMusica) {
                ((PopMusica) musica).exibirAlbum();
            } else if (musica instanceof RockMusica) {
                ((RockMusica) musica).exibirSubgenero();
            }
            System.out.println();
        }
    }
