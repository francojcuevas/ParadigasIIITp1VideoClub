/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.videoclub;

/**
 *
 * @author Franco Javier Cuevas
 */
public class Tp1VideoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Creando instancia de Clase Videoclub;
        VideoClub miVideoClub = new VideoClub("Oscar's VideoClub");
        
        //Creando instancia de Clase Persona;
        Persona miPersona = new Persona ("Christian",1831);
        
        //Creando instancia de Clase Pelicula;
        Pelicula miPelicula = new Pelicula ("Avengers",miPersona);
        
        //Usando toString para imprimir objetos por consola;
        System.out.println(miPelicula);
    }

}
