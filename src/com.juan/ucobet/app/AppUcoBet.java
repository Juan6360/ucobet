package com.juan.ucobet.app;

import com.juan.ucobet.dominio.Boleta;
import com.juan.ucobet.dominio.Historial;
import com.juan.ucobet.dominio.Juego;
import com.juan.ucobet.dominio.Usuario;

import java.util.Scanner;

public class AppUcoBet {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Historial historial = new Historial();
        Scanner in = new Scanner(System.in);
        int opc;

        System.out.println("Bienvenido a UCO BET, seleccione una opción:");
        System.out.println("1.- Usuario");
        System.out.println("2.- Administrador");
        System.out.println("3.- Salir");
        opc = in.nextInt();

        switch (opc) {
            case 1:
                // Lógica para crear un nuevo jugador
                in.nextLine(); // Limpiar el buffer

                System.out.println("Ingrese su nombre: ");
                String nombre = in.nextLine();

                System.out.println("Ingrese su Cedula: ");
                int identificacion = Integer.parseInt(in.nextLine());

                System.out.println("Ingrese su correo: ");
                String correo = in.nextLine();

                System.out.println("Ingrese su celular: ");
                int celular = in.nextInt();

                System.out.println("Ingrese su número de boleta : ");
                int numero = in.nextInt();

                System.out.println("Ingrese el valor de su apuesta: ");
                int puja = in.nextInt();

                // Crear un nuevo objeto Jugador
                Usuario usuario1 = new Usuario(nombre,identificacion, correo, celular,new Boleta(numero,puja));

                // Mostrar la información del jugador
                System.out.println("Informacion Ingresada:");
                historial.historial.forEach(System.out::println);

                break;

            case 2:


                break;

            case 3:
                System.out.println("Salieendo");
                System.exit(0);

            default:
                System.out.println("Opción incorrecta");
                break;
        }

        in.close();



    }
}