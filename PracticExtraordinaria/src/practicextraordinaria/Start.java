package practicextraordinaria;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author emmar
 */
public class Start {
    public static Aplicacion app;
  
 
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        app = new Aplicacion();
        app.registrarse();
        
    }
    
}
