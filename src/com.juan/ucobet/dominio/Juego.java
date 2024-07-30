package com.juan.ucobet.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Juego {

    // Atributos
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Integer> numerosVetados = new ArrayList<>();
    private long ingresos;
    private long egresos;
    private int numeroGanador;
    private LocalDateTime fecha;
    private double porcentajeMultiplicador;
    private long recompensaUnaCifra;
    private long recompensaDosCifras;
    private long recompensaTresCifras;
    private long recompensaCuatroCifras;

    // Metodos

    // registrarUsuario
    public void registrarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    // realizarSorteo
    // Función responsable de comparar las boletas existentes con los números ganadores y devolver una lista de usuarios
    public List<Usuario> realizarSorteo(){

        return null;

    }

    // mostrarBalance
    // Función encargada de mostrar las ganancias/perdidas generadas luego de realizar el sorteo
    public void mostrarBalance() {

        this.usuarios.forEach(u -> u.getBoletas().forEach(b -> this.ingresos += b.getPuja()));



    }

    // multiplicarPuja
    // Función encargada de mutliplicar la recompensa por cada peso invertido
    public void multiplicadorPuja(){

    }

    // mostrarLista
    // Función encargada de mostrar una lista de elementos (Se puede reutilizar para imprimir la información de otros metodos)
    public void mostrarLista(){

        this.usuarios.forEach(u -> System.out.println(u.getNombre()));

    }

    public void mostrarBoletas(Usuario usuario){

        usuario.getBoletas().forEach(b -> System.out.println(b.toString()));

    }

    public void numerosAVetar(int numeroAVetar){

        //agrega los numeros a la lista numerosVetados
        this.numerosVetados.add(numeroAVetar);

    }

    // Getters

    public LocalDateTime getFecha() {
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

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public void setPorcentajeMultiplicador(double porcentajeMultiplicador) {
        this.porcentajeMultiplicador = porcentajeMultiplicador;
    }

    public void setRecompensaUnaCifra(long recompensaUnaCifra) {
        this.recompensaUnaCifra = recompensaUnaCifra;
    }

    public void setRecompensaDosCifras(long recompensaDosCifras) {
        this.recompensaDosCifras = recompensaDosCifras;
    }

    public void setRecompensaTresCifras(long recompensaTresCifras) {
        this.recompensaTresCifras = recompensaTresCifras;
    }

    public void setRecompensaCuatroCifras(long recompensaCuatroCifras) {
        this.recompensaCuatroCifras = recompensaCuatroCifras;
    }
}
