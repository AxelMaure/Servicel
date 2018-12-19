/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gurpo_1.servicel;

/**
 *
 * @author Axel
 */
public class Cliente {
    private String Nombre;
    private Integer DNI;
    private Integer Nrocliente;
    private Integer Nrocelular;
    private String email;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getNrocliente() {
        return Nrocliente;
    }

    public void setNrocliente(Integer Nrocliente) {
        this.Nrocliente = Nrocliente;
    }

    public Integer getNrocelular() {
        return Nrocelular;
    }

    public void setNrocelular(Integer Nrocelular) {
        this.Nrocelular = Nrocelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", DNI=" + DNI + ", Nrocliente=" + Nrocliente + ", Nrocelular=" + Nrocelular + ", email=" + email + '}';
    }
    
            
}
