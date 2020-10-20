package com.poo.objet;

public class Four {
    int puissance;
    int capacite;

    public void getFour(Aliment aliment){
        System.out.println("je cuis un aliment");
        System.out.println("avec ma capacité " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " dégrés");
        aliment.estCuit = true;
    }
}
