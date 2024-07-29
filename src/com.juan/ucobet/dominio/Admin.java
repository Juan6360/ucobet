package com.juan.ucobet.dominio;

import com.juan.ucobet.dominio.Boleta;
import com.juan.ucobet.dominio.Juego;
import com.juan.ucobet.dominio.Usuario;

public class Admin extends Usuario {

    // Atributos

    // Constructor
    public Admin(long identificacion, String nombre, String correo, long celular, Boleta boleta) {
        super(identificacion, nombre, correo, celular, boleta);
    }

    // Metodos

    // escogerNumeroGanador
    // Función encargada de establecer los numero ganadores de los sorteos
    public void escogerNumerosGanadores(Juego juego, int numero){

        juego.setNumeroGanador(numero);

    }

    // vetarNumero
    // Función encargada de prohibir el uso de ciertos numero
    public void vetarNumero(int numero){

    }

    // escogerHoraAJugar
    // Función encargada de establecer la hora a la que se realiza el sorteo
    public void escogerHoraAJugar(){

    }

    // escogerMultiplicador
    // Función encargada de establecer el porcentaje por el cual las recompensas seran multiplicadas
    public void escogermultiplicador(double porcentaje){

    }
}
