/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author alejo
 */
public class Visita {
    private Long id;
    private String nombre_tecnico;
    private String fecha;
    private String hora;
    private String direccion;
    private String motivo_visita;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_tecnico() {
        return nombre_tecnico;
    }

    public void setNombre_tecnico(String nombre_tecnico) {
        this.nombre_tecnico = nombre_tecnico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMotivo_visita() {
        return motivo_visita;
    }

    public void setMotivo_visita(String motivo_visita) {
        this.motivo_visita = motivo_visita;
    }

    @Override
    public String toString() {
        return this.nombre_tecnico + "" + 
                this.fecha + "" + 
                this.hora + "" + 
                this.direccion + "" + 
                this.motivo_visita ;
    }
    
    
    
    
}
