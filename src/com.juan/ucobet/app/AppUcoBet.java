package com.juan.ucobet.app;

import com.juan.ucobet.dominio.Boleta;
import com.juan.ucobet.dominio.Juego;
import com.juan.ucobet.dominio.Usuario;

public class AppUcoBet {
    public static void main(String[] args) {
        Juego juego = new Juego();

        Usuario usuario1 = new Usuario(1001446360, "Juan", "juan.correo", 312287805, new Boleta(10, 1500));



    }
}