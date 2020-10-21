package com.poo.homeShop;

public class Product {
    private String prenom;
    private String description;
    private double prix;


    public Product(String prenom, String description, double prix) {
        this.prenom = prenom;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return prenom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * Afficher une description complète du produit
     */
    public void look() {
        System.out.println(String.format(prenom + " : " + prix + "%n" + description));
    }

    /**
     * Ajouter le produit à une facture
     *
     * @param facture  la facture en question
     * @param quantite la quantite à ajouter
     */
    public void acheter(Facture facture, Integer quantite) {

    }

}
