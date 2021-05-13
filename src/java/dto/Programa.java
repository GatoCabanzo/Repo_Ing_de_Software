/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Vinni
 */
public enum Programa {
    SISTEMAS("Ingenieria de Sitemas"),
    AMBIENTAL("Ingenieria Ambiental"),
    PUBLICIDAD ("Publicidad"),
    DISENO("Publicidad y Diseño"); 
    private String nombre;

    Programa(String nombre){
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

}
    