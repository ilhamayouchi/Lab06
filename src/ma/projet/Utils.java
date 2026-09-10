package ma.projet;

import java.util.List;

public class Utils {

    public static void listerPersonnes(List<? extends Personne> personnes) {

        for (Personne personne : personnes) {
            personne.affiche();
            System.out.println("----------------");
        }
    }
}