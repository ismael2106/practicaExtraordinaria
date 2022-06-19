package practicextraordinaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
public class Aplicacion {
    
    File ficheroElegido;
    File ficheroUsuarios = new File ("./ficheroUsuarios.txt");
    File ficheroOperadores = new File ("./ficheroOperadores.txt");
    
    Aplicacion (){
    }
    
    public void registrarse () throws FileNotFoundException, IOException {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1)Registrarse como usuario");
        System.out.println("2)Registrarse como operador");
        String opcion = sc.next();
        
        if ("1".equals(opcion)){
            ficheroElegido = ficheroUsuarios;
        }
        else if ("2".equals(opcion)){
            ficheroElegido = ficheroOperadores;
        }
        
        System.out.print("Inserte su nick: ");
        String nick = sc.next();
        
        Scanner sc2 = new Scanner(ficheroElegido);
        boolean encontrado = false;
        
        while ((sc2.hasNextLine()) && (encontrado == false)){
            String nombre = sc2.next();
            if (!(nick.equals(nombre))){
                sc2.nextLine();
            }
            else{
                    System.out.println("Nick no disponible");
                    encontrado = true;
                    }    
            }
    
            
        if (encontrado == false){
            System.out.print("Inserte su contraseña: ");
            String contraseña = sc.next();
            
            FileWriter fw = new FileWriter(ficheroElegido,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(nick+" "+contraseña);
            
        }
    }
}
