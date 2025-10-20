/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected String nombre;
    protected String direccion;
    protected int telefono;
    protected int dia;
    protected String mes;
    protected int año;

    public Persona(String nombre, String direccion, int telefono, int dia, String mes, int año) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    
     public abstract String mostrarInfo();
    
}
