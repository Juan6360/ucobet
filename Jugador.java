import java.util.Scanner;

class Jugador {
    private String nombre;
    private String correo;
    private int celular;
    private int numero;
    private int valorApuesta;

    public Jugador(String nombre, String correo, int celular, int numero, int valorApuesta) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.numero = numero;
        this.valorApuesta = valorApuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCelular() {
        return celular;
    }


    public int getNumero() {
        return numero;
    }

    public int getValorApuesta() {
        return valorApuesta;
    }


    public String toString() {
        return "Jugador( nombre=" + nombre + ", correo=" + correo + ", celular=" + celular + ", numero de apuesta =" + numero + ", valor de tu boleta="+ valorApuesta +")";
    }
}

