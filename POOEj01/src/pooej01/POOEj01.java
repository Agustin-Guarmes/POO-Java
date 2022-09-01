package pooej01;

import Entidad.Persona;

public class POOEj01 {

    public static void main(String[] args) {
        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("Agustin");
        
        primeraPersona.setNombre("Guarmes");
        
        segundaPersona.getNombre();
    }
    
}
