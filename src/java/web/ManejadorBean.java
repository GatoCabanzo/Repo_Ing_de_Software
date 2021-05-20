/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import dto.Visita;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import logica.OperVisita;

/**
 *
 * @author alejo
 */
@ManagedBean
@SessionScoped
public class ManejadorBean implements Serializable{
    
    private Long id;
    private String nombreTecnico;
    private String fechaVisita;
    private String horaVisita;
    private String direccion;
    private String motivoVisita;
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
    
    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    public ManejadorBean() {
    }
    public void guardar(){
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setNombre_tecnico(this.nombreTecnico);
        v.setFecha(this.fechaVisita);
        v.setHora(this.horaVisita);
        v.setDireccion(this.direccion);
        v.setMotivo_visita(this.motivoVisita);

        System.out.println("Visita "+v);
        //this.mensaje = "Se almacenó";
        int valor= oper.insertar(v);
        System.out.println("valor de v"+valor);
        if (valor >0){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se ha registrado la información de la visita"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente al registrar la información de la visita"));
        }
    }
    
    public void borrar(){
        long algo=this.id;
        OperVisita oper = new OperVisita();
        oper.borrar(algo);
        this.mensaje="Visita cancelada exitosamente";
        System.out.println(algo);
    }
    
    public void actualizar(){
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(this.id);
        v.setNombre_tecnico(this.nombreTecnico);
        v.setFecha(this.fechaVisita);
        v.setHora(this.horaVisita);
        v.setDireccion(this.direccion);
        v.setMotivo_visita(this.motivoVisita);
        oper.actualizar(v);
        this.mensaje="Visita actualizada exitosamente";
        System.out.println(v.toString());
    }
    
    public void listar(){
        OperVisita oper = new OperVisita();
        setLista(oper.listar());
        
    }
    
}
