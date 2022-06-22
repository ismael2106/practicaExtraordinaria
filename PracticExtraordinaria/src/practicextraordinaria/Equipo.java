/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicextraordinaria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emmar
 */
class Equipo {
    
    ArrayList listaArmas = new ArrayList<Arma>();
    ArrayList listaArmaduras = new ArrayList<Armadura>();
    
    

    public Equipo() {
        //inicializarEquipo();
  
    }

    public void setListaArmas(ArrayList listaArmas) {
        this.listaArmas = listaArmas;
    }

    public void setListaArmaduras(ArrayList listaArmaduras) {
        this.listaArmaduras = listaArmaduras;
    }
    
     public ArrayList getListaArmas() {
        return listaArmas;
    }

    public ArrayList getListaArmaduras() {
        return listaArmaduras;
    }
    
    
    
    
    
    
    
  /*  public void inicializarEquipo(){
        Scanner lectura = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 5; i++){
            switch(i){
                case 0:{
                        Arma arma1 = new Arma();
                        listaArmas.add(arma1);
                        listaArmas.get(i).setNombre("arma1");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(1);
                        listaArmas.get(i).setActivo(false);
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
                        
                case 1: {
                        Arma arma2 = new Arma();
                        listaArmas.add(arma2);
                        listaArmas.get(i).setNombre("arma2");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(1);
                        listaArmas.get(i).setActivo(false); 
                        
                        Armadura armadura2 = new Armadura();
                        listaArmaduras.add(armadura2);
                        listaArmaduras.get(i).setNombre("armadura2");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);
                        break;
                }
                case 2: {
                        Arma arma3 = new Arma();
                        listaArmas.add(arma3);
                        listaArmas.get(i).setNombre("arma3");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
                case 3:{
                        Arma arma4 = new Arma();
                        listaArmas.add(arma4);
                        listaArmas.get(i).setNombre("arma4");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura4 = new Armadura();
                        listaArmaduras.add(armadura4);
                        listaArmaduras.get(i).setNombre("armadura4");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                      
                        break;
                    
                }
                case 4:{
                        Arma arma5 = new Arma();
                        listaArmas.add(arma5);
                        listaArmas.get(i).setNombre("arma5");
                        listaArmas.get(i).setModAtaque(1);
                        listaArmas.get(i).setModDefensa(1);
                        listaArmas.get(i).setManos(2);
                        listaArmas.get(i).setActivo(false);
                        
                        
                        Armadura armadura1 = new Armadura();
                        listaArmaduras.add(armadura1);
                        listaArmaduras.get(i).setNombre("armadura1");
                        listaArmaduras.get(i).setModAtaque(1);
                        listaArmaduras.get(i).setModDefensa(1);
                        listaArmaduras.get(i).setActivo(false);                       
                        break;
                }
            }
            
                  
        }*/

   
    

    
    
}
