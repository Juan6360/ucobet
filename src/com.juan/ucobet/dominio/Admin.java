package com.juan.ucobet.dominio;

import com.juan.ucobet.dominio.Boleta;
import com.juan.ucobet.dominio.Juego;
import com.juan.ucobet.dominio.Usuario;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Admin extends Usuario {

    // Atributos
    private String pass;

    // Constructor
    public Admin(String nombre, long identificacion, String correo, long celular, String pass) {

        super(nombre, identificacion, correo, celular);
        this.pass = pass;

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

    // escogerFecha
    // Función encargada de establecer la hora a la que se realiza el sorteo
    public void escogerFecha(Juego juego, LocalDate fecha){

        juego.setFecha(fecha);

    }

    // escogerMultiplicador
    // Función encargada de establecer el porcentaje por el cual las recompensas seran multiplicadas
    public void escogermultiplicador(double porcentaje){

    }
}
