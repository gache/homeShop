package com.poo.objet;

public class DriverFour {
    public static void main(String[] args) {

//        Four four = new Four();
//        four.capacite = 30;
//        four.puissance =180;
//        four.getFour();
//        System.out.println();
//
       Four four2 = new Four();
        four2.capacite = 55;
        four2.puissance =260;
//        four2.getFour();

        Aliment aliment = new Aliment();
        aliment.nom = "Steck";
        aliment.estCuit = false;
        aliment.manger();
        System.out.println();
        four2.getFour(aliment);
        System.out.println();
        aliment.manger();

    }
}
