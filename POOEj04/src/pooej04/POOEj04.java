package pooej04;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

public class POOEj04 {

    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo r1 = rs.crearRectangulo();
        rs.perimetroRectangulo(r1);
        rs.superficieRectangulo(r1);
        rs.dibujarRectangulo(r1);
    }

}
