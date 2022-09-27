
package pooej02;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

public class POOEj02 {

    public static void main(String[] args) {
        CircunferenciaService cs = new CircunferenciaService();
        Circunferencia c1 = cs.crearCircunferencia();
    }
}
