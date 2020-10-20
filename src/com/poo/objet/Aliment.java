package com.poo.objet;

public class Aliment {
    String nom;
    boolean estCuit;

    public void manger(){
        if (estCuit){
            System.out.println("Je mange mon aliment " + nom + " car il est cuis");
        }else{
            System.out.println("Je ne mange pas mon aliment " + nom + " car il n'est pas cuis");
        }
    }
}
