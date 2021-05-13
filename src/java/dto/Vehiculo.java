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
public class Vehiculo {
    private Long id;
    private String marca;
    private Long modelo;
    private Long motor;
    private String ruedas;
    private String color;

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
    
    

    @Override
    public String toString() {
        return this.marca + "" + 
                this.modelo + "" + 
                this.motor + "" + 
                this.ruedas + "" +
                this.color;
    }
    
}
