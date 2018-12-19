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
public class Dispositivo {
    private String marca;
    private String color;
    private String modelo;
    private Integer garantia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getGarantia() {
        return garantia;
    }

    public void setGarantia(Integer garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", garantia=" + garantia + '}';
    }
    
}
