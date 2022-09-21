package pooej03;

import Entidad.Operacion;
import Servicio.OperacionService;
import java.util.Scanner;

public class POOEj03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        OperacionService os = new OperacionService();
        Operacion o1 = os.crearOperacion();
        
        int opcion;
        System.out.println("Ingrese la opcion que desea hacer");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicacion");
        System.out.println("4: Division");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Suma");
                os.sumar(o1);
                break;
            case 2:
                System.out.println("Resta");
                os.restar(o1);
                break;
            case 3:
                System.out.println("Multiplicacion");
                os.multiplicar(o1);
                break;
            case 4:
                System.out.println("Division");
                os.dividir(o1);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

}
