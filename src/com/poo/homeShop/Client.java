package com.poo.homeShop;

public class Client {
    private String nomComple;
    private String adress;

    public Client(String nomComple, String adress) {
        this.nomComple = nomComple;
        this.adress = adress;
    }

    public String getNomComple() {
        return nomComple;
    }

    public String getAdress() {
        return adress;
    }
}
