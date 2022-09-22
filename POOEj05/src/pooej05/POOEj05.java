package pooej05;

import Entidad.Cuenta;
import Servicio.CuentaService;
import java.util.Scanner;

public class POOEj05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int operacion;

        CuentaService cs = new CuentaService();
        Cuenta c1 = cs.altaCuenta();
        
        do {
            System.out.println("MENU");
            System.out.println("Ingrese operacion a realizar");
            System.out.println("1: Crear una cuenta nueva");
            System.out.println("2: Ingresar dinero");
            System.out.println("3: Retirar dinero");
            System.out.println("4: Extraccion rapida");
            System.out.println("5: Consultar saldo");
            System.out.println("6: Consultar datos");
            System.out.println("0: Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    //Cuenta c1 = cs.altaCuenta();
                    break;
                case 2:
                    System.out.println("Ingrese cantidad de dinero a ingresar");
                    operacion = leer.nextInt();
                    c1.setSaldoActual(cs.ingresar(c1, operacion));
                    break;
                case 3:
                    System.out.println("Ingrese cantidad de dinero a retirar");
                    operacion = leer.nextInt();
                    c1.setSaldoActual(cs.retirar(c1, operacion));
                    break;
                case 4:
                    System.out.println("Ingrese cantidad a extraer");
                    operacion = leer.nextInt();
                    c1.setSaldoActual(cs.extraccionRapida(c1, operacion));
                    break;
                case 5:
                    System.out.println("Su saldo es: ");
                    cs.consultarSaldo(c1);
                    break;
                case 6:
                    System.out.println("Datos: ");
                    cs.consultarDatos(c1);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
}