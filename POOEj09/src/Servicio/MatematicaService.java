package Servicio;

import Entidad.Matematica;

public class MatematicaService {
    
    public Matematica crearMatematica(int a, int b) {
        
        Matematica m1 = new Matematica(a, b);
        System.out.println("n1: " + m1.getN1() + ". n2: " + m1.getN2() + ".");
        
        return m1;
    }
    
    public int devolverMayor(Matematica m1) {
        return Math.max(m1.getN1(), m1.getN2());
    }
    
    public int calcularPotencia(Matematica m1) {
        double mayor = (double) devolverMayor(m1);
        double menor;
        
        if (mayor == m1.getN1()) {
            menor = (double) m1.getN2();
        } else {
            menor = (double) m1.getN1();
        }
        
        return ((int) (Math.pow(mayor, menor)));
    }
    
    public double calculaRaiz(Matematica m1) {
        double menor = (double) Math.abs(Math.min(m1.getN1(), m1.getN2()));
        return Math.sqrt(menor);
    }
}
