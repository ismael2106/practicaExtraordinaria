package practicextraordinaria;



import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
*
* @author paula
*/
public class Usuario {

Scanner lectura = new Scanner(System.in);

private String nick;
private String nombre;
private String contraseña;
private String numReg;
public File ficheroUsuario;

public Personaje personaje;
//private String tipo;



Usuario(String nick, String contraseña) {
    this.nick = nick;
    //this.nombre = nombre;
    this.contraseña = contraseña;
    //this.numReg = numReg;
    //this.ficheroUsuario = ficheroUsuario;
    //this.combatesGanados = combatesGanados;
}


public void setNick(String nick) {
    this.nick = nick;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
}

public void setNumReg(String numReg) {
    this.numReg = numReg;
}


public void setFicheroUsuario(File ficheroUsuario) {
    this.ficheroUsuario = ficheroUsuario;
}

public String getNick() {
    return nick;
}

public String getNombre() {
    return nombre;
}

public String getContraseña() {
    return contraseña;
}

public String getNumReg() {
    return numReg;
}

public File getFicheroUsuario() {
    return ficheroUsuario;
}



/*public void deserializarUsuario() throws FileNotFoundException, IOException, ClassNotFoundException{
    try{
    FileInputStream archivo = new FileInputStream("./personajes.bin");
    ObjectInputStream lectura = new ObjectInputStream(archivo);

    while(true){
    personaje = (Personaje) lectura.readObject();
    System.out.println(personaje.getNombre());
    }


    }catch(EOFException excepcion){
    return;
    }
    catch(IOException error){
    error.printStackTrace(System.out);
    }
    }
    public void serializarUsuario(Personaje personaje){
    try {
    FileOutputStream archivo = new FileOutputStream("./personajes.bin",true);
    try (AñadirContenido escritura = new AñadirContenido(archivo)) {
    escritura.writeObject(personaje);
    }
    }catch (IOException e) {
    }
}*/



public void registrarPersonaje() throws IOException {
    int numEsbirros = (int)(Math. random()*2+1);
    Personaje personaje = new Personaje();
    this.personaje = personaje;
    String ruta;
    //Boolean encontrado;
    //encontrado = false;
    ruta = "C:\\Users\\Usuario\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\PracticaMP\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\"+nick+".bin";
    /*try{
    this.deserializarUsuario();
    }catch(IOException | ClassNotFoundException e){
    File fichero = new File(ruta);
    fichero.createNewFile();
    }
    */
    File fichero = new File(ruta);
    //if (!fichero.exists()) {
    // fichero.createNewFile();
    // }

    personaje.getTipo();
    System.out.print("Escriba el nombre que desea para su personaje: ");
    String nombre = lectura.next();
    //personaje.setNombre(nombre);


    //serializarUsuario(personaje);
    //deserializarUsuario();
}


public void darDeBajaPersonaje(){
String ruta;
Boolean encontrado;
encontrado = false;
ruta = "C:\\Users\\Usuario\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\PracticaMP\\OneDrive - Universidad Rey Juan Carlos\\Documentos\\NetBeansProjects\\PracticaMP\\"+nick+".txt";
}

public void elegirEquipo(){
personaje.setEquipo();

}

public float verOro(){
return personaje.getOro();

}

public void consultarOro(){
verOro();
//recorrer el fichero de historial de combates y comprobar si tu nick está en desafiante o desafiado,
//y si es igual a uno de los dos, comprobar si también es igual al del ganador,
//si es igual, se muestra el oro ganado en ese combate, si no es igual se muestra pero en negativo
}

public void verRanking(){

}

public void salir(){
System.out.println("Hasta pronto!");
}



public void mostrarMenu() throws IOException, FileNotFoundException, ClassNotFoundException{
    //boolean contEquipo = false;
    boolean salida = false;
    while (salida == false){
    System.out.println("1) REGISTRAR PERSONAJE");
    System.out.println("2) DAR DE BAJA PERSONAJE");
    System.out.println("3) ELEGIR EQUIPO");
    System.out.println("4) CONSULTAR ORO");
    System.out.println("5) CONSULTAR EQUIPO");
    System.out.println("6) CONSULTAR ESBIRROS");
    System.out.println("7) SUBSCRIBIRSE A OFERTA");
    System.out.println("8) CREAR OFERTA");
    System.out.println("9) CONSULTAR OFERTAS PUBLICADAS");

    String c = lectura.next();

    if ("1".equals(c)){
        registrarPersonaje();
    }
    else if ("2".equals(c)){
        darDeBajaPersonaje();
    }
    else if ("3".equals(c)){
        elegirEquipo();
    }
    else if ("4".equals(c)){
        consultarOro();
    }
    else if ("5".equals(c)){
        consultarEquipo();
    }
    else if ("6".equals(c)){
        consultarEsbirros();
    }
    else if ("7".equals(c)){
        subscribirseOferta();
    }
    else if ("8".equals(c)){
        crearOferta();
    }
    else if ("9".equals(c)){
        consultarOfertas();
    }



    else if ("7".equals(c)){
        salida = true;
        salir();
    }
    else{
        System.out.println("Opción no válida");
    }
    }

}


}