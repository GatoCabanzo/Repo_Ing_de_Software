/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import dto.Vehiculo;
import logica.OperVehiculo;

/**
 *
 * @author alejo
 */
public class pruebas {
    
    public static void main(String[] args) {
        Vehiculo h= new Vehiculo();
        h.setId((long)11);
        h.setMarca("chepito");
        h.setModelo((long)1000);
        h.setMotor((long)1100);
        h.setRuedas("Pirelli");
        h.setColor("Amarillo");
        
        OperVehiculo o = new OperVehiculo();
        //o.insertar(h);
        //o.borrar(11);
        //o.actualizar(h);
        //System.out.println(o.listar());
    }
    
}
