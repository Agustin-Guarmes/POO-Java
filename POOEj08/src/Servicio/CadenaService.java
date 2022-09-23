package Servicio;

import Entidad.Cadena;

public class CadenaService {
    
    public Cadena crearCadena(String frase) {
        Cadena c1 = new Cadena();
        c1.setFrase(frase);
        c1.setLongFrase(frase.length());
        return c1;
    }
    
    public void mostrarVocales(Cadena c1) {
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        char vocal;
        
        for (int i = 0; i < c1.getFrase().length(); i++) {
            vocal = c1.getFrase().charAt(i);
            switch (vocal) {
                case 'a':
                    contadorA ++;
                    break;
                case 'e':
                    contadorE ++;
                    break;
                case 'i':
                    contadorI ++;
                    break;
                case 'o':
                    contadorO ++;
                    break;
                case 'u':
                    contadorU ++;
                    break;
            }
        }
        
        System.out.println("Cantidades. A: " + contadorA + ". E: " + contadorE + ". I: " + contadorI + ". O: " + contadorO + ". U: " + contadorU);
    }
    
    public void invertirFrase(Cadena c1) {
        String letra;
        String fraseInvertida = "";
        for (int i = (c1.getLongFrase()-1); i >= 0 ; i--) {
            letra = c1.getFrase().substring(i, i+1);
            fraseInvertida = fraseInvertida.concat(letra);
        }
        System.out.println(fraseInvertida);
    }
    
    public void vecesRepetido(String letra, Cadena c1) {
        int contador = 0;
        String subFrase;
        for (int i = 0; i < c1.getLongFrase(); i++) {
            subFrase = c1.getFrase().substring(i, i+1);
            if (letra.equals(subFrase)) {
                contador ++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
    }
    
    public void compararLongitud(String fraseNueva, Cadena c1) {
        if (c1.getLongFrase() == fraseNueva.length()) {
            System.out.println("Ambas frases tienen igual longitud");
        } else {
            System.out.println("Las longitudes de las frases son distintas");
        }
    }
    
    public void unirFrases(String fraseAUnir, Cadena c1) {
        String fraseUnida = c1.getFrase().concat(fraseAUnir);
        System.out.println(fraseUnida);
    }
    
    public void reemplazar(String reemplazaA, Cadena c1) {
        System.out.println(c1.getFrase().replaceAll("a", reemplazaA));
    }
    
    public void contiene(String buscarLetra, Cadena c1) {
        boolean encontrada = c1.getFrase().contains(buscarLetra);
        System.out.println("¿Se encuentra dicha letra en la frase? " + encontrada);
    }
}
