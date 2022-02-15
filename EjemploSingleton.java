package ejemplosingleton;

/**
 *
 * @author https://jarroba.com/patron-singleton-en-java-con-ejemplos/
 */
public class EjemploSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*1*/SoyUnico jorazaki = SoyUnico.getSingletonInstance("Nathan Jorazaki");
        /*2*/SoyUnico neo = SoyUnico.getSingletonInstance("Neo Ikazaroj");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(neo.getNombre());
        System.out.println(jorazaki.getNombre());
    }
    
}
