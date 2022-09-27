
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;


public class CircunferenciaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese radio de circunferencia");
        c1.setRadio(leer.nextDouble());
        c1.area();
        c1.perimetro();
        return c1;
    }
    
}
