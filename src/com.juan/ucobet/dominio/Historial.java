package com.juan.ucobet.dominio;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    public List<Usuario> historial = new ArrayList<>();

    //Metodo que guarda los objetos de Usuario en una Lista
    public void guardarUsuario(Usuario usuario){
        new ArrayList<>();
        this.historial.add(usuario);
    }


}
