package com.juan.ucobet.app;


import com.juan.ucobet.dominio.Admin;
import com.juan.ucobet.dominio.Juego;
import com.juan.ucobet.dominio.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class AppUcoBet {
        public static void main(String[] args) {

            Juego juego = new Juego();
            Scanner in = new Scanner(System.in);
            int opc = 0;

            /*
            Menu 1:
            - Opcion ingreso como usuario

            - Opcion ingreso como admin

            - Opcion exit

            Menu 2:
            Submenu de usuario:
            - Opcion de jugar
                * Mostrar la informacion de cada sorteo (recompensa y la fecha)
                    + El usuario debe subministrar la informacion de su boleta

            - Opcion de ver historial
                * Mostrar las boletas que a creado el usuario

            - Salir del programa
                * Me devuelve al menu 1

            Submenu de administrador:
            - Opcion de crear un sorteo (ecoger numero ganador)
                * Ingresa dia en que juega
                * Ingresa la recompensa
                * Ingresa porcentaje multiplicador (Se ingresa como entero y luego se divide por 100)

            - Opcion de vetar numeros

            - Opcion mostrar balance

            - Salir del programa
                * Me devuelve al menu 1
             */

            // Inicio de la app

            while(opc != 3){

                // Menu principal

                System.out.println("Bienvenido a UCO BET, seleccione una opción:");
                System.out.println("1.- Usuario");
                System.out.println("2.- Administrador");
                System.out.println("3.- Exit");
                opc = in.nextInt();

                // Switch del menu principal

                switch (opc) {

                    // Aplicacion usuario
                    case 1:

                        // Variable que almacena la decisión de usuario en el submenu de usuario
                        int opc_usuario = 0;

                        // Lógica para ingresar usuario

                        in.nextLine(); // Limpiar el buffer

                        System.out.println("Ingrese su nombre: ");
                        String nombre = in.nextLine();

                        System.out.println("Ingrese su Cedula: ");
                        int identificacion = Integer.parseInt(in.nextLine());

                        System.out.println("Ingrese su correo: ");
                        String correo = in.nextLine();

                        System.out.println("Ingrese su celular: ");
                        long celular = Long.parseLong(in.nextLine());

                        // Creacion del usuario
                        Usuario nuevoUsuario = new Usuario(nombre, identificacion, correo, celular);

                        // Ciclo del submenu de usuario
                        while(opc_usuario != 3){

                            System.out.println("1.- Jugar sorteo.");
                            System.out.println("2.- Ver historial de juego.");
                            System.out.println("3.- Cerrar sesión");
                            opc_usuario = in.nextInt();

                            // Switch del submenu de usuario
                            switch (opc_usuario){

                                // Jugar sorteo
                                case 1:

                                    // Variable que almacena la opcion del menu de juego
                                    int opc_boleta;

                                    // Menu del juego

                                    System.out.println(STR."Recompensas: \nFecha: \{juego.getFecha()} | \{juego.getHora()}");
                                    System.out.println(STR."Sorteo una cifra: \{juego.getRecompensaUnaCifra()}");
                                    System.out.println(STR."Sorteo dos cifras: \{juego.getRecompensaDosCifras()}");
                                    System.out.println(STR."Sorteo tres cifras: \{juego.getRecompensaTresCifras()}");
                                    System.out.println(STR."Sorteo cuatro cifras: \{juego.getRecompensaCuatroCifras()}");
                                    System.out.println("1. Comprar boleta.");
                                    System.out.println("2. Volver.");
                                    opc_boleta = in.nextInt();

                                    // Switch para el juego
                                    switch (opc_boleta){

                                        // Comprar boleta
                                        case 1:

                                            in.nextLine(); // Limpiar el buffer

                                            System.out.println("Los numeros vetados son: "+ juego.getNumerosVetados());

                                            // Logica para la creacion de boletas
                                            System.out.println("Ingrese numero a jugar: ");
                                            int numero = Integer.parseInt(in.nextLine());

                                            System.out.println("Ingrese numero la puja: ");
                                            int puja = Integer.parseInt(in.nextLine());

                                            System.out.println("Su boleta a sido creada.");

                                            // Creacion de nueva boleta
                                            nuevoUsuario.crearBoleta(numero, puja);

                                            break;

                                        // Volver
                                        case 2:
                                            break;
                                    }
                                    break;

                                // Ver historial
                                case 2:

                                    juego.mostrarBoletas(nuevoUsuario);

                                    in.nextLine(); // Limpiar el buffer

                                    System.out.println("\n1. Volver.");
                                    int opc_historial = Integer.parseInt(in.nextLine());

                                    if (opc_historial == 1){
                                        break;
                                    }

                                case 3:

                                    System.out.println("Saliendo...");

                                    break;
                            }

                        }
                        break;

                    // Aplicacion Admin
                    case 2:

                        // Variable encargada de almacenar la eleccion del menu de admin
                        int opc_admin = 0;

                        // Lógica para ingresar admin

                        in.nextLine(); // Limpiar el buffer

                        System.out.println("Ingrese su nombre: ");
                        String nombre_admin = in.nextLine();

                        System.out.println("Ingrese su Cedula: ");
                        int identificacion_admin = Integer.parseInt(in.nextLine());

                        System.out.println("Ingrese su correo: ");
                        String correo_admin = in.nextLine();

                        System.out.println("Ingrese su celular: ");
                        long celular_admin = Long.parseLong(in.nextLine());

                        System.out.println("Ingrese su password: ");
                        String pass = in.nextLine();

                        // Creacion del admin
                        Admin nuevoAdmin = new Admin(nombre_admin, identificacion_admin, correo_admin, celular_admin, pass);

                        // Ciclo submenu admin
                        while (opc_admin != 4){

                            // Menu sorteo

                            System.out.println("1. Crear un sorteo.");
                            System.out.println("2. Vetar un numero.");
                            System.out.println("3. Balance.");
                            System.out.println("4. Cerrar sesion.");
                            opc_admin = in.nextInt();

                            // Switch submenu admin
                            switch (opc_admin){

                                // Crear un sorteo
                                case 1:

                                    // Logica para la creacion de un sorteo

                                // Vetar numeros
                                case 2:
                                    // pregunta cuantos son los numeros que se van a vetar en el sorteo actual
                                    System.out.println("¿cuantos numeros va a vetar del sorteo?");
                                    int cantidadNumVetar = in.nextInt();

                                    //for que ingresa los numeros que se vetaran
                                    for (int i = 0; i < cantidadNumVetar ; i++) {
                                        System.out.println("Ingresa el nuermo que vas a vetar");
                                        int varNumVetar = in.nextInt();

                                        juego.numerosAVetar(varNumVetar);
                                    }

                                    System.out.println("Numeros vetados: "+ juego.getNumerosVetados());

                                // Mostrar balance
                                case 3:

                                // Volver al menu 1
                                case 4:
                            }
                        }
                }

            }

        }
    }