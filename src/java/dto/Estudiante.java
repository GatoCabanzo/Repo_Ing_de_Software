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
public class Estudiante {
    private Long id;
    private String nombre;
    private String apellido;
    private Long identificacion;
    private Programa programaestudio;
    private Integer activo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Long identificacion) {
        this.identificacion = identificacion;
    }

    public Programa getProgramaestudio() {
        return programaestudio;
    }

    public void setProgramaestudio(Programa programaestudio) {
        this.programaestudio = programaestudio;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return this.nombre +""+
                this.apellido+""+
                this.identificacion+""+
                this.programaestudio.getNombre()+""+
                this.activo;
    }
    
}
