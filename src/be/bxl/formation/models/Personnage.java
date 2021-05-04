package be.bxl.formation.models;

import java.util.Locale;

public class Personnage {

    public final int ENDURANCE_MAX = 100;

    private String nom;
    private String prenom;
    private String espece;
    private int pdvMax;
    private int pdv;
    private int endurance;
    private int enduranceMax;

    // region de l'encapsulation. L'art de proteger nos champs.
    // On aura acces à nos champs mais en sécurisant l'accès de nos champs
    // Getters (accesseurs)
    public String getNom(){
        return this.nom; // this correspond à p1 par exemple
    }
    public String getPrenom(){
        return this.prenom.toUpperCase();
    }
    public String getEspece(){
        return this.espece;
    }
    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }
    public int getPdv() {
        return this.pdv;
    }
    public int getPdvMax() {
        return this.pdvMax;
    }

    // Setters (mutateurs) Une procédure qui va me permettre de modifier le nom.
    // Je vais le modifier avec une autre valeur que je vais recevoir en parametre
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    // en prive me permet d'éviter de depasser les points de vie mais uniquement dans la classe
    private void setPdv(int pdv) {
        // Va modifier les points de vie du perso. Est ce que la valeur est supérieur au point de vie max.
        // Pour éviter que si il prend un soin on depasse les points de vie max
        this.pdv = (pdv <= getPdvMax()) ? pdv : getPdvMax(); // si pdv plus petit que le max : donner point de vie sinon
        // on est au max de sa vie
    }

    // endregion

    // region Mon constructeur
    public Personnage(String prenom, String nom, int pdv) {
        // Test de validation
        if(pdv <= 0) {
            // mot cle qui permet de déclncher une exeption, une erreur
            throw new IllegalArgumentException("Les points de vies doivent etre positif");
        }
        // this  symbolise mon objet. monObjet.nom = nom de la variable dans mes parametre
        this.nom = nom;
        this.prenom = prenom;
        this.endurance = ENDURANCE_MAX;
        this.pdvMax = pdv;
        this.pdv = pdv;
        this.espece = "Humain";
    }
    // surchage de méthode. Meme nom de methode mais signature change (les parametres). Signature est composé du nom et
    public Personnage(String prenom, String nom, int pdv, String espece) {
        this(prenom, nom, pdv); // je récupère mon premier contructeur. je dois mettre les mêmes arguments
        this.espece = espece;
    }
    // endregion
}
