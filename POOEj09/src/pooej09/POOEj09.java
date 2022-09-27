package pooej09;

import Entidad.Matematica;
import Servicio.MatematicaService;
import java.util.Scanner;

public class POOEj09 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        MatematicaService ms = new MatematicaService();
        
        int a, b;
        
        a = (int) (Math.random()*10);
        b = (int) (Math.random()*10);
        Matematica m1 = ms.crearMatematica(a, b);
        System.out.println("El mayor de los dos numeros es: " + ms.devolverMayor(m1));
        System.out.println("El resultado del mayor numero elevado al menor numero es: " + ms.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del menor numero es: " + ms.calculaRaiz(m1));
        
    }

}
