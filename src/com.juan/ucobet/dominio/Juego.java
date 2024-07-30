package com.juan.ucobet.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Juego {

    // Atributos
    private List<Usuario> usuarios = new ArrayList<>();
    private long ingresos;
    private long deudas;
    private List<String> numerosVetados = new ArrayList<String>();
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

        return this.usuarios.stream().filter(u -> u.getBoletas().stream().anyMatch(b -> b.getNumero() == this.numeroGanador)).collect(Collectors.toList());
    }

    // pagarUsuarios
    public void pagarGanadoresUnaCifra(List<Usuario> ganadores){

//        ganadores.stream().filter(u -> u.getBoletas().forEach(b -> String.valueOf(b.getNumero())));

//        ganadores.forEach(u -> u.getBoletas().forEach(b -> this.deudas += (long) (this.recompensaUnaCifra * (b.getPuja() + (b.getPuja() * this.porcentajeMultiplicador)))));

    }

    // mostrarBalance
    // Función encargada de mostrar las ganancias/perdidas generadas luego de realizar el sorteo
    public void mostrarBalance() {

        this.usuarios.forEach(u -> u.getBoletas().forEach(b -> this.ingresos += b.getPuja()));

        long balance = this.ingresos - this.deudas;

        System.out.println(balance);

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
        numerosVetados.add(String.valueOf(numeroAVetar));


    }


    public boolean comparadorNumerosVetados(int numero){
        List<Character> listaCaracteres = new ArrayList<>();

        for (char c : String.valueOf(numero).toCharArray()) {
            listaCaracteres.add(c);
        }
        for (String numStr : numerosVetados) {
            char numChar = numStr.charAt(0);
            if (listaCaracteres.contains(numChar)) {
                return true;
            }
        }

        return false;
    }
    // Getters

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

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
        for (String elemento: numerosVetados) {
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
