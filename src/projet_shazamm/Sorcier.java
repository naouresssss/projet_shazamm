package projet_shazamm;

import java.util.Scanner;
    
public class Sorcier {
    int mana=50;
    String nom;
    int mise=0;
    public Sorcier(String nom){
        this.nom=nom;
    }
    public int miser(){

       while(mise<=0 || mise>mana){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Combien de mana voulez vous miser? ");
        mise=scanner.nextInt();
        }
        return mise;
    }

    public void pertemana(){
        mana-= mise;
    }

    @Override
    public String toString(){
        return(mana+":  "+nom);
    }
}
