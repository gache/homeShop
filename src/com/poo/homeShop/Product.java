package com.poo.homeShop;

public class Product {
    private String nom;
    private String description;
    private double prix;


    public Product(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
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
