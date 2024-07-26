package com.juan.ucobet.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Juego {

    // Atributos
    private List<Usuario> usuarios = new ArrayList<>();
    private int numeroGanador;
    private long recompensaUnaCifra;
    private long recompensaDosCifras;
    private long recompensaTresCifras;
    private long recompensaCuatroCifras;

    // Metodos

    // realizarSorteo
    // Función responsable de comparar las boletas existentes con los números ganadores y devolver una lista de usuarios
    public List<Usuario> realizarSorteo(){

        return this.usuarios.stream().filter(u -> u.getBoleta().getNumero() == this.numeroGanador).collect(Collectors.toList());

    }

    // mostrarGanancias
    // Función encargada de mostrar las ganancias/perdidas generadas luego de realizar el sorteo
    public void mostrarBalance() {

    }

    // multiplicarPuja
    // Función encargada de mutliplicar la recompensa por cada peso invertido
    public void multiplicadorPuja(){

    }

    // mostrarLista
    // Función encargada de mostrar una lista de elementos (Se puede reutilizar para imprimir la información de otros metodos)
    public void mostrarLista(List<Usuario> lista){

        lista.forEach(u -> System.out.println(u.getNombre()));

    }

    // Setters
    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }
}
