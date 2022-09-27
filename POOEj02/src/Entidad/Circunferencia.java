
package Entidad;


public class Circunferencia {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void area(){                    //me dicen que lo pase al service
        System.out.println("El área es" + Math.PI*Math.pow(radio, 2));
    }
    
    public void perimetro(){                //me dicen que lo pase al service
        System.out.println("El perimetro es" + 2*Math.PI*radio);
    }

    public Circunferencia() {
    }
}
