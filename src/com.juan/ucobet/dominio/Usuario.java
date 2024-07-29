package com.juan.ucobet.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    // Atributos
    private long identificacion;
    private String nombre;
    private String correo;
    private long celular;
    private List<Boleta> boletas = new ArrayList<>();

    // Constructor
    public Usuario(long identificacion, String nombre, String correo, long celular, Boleta boleta) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
//        this.boleta = boleta;
    }

    public void crearBoleta(int numero, int puja){

        Boleta boleta = new Boleta(numero, puja);
        this.boletas.add(boleta);

    }

    // Getters

    public String getNombre() {
        return nombre;
    }

}
