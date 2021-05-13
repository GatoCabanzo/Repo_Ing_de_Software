/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import dto.Estudiante;
import database.Conexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class OperEstudiante implements Operaciones<Estudiante>{

    @Override
    public int insertar(Estudiante dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into estudiante (nombre, apellido, identificacion, programaestudio, activo ) values (?,?,?,?,?)";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setString(1, dato.getNombre());
                ps.setString(2, dato.getApellido());
                ps.setLong(3, dato.getIdentificacion());
                ps.setString(4, dato.getProgramaestudio().getNombre());
                ps.setInt(5, dato.getActivo());
                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
                
    }
    
}
