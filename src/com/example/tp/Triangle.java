package com.example.tp;

public class Triangle extends Forme {
	 private double base;
	    private double hauteur;

	    public Triangle(String couleur, double base, double hauteur) {
	        super(couleur);
	        this.base = base;
	        this.hauteur = hauteur;
	    }

		@Override
		public void dessiner() {
			// TODO Auto-generated method stub
			super.dessiner();
			 System.out.println("Dessiner un triangle de couleur " + couleur
		                + ", base=" + base
		                + ", hauteur=" + hauteur);
		}
	    

}
