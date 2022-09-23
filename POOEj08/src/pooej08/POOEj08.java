package pooej08;

import Entidad.Cadena;
import Servicio.CadenaService;
import java.util.Scanner;

public class POOEj08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CadenaService cs = new CadenaService();
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        Cadena c1 = cs.crearCadena(frase);
        
        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        System.out.println("Ingrese un caracter para ver si se repite");
        String letra = leer.nextLine();
        cs.vecesRepetido(letra, c1);
        System.out.println("Ingrese una nueva frase para comparar longitudes");
        String fraseNueva = leer.nextLine();
        cs.compararLongitud(fraseNueva, c1);
        System.out.println("Ingrese una nueva frase para unir a la principal");
        String fraseAUnir = leer.nextLine();
        cs.unirFrases(fraseAUnir, c1);
        System.out.println("Ingrese una letra para reemplazar todas las 'a' de la frase");
        String reemplazaA = leer.nextLine();
        cs.reemplazar(reemplazaA, c1);
        System.out.println("Ingrese una letra para buscar en la frase");
        String buscarLetra = leer.nextLine();
        cs.contiene(buscarLetra, c1);
    }

}
