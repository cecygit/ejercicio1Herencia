/* 

*/
package ejercicio1herencia;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author Ceci Romano
 */
public class Ejercicio1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal perro1 = new Perro("Nala","carne",7,"siberiano");
      perro1.alimentarse();
      Animal perro2 = new Perro("Aisha","carne",9,"siberiano");
      perro2.alimentarse();
      Animal gato = new Gato("Micha","carne",5,"calle");
      gato.alimentarse();
      Animal caballo = new Caballo("jijo","pasto",4,"malacara");
      caballo.alimentarse();
      
    } 
    
}
