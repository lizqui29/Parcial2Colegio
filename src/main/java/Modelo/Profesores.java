/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Profesores extends Persona {
    private int cedula;
    private String areaTrabajo;
    private double salarioPorHora;
    private int horas;
    private Calculadora calculadora;

    public Profesores(String nombre, String direccion, int telefono, int dia, String mes, int año, int cedula, String areaTrabajo, double salarioPorHora, int horas) {
        super(nombre, direccion, telefono, dia, mes, año);
   
        this.cedula = cedula;
        this.areaTrabajo = areaTrabajo;
        this.salarioPorHora = salarioPorHora;
        this.horas = horas;
        this.calculadora = new Calculadora();
        
    }

    public int getCedula() {
        return cedula;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public int getHoras() {
        return horas;
    }
    
    

     public double calcularSalarioMensual() {
        double salarioBase = calculadora.calcularSalarioBase(salarioPorHora, horas);
        double preparacion = calculadora.calcularPreparacion(salarioBase);
        return salarioBase + preparacion;
    }
    
    public double calcularPrestaciones() {
        double salarioMensual = calcularSalarioMensual();
        return calculadora.calcularPrestaciones(salarioMensual);
    }
    
    public double calcularSalarioTotal() {
        return calcularSalarioMensual() + calcularPrestaciones();
    }
    
    public double calcularSalarioMensual(int horasExtras) {
        int horasTotales = horas + horasExtras;
        double salarioBase = calculadora.calcularSalarioBase(salarioPorHora, horasTotales);
        double preparacion = calculadora.calcularPreparacion(salarioBase);
        return salarioBase + preparacion;
    }
    
    public double calcularSalarioMensual(double bonoAdicional) {
        return calcularSalarioMensual() + bonoAdicional;
    }
    
    
    
    @Override
    public String mostrarInfo() {
        return "Nombre: " + nombre + ", Cédula: " + cedula + ", Telefono: " + telefono + ", Dirección: " + direccion +
                ", Fecha de nacimiento: " + dia + "/" + mes + "/" + año + 
               ", Área: " + areaTrabajo + ", Salario Total: " + calcularSalarioTotal();
    }
    
    
    
    
}
