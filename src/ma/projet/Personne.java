package ma.projet;

public abstract class Personne {

    protected String nom;
    protected double salaireBase;

    public Personne(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public abstract double calculerSalaire();

    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Salaire : " + calculerSalaire());
    }
}