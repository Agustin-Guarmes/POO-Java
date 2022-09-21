package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base en cm");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura en cm");
        r1.setAltura(leer.nextDouble());
        return r1;
    }
    
    public void superficieRectangulo(Rectangulo r1){
        System.out.println("La superficie del rectangulo es: " + r1.getBase()*r1.getAltura() +" cm2");
    }
    public void perimetroRectangulo(Rectangulo r1){
        System.out.println("El perimetro del rectangulo es: " + (2*(r1.getBase()+r1.getAltura())) +" cm");
    }
    public void dibujarRectangulo(Rectangulo r1){
        for (int i = 0; i < (r1.getBase()-1); i++) {
            System.out.print("*");
        }
        System.out.println("*");
        for (int i = 0; i < (r1.getAltura()-2); i++) {
            System.out.print("*");
            for (int j = 0; j < (r1.getBase()-2); j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < (r1.getBase()-1); i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
