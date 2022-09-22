package Servicio;

import Entidad.Cafetera;

public class CafeteraService {
    
    public Cafetera crearCafetera(int capacidadMax, int capacidadAct){
        Cafetera c1 = new Cafetera(capacidadMax, capacidadAct);
        return c1;
    }
    
    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("Cafetera llena, " + c1.getCantidadActual() + " de " + c1.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera c1, int medidaTaza){
        int alcanzado;
        if (c1.getCantidadActual() > medidaTaza) {
            System.out.println("Se lleno la taza de " + medidaTaza);
            c1.setCantidadActual(c1.getCantidadActual() - medidaTaza);
            System.out.println("En la cafetera queda " + c1.getCantidadActual());
        } else {
            alcanzado = c1.getCantidadActual();
            System.out.println("No se llenó la taza, se sirvió " + alcanzado + " de " + medidaTaza + ". La cafetera quedo vacía.");
            c1.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera (Cafetera c1){
        c1.setCantidadActual(0);
        System.out.println("Se vació la cafetera.");
    }
    
    public void agregarCafe (Cafetera c1, int cantidadCafe){
        int cantidadTotal = c1.getCantidadActual()+cantidadCafe;
        if (cantidadTotal > c1.getCapacidadMaxima()) {
            llenarCafetera(c1);
        } else {
            c1.setCantidadActual(cantidadTotal);
            System.out.println("Llenado: " + c1.getCantidadActual() + " de " + c1.getCapacidadMaxima());
        }
    }
    
    public void estadoCafetera(Cafetera c1){
        System.out.println("Cantidad actual: " + c1.getCantidadActual());
        System.out.println("Capacidad maxima: " + c1.getCapacidadMaxima());
    }
}
