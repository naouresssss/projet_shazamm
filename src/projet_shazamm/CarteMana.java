package projet_shazamm;

import java.util.Scanner;

public class CarteMana extends CarteSortilege {//toutes les cartes qui impact a mana du joueur

    public CarteMana(int num, String nom, String descr) {
        super(num, nom, descr);//on fait appel au constructeur de cartes sortilege
    }

    public void effetCarte13et6et12(Sorcier sorcier) {//en parametre le nombre de mana qu'on va ajouter ou retrancher
        if (this.numCarte == 13) {
            if (sorcier.mana + 13 >= 50) {
                sorcier.mana = 50;
                System.out.println("hey");
            } else {
                sorcier.mana += 13;
            }

        }
        if (this.numCarte == 6) {
           int nombre2;
          do {
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("combien voulez vous retrancher ou ajouter ?(metrre - devant la valeur pour retrancher et rien pour ajouter)");
                nombre2 = scanner3.nextInt();
                if (nombre2 < -5 || nombre2 > 5) {
                    System.out.println("doit être compris entre -5 et 5 ");
                }else if(sorcier.mana-nombre2<0){
                    System.out.println("vous n'avez pas assez de mana");
                }
            } while (nombre2 < (-5 ) || nombre2 > 5|| sorcier.mana-nombre2<=0 );

            if (sorcier.mise + nombre2<0){
                sorcier.mise=0;
            }else{
            sorcier.mise = sorcier.mise + nombre2;
            }
        } else if (this.numCarte == 12) {
            sorcier.mana = sorcier.mana;
        } else {
            System.out.println("pas de triche");
        }
    }

    public void effetCarte14(Sorcier moi, Sorcier adversaire) {
        if (this.numCarte == 14) {
            if (moi.mana + adversaire.mise > 50) {
                moi.mana = 50;
            } else {
                moi.mana += adversaire.mise;
            } 
        }
    }
}
        
    