/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import database.NewConexiones;
import dto.Vehiculo;
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
public class OperVehiculo implements NewOperaciones<Vehiculo> {

    @Override
    public int insertar(Vehiculo dato) {
        NewConexiones c = new NewConexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into partes (marca, modelo, motor, ruedas, color) values (?,?,?,?,?)";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setString(1, dato.getMarca());
                ps.setLong(2, dato.getModelo());
                ps.setLong(3, dato.getMotor());
                ps.setString (4, dato.getRuedas());
                ps.setString(5,dato.getColor());
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

    @Override
    public int borrar(long id) {
        NewConexiones c = new NewConexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_borrar = "DELETE from partes WHERE id=?";
                PreparedStatement ps =  cActiva.prepareStatement(sql_borrar);
                ps.setLong(1,id);
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

    @Override
    public int actualizar(Vehiculo dato) {
        NewConexiones c = new NewConexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_actualizar = "UPDATE partes SET marca=?, motor=?, modelo=?, ruedas=?, color=? WHERE id=?";
                PreparedStatement ps =  cActiva.prepareStatement(sql_actualizar);
                ps.setString(1, dato.getMarca());
                ps.setLong(2, dato.getModelo());
                ps.setLong(3, dato.getMotor());
                ps.setString (4, dato.getRuedas());
                ps.setString(5,dato.getColor());
                ps.setLong(6, dato.getId());
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
     
    @Override
    public ArrayList listar() {
        NewConexiones c = new NewConexiones();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql_actualizar = "select * from partes";
                //PreparedStatement ps =  cActiva.prepareStatement(sql_actualizar);
                Statement algo = cActiva.createStatement();
                ResultSet r = algo.executeQuery(sql_actualizar);
                ArrayList<Vehiculo> array = new ArrayList<>();
                while(r.next()){
                    Vehiculo v = new Vehiculo();
                    v.setId(r.getLong("id"));
                    v.setMarca(r.getString("marca"));
                    v.setModelo(r.getLong("modelo"));
                    v.setMotor(r.getLong("motor"));
                    v.setRuedas(r.getString("ruedas"));
                    v.setColor(r.getString("color"));
                    array.add(v);
                }
                
                return array;
            } catch (SQLException ex) {
                Logger.getLogger(OperEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                c.desconectase(cActiva);
            }
        }
        return null;
    }
    
    
}
