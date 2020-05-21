/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.videoclub;

/**
 *
 * @author Chuck
 */
public class Socio extends Persona{
    
    public Tarjeta tarjeta;

    public Socio(Tarjeta tarjeta, String Nombre, int ID) {
        super(Nombre, ID);
        this.tarjeta = tarjeta;
    }
}
