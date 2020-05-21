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
public class Pelicula {

    public String Nombre;
    public Persona persona;
    
    public Pelicula(String Nombre, Persona persona) {
        this.Nombre = Nombre;
        this.persona = persona;
    }
   
    @Override
    public String toString(){
        return "Nombre de la persona que alquilo esta pelicula: " + this.persona.Nombre + "\nNombre de la pelicula: " + this.Nombre;
    }
}
