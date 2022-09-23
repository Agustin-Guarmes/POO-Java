package pooej07;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

public class POOEj07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        
        int contadorPesoIdeal = 0;
        int contadorSobrepeso = 0;
        int contadorBajoPeso = 0;
        int contadorMayorEdad = 0;
        
        System.out.println("Ingrese cantidad de personas a crear");
        int cantidadPersonas = leer.nextInt();
        Persona[] personas = new Persona[cantidadPersonas];
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Datos persona: " + (i+1));
            personas[i] = ps.crearPersona();
        }
        
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Persona " + (i+1));
            int imc = ps.calcularIMC(personas[i]);
            switch (imc) {
                case -1:
                    System.out.println("La persona está por debajo de su peso ideal");
                    contadorBajoPeso ++;
                    break;
                case 0:
                    System.out.println("La persona está en su peso ideal");
                    contadorPesoIdeal ++;
                    break;
                case 1:
                    System.out.println("la persona tiene sobrepeso");
                    contadorSobrepeso ++;
                    break;
            }
            boolean mayoriaEdad = ps.esMayorDeEdad(personas[i]);
            if (mayoriaEdad) {
                System.out.println("La persona es mayor de 18 años");
                contadorMayorEdad ++;
            } else {
                System.out.println("La persona es menor de edad");
            }
            System.out.println("");
        }
        
        System.out.println("");
        porcentajePersonasImc(cantidadPersonas, contadorBajoPeso, contadorPesoIdeal, contadorSobrepeso);
        System.out.println("");
        porcentajeMayoriaEdad (cantidadPersonas, contadorMayorEdad);
        
    }
    
    public static void porcentajePersonasImc (int cantidadPersonas, int contadorBajoPeso, int contadorPesoIdeal, int contadorSobrepeso){
        System.out.println("En relacion al IMC, de las " + cantidadPersonas + " personas");
        System.out.println("El porcentaje que se encuantra por debajo de su peso ideal es: " + (100*contadorBajoPeso/cantidadPersonas) + " %.");
        System.out.println("El porcentaje que se encuantra en su peso ideal es: " + (100*contadorPesoIdeal/cantidadPersonas) + " %.");
        System.out.println("El porcentaje que se encuantra por encima de su peso ideal es: " + (100*contadorSobrepeso/cantidadPersonas) + " %.");
    }
    
    public static void porcentajeMayoriaEdad (int cantidadPersonas, int contadorMayorEdad){
        System.out.println("En relacion a la mayoria de edad, de las " + cantidadPersonas + " personas");
        System.out.println("El porcentaje de mayores de edad es: " + (100*contadorMayorEdad/cantidadPersonas) + " %.");
        System.out.println("El porcentaje de menores de edad es: " + (100-(100*contadorMayorEdad/cantidadPersonas)) + " %.");
    }

}