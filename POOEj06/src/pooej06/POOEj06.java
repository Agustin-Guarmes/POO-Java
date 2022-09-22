package pooej06;

import Entidad.Cafetera;
import Servicio.CafeteraService;
import java.util.Scanner;

public class POOEj06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int capacidadMax, capacidadAct;
        System.out.println("Nueva cafetera");
        System.out.println("Ingrese su capacidad maxima");
        capacidadMax = leer.nextInt();
        System.out.println("Ingrese su capacidad actual");
        capacidadAct = leer.nextInt();
        CafeteraService cs = new CafeteraService();
        Cafetera c1 = cs.crearCafetera(capacidadMax, capacidadAct);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("Ingrese su opción");
            System.out.println("1- Llenar cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Estado de la cafetera");
            System.out.println("6- Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    int medidaTaza;
                    System.out.println("Ingrese medida de la taza a servir");
                    medidaTaza = leer.nextInt();
                    cs.servirTaza(c1, medidaTaza);
                    break;
                case 3:
                    cs.vaciarCafetera(c1);
                    break;
                case 4:
                    int cantidadCafe;
                    System.out.println("Ingrese cantidad de cafe a agregar");
                    cantidadCafe = leer.nextInt();
                    cs.agregarCafe(c1, cantidadCafe);
                    break;
                case 5:
                    cs.estadoCafetera(c1);
                    break;
                case 6:
                    System.out.println("FIN");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 6);

    }

}
