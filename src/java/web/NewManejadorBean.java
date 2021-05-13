/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dto.Vehiculo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import logica.OperVehiculo;

/**
 *
 * @author alejo
 */
@ManagedBean
@SessionScoped
public class NewManejadorBean implements Serializable{
    
    private Long id;
    private String marca;
    private Long modelo;
    private Long motor;
    private String ruedas;
    private String color;
    private String mensaje;
    private ArrayList lista;

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getModelo() {
        return modelo;
    }

    public void setModelo(Long modelo) {
        this.modelo = modelo;
    }

    public Long getMotor() {
        return motor;
    }

    public void setMotor(Long motor) {
        this.motor = motor;
    }

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    public NewManejadorBean() {
    }
    public void guardar(){
        OperVehiculo oper = new OperVehiculo();
        Vehiculo v = new Vehiculo();
        v.setMarca(this.marca);
        v.setModelo(this.modelo);
        v.setMotor(this.motor);
        v.setRuedas(this.ruedas);
        v.setColor(this.color);

        System.out.println("Vehiculito "+v);
        //this.mensaje = "Se almacenó";
        int valor= oper.insertar(v);
        System.out.println("valor de v"+valor);
        if (valor >0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Almacenó el vehiculo"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconvenienteeeee "));
        }
    }
    
    public void borrar(){
        long algo=this.id;
        OperVehiculo oper = new OperVehiculo();
        oper.borrar(algo);
        this.mensaje="Eliminado exitosamente";
        System.out.println(algo);
    }
    
    public void actualizar(){
        OperVehiculo oper = new OperVehiculo();
        Vehiculo v = new Vehiculo();
        v.setId(this.id);
        v.setMarca(this.marca);
        v.setModelo(this.modelo);
        v.setMotor(this.motor);
        v.setRuedas(this.ruedas);
        v.setColor(this.color);
        oper.actualizar(v);
        this.mensaje="Actualizado exitosamente";
        System.out.println(v.toString());
    }
    
    public void listar(){
        OperVehiculo oper = new OperVehiculo();
        setLista(oper.listar());
        
    }
    
}
