import java.util.Scanner;

public class UcoBet {

    public static void main(String[] args) {
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

                System.out.println("Ingrese su nombre:");
                String nombre = in.nextLine();

                System.out.println("Ingrese su correo:");
                String correo = in.nextLine();

                System.out.println("Ingrese su celular:");
                int celular = in.nextInt();

                System.out.println("Ingrese su número de boleta :");
                int numero = in.nextInt();

                System.out.println("Ingrese el valor de su apuesta:");
                int valorApuesta = in.nextInt();

                // Crear un nuevo objeto Jugador
                Jugador nuevoJugador = new Jugador(nombre, correo, celular, numero, valorApuesta);

                // Mostrar la información del jugador
                System.out.println("Jugador creado:");
                System.out.println(nuevoJugador);

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
