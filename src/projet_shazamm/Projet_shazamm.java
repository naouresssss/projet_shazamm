package projet_shazamm;

import java.util.Scanner;

public class Projet_shazamm {

    public static void main(String[] args) {
        // TODO code application logic here
        boolean essaye = false;
        Sorcier sor = new Sorcier("sor");
        Sorcier sor2 = new Sorcier("sor");
        System.out.println(sor);
        CarteMana carte13 = new CarteMana(13, "desed", "ezds");
        CarteMana carte6 = new CarteMana(6, "desed", "ezds");
        CarteMana carte12 = new CarteMana(12, "desed", "ezds");
        CarteMana carte14 = new CarteMana(14, "desed", "ezds");

        while (essaye == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrez un nombre : ");
            int nombre = scanner.nextInt();

            if (nombre == 13) {
                carte13.effetCarte13et6et12(sor);
                System.out.println(sor);
            } else if (nombre == 6) {
                carte6.effetCarte13et6et12(sor);
                sor.pertemana();
                System.out.println(sor.mise);
            } else if (nombre == 12) {
                carte12.effetCarte13et6et12(sor);
                System.out.println(sor);
            } else if (nombre == 14) {
                carte14.effetCarte14(sor, sor2);
                System.out.println(sor);
            }
        }
    }

}
