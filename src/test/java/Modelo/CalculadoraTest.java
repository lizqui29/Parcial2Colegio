/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class CalculadoraTest {
    
    @Test
    public void testCalcularSalarioBaseCorrecto() {
        System.out.println("Pruebas del metodo calcularSalarioBase (correcto)");
        Calculadora calc = new Calculadora();
        double resultado = calc.calcularSalarioBase(50000, 100);
        
        assertEquals(5000000, resultado);
    }
    
    @Test
    public void testCalcularPreparacionCorrecto() {
        System.out.println("Pruebas del metodo calcularPreparacion (correcto)");
        Calculadora calc = new Calculadora();
        double resultado = calc.calcularPreparacion(5000000);
        
        assertEquals(1000000, resultado);
    }
    
    @Test
    public void testCalcularPrestacionesCorrecto() {
        System.out.println("Pruebas del metodo calcularPrestaciones (correcto)");
        Calculadora calc = new Calculadora();
        double resultado = calc.calcularPrestaciones(6000000);
        
        double resultado1 = calc.calcularPrestaciones(5000000);
        assertEquals(850000.0, resultado1, 0.01);
        
        double resultado2 = calc.calcularPrestaciones(10000000);
        assertEquals(1700000.0, resultado2, 0.01);
     
                }
    
    
}
