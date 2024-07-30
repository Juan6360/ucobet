package com.juan.ucobet.dominio;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Juego {

    // Atributos
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Integer> numerosVetados = new ArrayList<>();
    private int numeroGanador;
    private Clock hora;
    private LocalDate fecha;
    private double porcentajeMultiplicador;
    private long recompensaUnaCifra;
    private long recompensaDosCifras;
    private long recompensaTresCifras;
    private long recompensaCuatroCifras;

    // Metodos

    // realizarSorteo
    // Función responsable de comparar las boletas existentes con los números ganadores y devolver una lista de usuarios
    public List<Usuario> realizarSorteo(){

        return null;

    }

    // mostrarGanancias
    // Función encargada de mostrar las ganancias/perdidas generadas luego de realizar el sorteo
    public void mostrarBalance() {

    }

    // multiplicarPuja
    // Función encargada de mutliplicar la recompensa por cada peso invertido
    public void multiplicadorPuja(){

    }

    // participantesSorteo
    // Función encargada de encontrar los participantes de un sorteo

    // mostrarLista
    // Función encargada de mostrar una lista de elementos (Se puede reutilizar para imprimir la información de otros metodos)
    public void mostrarLista(List<Usuario> lista){

        lista.forEach(u -> System.out.println(u.getNombre()));

    }

    public void mostrarBoletas(Usuario usuario){

        usuario.getBoletas().forEach(b -> System.out.println(b.toString()));

    }

    public void numerosAVetar(int numeroAVetar){
        //agrega los numeros a la lista numerosVetados
        numerosVetados.add(numeroAVetar);


    }

    // Getters


    public Clock getHora() {
        return hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public long getRecompensaUnaCifra() {
        return recompensaUnaCifra;
    }

    public long getRecompensaDosCifras() {
        return recompensaDosCifras;
    }

    public long getRecompensaTresCifras() {
        return recompensaTresCifras;
    }

    public long getRecompensaCuatroCifras() {
        return recompensaCuatroCifras;
    }

    //get para obtener la lista de numeros Vetados
    public String getNumerosVetados() {
        String datosArray = "";
        for (int elemento: numerosVetados) {
            datosArray += elemento + " ";
        }
        return datosArray;
    }

    // Setters

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }


}
