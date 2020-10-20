package com.poo.homeShop;

import java.util.Map;

public class Facture {

    private Client client;
    private Map<Product, Integer> products;

    public Facture(Client client) {
        this.client = client;
    }

    public void ajouterproduct(Product product, Integer quantite) {
        this.products.put(product, quantite);
    }

    public Client getClient() {
        return client;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
