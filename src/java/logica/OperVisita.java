/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import database.Conexiones;
import dto.Visita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejo
 */
public class OperVisita implements Operaciones{
    
    public int insertar(Visita dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into visitas (Nombre_Tecnico, Fecha_visita, Hora_visita, Direccion, Motivo_visita) values (?,?,?,?,?)";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setString(1, dato.getNombre_tecnico());
                ps.setString(2, dato.getFecha());
                ps.setString(3, dato.getHora());
                ps.setString (4, dato.getDireccion());
                ps.setString(5,dato.getMotivo_visita());
                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperVisita.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }

    @Override
    public int borrar(long id) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_borrar = "DELETE from visitas WHERE id=?";
                PreparedStatement ps =  cActiva.prepareStatement(sql_borrar);
                ps.setLong(1,id);
                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperVisita.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }

    public int actualizar(Visita dato) {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_actualizar = "UPDATE visitas SET marca=?, motor=?, modelo=?, ruedas=?, color=? WHERE id=?";
                PreparedStatement ps =  cActiva.prepareStatement(sql_actualizar);
                ps.setString(1, dato.getNombre_tecnico());
                ps.setString(2, dato.getFecha());
                ps.setString(3, dato.getHora());
                ps.setString (4, dato.getDireccion());
                ps.setString(5,dato.getMotivo_visita());
                ps.setLong(6, dato.getId());
                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperVisita.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }
     
    @Override
    public ArrayList listar() {
        Conexiones c = new Conexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_actualizar = "select * from visitas";
                //PreparedStatement ps =  cActiva.prepareStatement(sql_actualizar);
                Statement algo = cActiva.createStatement();
                ResultSet r = algo.executeQuery(sql_actualizar);
                ArrayList<Visita> array = new ArrayList<>();
                while(r.next()){
                    Visita v = new Visita();
                    v.setId(r.getLong("id"));
                    v.setNombre_tecnico(r.getString("Nombre"));
                    v.setFecha(r.getString("Fecha"));
                    v.setHora(r.getString("Hora"));
                    v.setDireccion(r.getString("Dirección"));
                    v.setMotivo_visita(r.getString("Motivo"));
                    array.add(v);
                }
                
                return array;
            } catch (SQLException ex) {
                Logger.getLogger(OperVisita.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return null;
    }

    @Override
    public int insertar(Object dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizar(Object dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
