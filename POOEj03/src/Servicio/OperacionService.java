package Servicio;

import Entidad.Operacion;
import java.util.Scanner;


public class OperacionService {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        Operacion o1 = new Operacion();
        System.out.println("Ingrese numero 1");
        o1.setNumero1(leer.nextInt());
        System.out.println("Ingrese numero 2");
        o1.setNumero2(leer.nextInt());
        return o1;
    }
    
    public void sumar(Operacion o1){
        System.out.println("El resultado de la suma es " + (o1.getNumero1()+o1.getNumero2()));
    }
    public void restar(Operacion o1){
        System.out.println("El resultado de la resta es " + (o1.getNumero1()-o1.getNumero2()));
    }
    public void multiplicar(Operacion o1){
        if (o1.getNumero1()==0 || o1.getNumero2()==0) {
            System.out.println("Uno o ambos de los numeros es igual a cero."
                    + " El resultado de la multiplicacion es " + o1.getNumero1()*o1.getNumero2());
        } else{
            System.out.println("El resultado de la multiplicacion es " + o1.getNumero1()*o1.getNumero2());
        }
    }
    public void dividir(Operacion o1){
        if (o1.getNumero2()==0) {
            System.out.println("ERROR! El divisor es igual a cero."
                    + " Se resuelve la divicion como " + 0);             //no es un salto de linea, sino que es para seguir escribiendo y que no se vaya de la pantalla el texto.
        } else{
            System.out.println("El resultado de la divicion es " + o1.getNumero1()/o1.getNumero2());
        }
    }
}
