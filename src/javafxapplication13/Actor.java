/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

/**
 * Representa a un actor y sus propiedades
 *
 * @author Alex Clemente < DAW >
 */
public class Actor {

    private int idActor;
    private String nombre;
    private String apellido;

    /**
     * Constructor con todos los atributos
     * 
     * @param idActor
     * @param nombre
     * @param apellido 
     */
    public Actor(int idActor, String nombre, String apellido) {
        this.idActor = idActor;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
