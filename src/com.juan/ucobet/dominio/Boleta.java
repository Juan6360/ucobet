package com.juan.ucobet.dominio;

public class Boleta {
    private int numero;
    private  int puja;

    public Boleta(int numero, int puja){
        this.numero = numero;
        this.puja=puja;
    }



    public String toString() {
        return "numero escogido =" + numero +", puja apostada= "+ puja;
    }
}
