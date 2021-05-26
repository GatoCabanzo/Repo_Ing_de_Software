/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dto.Visita;
import logica.OperVisita;

/**
 *
 * @author alejo
 */
public class pruebas {
    public static void main(String[] args) {
        
        Visita v = new Visita();
        v.setNombre_tecnico("aaaa");
        v.setFecha("aaaa");
        v.setHora("aaaa");
        v.setMotivo_visita("aaaa");
        v.setDireccion("aaaa");
        OperVisita oper = new OperVisita();
        oper.insertar(v);
        
        
        
        
    }
}
