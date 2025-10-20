/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    
     public double calcularSalarioBase(double salarioPorHora, int horasMes) {
        return salarioPorHora * horasMes;
    }
    
    public double calcularPreparacion(double salarioBase) {
        return salarioBase * 0.20;
    }
    
    public double calcularPrestaciones(double salarioTotal) {
        return salarioTotal * 0.17;
    }
}
