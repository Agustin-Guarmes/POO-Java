package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        Persona p1 = new Persona();
        char letra;
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona en años");
        p1.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo de la persona");
            System.out.println("Usando: 'H' hombre, 'M' mujer, 'O' otro");
            letra = leer.next().charAt(0);

        } while (letra != 'h' && letra != 'H' && letra != 'm' && letra != 'M' && letra != 'o' && letra != 'O');
        p1.setSexo(letra);
        System.out.println("Ingrese el peso de la persona en kg");
        p1.setPeso(leer.nextFloat());
        System.out.println("Ingrese la altura de la persona en metros");
        p1.setAltura(leer.nextFloat());
        return p1;
    }
    
    public int calcularIMC(Persona p1) {
        float imc = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        System.out.println("IMC: " + imc);
        if (imc<20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
        
    }
    
    public boolean esMayorDeEdad(Persona p1) {
        return (p1.getEdad() >= 18);
    }
    
    public void mostrarDatosPersona(Persona p1) {
        System.out.println(p1.toString());
    }
}
