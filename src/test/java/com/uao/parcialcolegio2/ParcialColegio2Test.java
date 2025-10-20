/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.uao.parcialcolegio2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.Calculadora;
import Modelo.Validador;
import Modelo.Estudiantes;
import Modelo.Profesores;

/**
 *
 * @author Usuario
 */
public class ParcialColegio2Test {
    
     @Test
    public void testAgregarYListarEstudiantesYProfesores() {
   
        Validador validador = new Validador();
        Calculadora calculadora = new Calculadora();

     
        Estudiantes estudiante = new Estudiantes( "Laura", "Calle 123", 300123456, 10, "Junio", 2005, 22001, 11);

        assertNotNull(estudiante);
        assertEquals("Laura", estudiante.getNombre());
        assertTrue(validador.validarCodigo(estudiante.getCodigo()));

        String infoEstudiante = estudiante.mostrarInfo();
        assertTrue(infoEstudiante.contains("Laura"));
        assertTrue(infoEstudiante.contains("22001"));

      
        Profesores profesor = new Profesores("Carlos", "Cra 45", 312987654,
                5, "Marzo", 1980, 10203040,"Matemáticas", 50000.0, 160);

        assertNotNull(profesor);
        assertEquals("Carlos", profesor.getNombre());
        assertTrue(validador.validarSalario(profesor.getSalarioPorHora()));
        assertTrue(validador.validarHoras(profesor.getHoras()));

        
        double salarioBase = calculadora.calcularSalarioBase(50000, 160);
        double salarioMensual = profesor.calcularSalarioMensual();
        double prestaciones = profesor.calcularPrestaciones();
        double total = profesor.calcularSalarioTotal();

        assertEquals(salarioBase + salarioBase * 0.20, salarioMensual, 0.001);
        assertEquals(salarioMensual * 0.17, prestaciones, 0.001);
        assertEquals(salarioMensual + prestaciones, total, 0.001);

        String infoProfesor = profesor.mostrarInfo();
        assertTrue(infoProfesor.contains("Carlos"));
        assertTrue(infoProfesor.contains("Matemáticas"));

        
        assertTrue(total > salarioBase);

       
        String listadoSimulado = "1. " + profesor.mostrarInfo();
        assertTrue(listadoSimulado.contains("Carlos"));
        assertTrue(listadoSimulado.contains("Salario Total"));
    }
    
}
