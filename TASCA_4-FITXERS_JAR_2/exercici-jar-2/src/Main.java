import es.iesmz.prueba.Coche;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    static Coche coche;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        coche = new Coche( "Fiat", "Panda", "Groc");

        menu();
    }

    public static void menu() {
        boolean salir = false;

        while (salir != true) {
            System.out.print("\n-Introduce un numero-\n"+
                    "1.Print Data\n"+
                    "2.Pintar coche\n"+
                    "3.Introduir Marca\n"+
                    "4.Introduir Modelo\n"+
                    "5.Introduir Color\n"+
                    "6.Accelerar\n"+
                    "7.Frenar\n"+
                    "8.Parar\n"+
                    "9.Salir\n"+
                    "Enter: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    printData();
                    break;
                case 2:
                    pintar();
                    break;
                case 3:
                    setMarca();
                    break;
                case 4:
                    setModel();
                    break;
                case 5:
                    setColor();
                    break;
                case 6:
                    accelerar();
                    break;
                case 7:
                    frenar();
                    break;
                case 8:
                    parar();
                    break;
                case 9:
                    salir = true;
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }

    public static void printData() {
        coche.imprime();
    }

    public static void setMarca() {
        System.out.print("Introduce la marca del vehiculo: ");
        String marca = sc.next();

        coche.setMarca(marca);
    }

    public static void setModel() {
        System.out.print("Introduce el modelo del vehiculo: ");
        String modelo = sc.next();

        coche.setModelo(modelo);
    }

    public static void setColor() {
        System.out.print("Introduce el modelo del vehiculo: ");
        String color = sc.next();

        coche.setColor(color);
    }

    public static void pintar() {
        coche.pinta();
    }
    public static void parar() {
        coche.para();
        System.out.println("Stop!");
    }

    public static void accelerar() {
        System.out.print("Introduce la velocidad a aumentar: ");
        int acc = sc.nextInt();

        coche.acelera(acc);
    }

    public static void frenar() {
        System.out.print("Introduce la velocidad a decelerar: ");
        int dec = sc.nextInt();

        coche.frena(dec);
    }
}