package be.bxl.formation;

import be.bxl.formation.models.Personnage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // On cée une instance p1 de type personnage
        Personnage p1 = new Personnage(
                "Zaza",
                "thielens",
                20
        );
        System.out.println(p1.getNom());
    }
}
