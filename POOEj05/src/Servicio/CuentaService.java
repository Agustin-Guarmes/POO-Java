package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta altaCuenta(){
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI del cliente");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese saldo actual");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }
    
    public int ingresar(Cuenta c1, int ingreso){
        return (c1.getSaldoActual()+ingreso);
    }
    
    public int retirar(Cuenta c1, int retiro){
        if (retiro>c1.getSaldoActual()) {
            System.out.println("El dinero a retirar es mayor al saldo actual");
            System.out.println("Se retirará todo el dinero disponible");
            return 0;
        } else{
            return (c1.getSaldoActual()-retiro);
        }
    }
    
    public int extraccionRapida(Cuenta c1, int extraccion){
        if (extraccion>(0.2*c1.getSaldoActual())) {
            System.out.println("El máximo que se retirará es de " + 0.2*c1.getSaldoActual());
            return (1*c1.getSaldoActual());         //cambiar 1 por 0.8
        } else{
            return (c1.getSaldoActual()-extraccion);
        } 
    }
    
    public void consultarSaldo(Cuenta c1){
        System.out.println(c1.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta c1){
        System.out.println("Numero de la cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI del cliente; " + c1.getDniCliente());
        System.out.println("Saldo actual: " + c1.getSaldoActual());
    }
}
