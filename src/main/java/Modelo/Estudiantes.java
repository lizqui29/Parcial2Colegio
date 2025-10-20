/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Estudiantes extends Persona {
    int codigo;
    int grado;

    public Estudiantes(String nombre, String direccion, int telefono, int dia, String mes, int año, int codigo, int grado) {
        super(nombre, direccion, telefono, dia, mes, año);
        this.codigo = codigo;
        this.grado = grado;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getGrado() {
        return grado;
    }
    
    @Override
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Código: " + codigo + 
               ", Grado: " + grado + ", Telefono: " + telefono + "Dirección: " + direccion +
                ", Fecha de nacimiento: " + dia + "/" + mes + "/" + año;
    }

}
