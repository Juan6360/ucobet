package com.juan.ucobet.dominio;

public class Usuario {
    private String nombre;
    private String correo;

    private int celular;
    private int identificaion;

    private Object boleta;

    public Usuario(String nombre,int identificaion, String correo, int celular, Object boleta) {
        this.nombre = nombre;
        this.identificaion=identificaion;
        this.correo = correo;
        this.celular = celular;
        this.boleta=boleta;
    }


    public String getNombre() {
        return nombre;
    }

    public int getIdentificaion() {return identificaion;}

    public String getCorreo() {return correo;}

    public int getCelular() {return celular;}




    public String toString() {
        return "nombre=" + nombre + ", correo=" + correo + ", celular=" + celular + boleta ;
    }
}
