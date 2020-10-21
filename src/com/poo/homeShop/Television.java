package com.poo.homeShop;

public class Television extends Product {
    private int taille;
    private String technologieDalle;

    public Television(String prenom, String description, double prix, int taille, String technologieDalle) {
        super(prenom, description, prix);
        this.taille = taille;
        this.technologieDalle = technologieDalle;
    }

    public int getTaille() {
        return taille;
    }

    public String getSlabType() {
        return technologieDalle;
    }
}
