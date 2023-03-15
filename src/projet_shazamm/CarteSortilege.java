package projet_shazamm;

public  abstract class CarteSortilege {
    int numCarte;
    String nomCarte;
    String description;// description de la carte à afficher

    public CarteSortilege(int num,String nom, String descr){//constructeur de carte
        this.numCarte=num;//
        this.nomCarte=nom;
        this.description=descr;

    }

    @Override
    public String toString(){//afficher les infos des cartes
        return(numCarte+" "+nomCarte+" "+description);//son numero suivie du nom et une description
    }

}
