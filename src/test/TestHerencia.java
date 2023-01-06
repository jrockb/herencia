
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author jcd
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        //Empleado empleado1 = new Empleado(); // si la clase esta vacia se traen los parametros de la clase padre
        //System.out.println(empleado1); // clase vacia: Persona{nombre=null, genero= , edad=0, direccion=null}
        Empleado empleado1 = new Empleado("Juan", 5000.0); // ahora se ve la informacion de Empleado
        System.out.println("empleado = "+ empleado1);
        Cliente cliente1 = new Cliente(new Date(), true, "Andrea", 'F', 24, "Av siewmpre viva no. 743");
        System.out.println(cliente1);
    }
    
}
