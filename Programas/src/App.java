import java.util.ArrayList;
import java.util.Scanner;

import aquatico.Aquatico;
import terrestre.Terrestre;
import voador.Voador;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aquatico> Aquatico = new ArrayList<>();
        ArrayList<Terrestre> Terrestre = new ArrayList<>();
        ArrayList<Voador> Voador = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        Aquatico water1 = new Aquatico(5, "Dourado", "Quintal");
        Aquatico.add(0, water1);
        Aquatico water2 = new Aquatico(2, "Beta", "Petshop");
        Aquatico.add(1, water2);
        Aquatico water3 = new Aquatico(4, "Baleia", "Aquario");
        Aquatico.add(2, water3);

        Terrestre earth1 = new Terrestre(4, "Caramelo", "Rua");
        Terrestre.add(0, earth1);
        Terrestre earth2 = new Terrestre(2, "Canguru", "Australia");
        Terrestre.add(1, earth2);
        Terrestre earth3 = new Terrestre(4, "Jabuti", "Oceano");
        Terrestre.add(2, earth3);

        Voador air1 = new Voador(2, "Aguia", "Ceus");
        Voador.add(0, air1);
        Voador air2 = new Voador(2, "Pelicano", "Selva");
        Voador.add(1, air2);
        Voador air3 = new Voador(4, "Wyvern", "Fantasia");
        Voador.add(2, air3);
        
        boolean cont = false;

        while(!cont){
            System.out.println("Escolha a lista: [1] - Aquaticos   [2] - Terrestres   [3] - Voador");
            
            switch(scan.nextInt()){
                case 1:
                    System.out.println(Aquatico);
                    cont = true;
                    break;
                case 2:
                    System.out.println(Terrestre);
                    cont = true;
                    break;
                case 3:
                    System.out.println(Voador);
                    cont = true;
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
        }       
    }
}
