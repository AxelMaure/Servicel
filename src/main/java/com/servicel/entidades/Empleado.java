/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicel.entidades;

/**
 *
 * @author Axel
 */
public class Empleado {
    private String nombre;
    private Integer dni;
    private String mail;
    private Integer celular;
    private Integer clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", mail=" + mail + ", celular=" + celular + ", clave=" + clave + '}';
    }
    
    
    
    
    
}
