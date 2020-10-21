package com.poo.homeShop;

public class Frigo extends Product {

    private int litre;
    private boolean freezer;

    public Frigo(String prenom, String description, double prix, int litre, boolean freezer) {
        super(prenom, description, prix);
        this.litre = litre;
        this.freezer = freezer;
    }

    public int getLitre() {
        return litre;
    }

    public boolean isFreeze() {
        return freezer;
    }
}
